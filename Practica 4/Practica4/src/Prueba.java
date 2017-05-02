
import java.util.*;
import java.text.SimpleDateFormat;

import javax.print.attribute.standard.DateTimeAtCreation;

import microsoft.sql.DateTimeOffset;

public class Prueba
{
	    private static String BD_SERVER = "localhost";
	    private static String BD_NAME = "GI";
	
	    private int ID;
	    private int NumSS;
	    private Date Fecha;
	    private float Valor;

        public static List<Prueba> ListaPruebas(int nSS)
        {
        	BD miBD = new BD(BD_SERVER,BD_NAME);
            List<Prueba> lista = new ArrayList<Prueba>();
            for(Object[] tupla: miBD.Select("SELECT * FROM tGlucometria WHERE NumSS = "+nSS+";;")){
            	int ID = (int)tupla[0];
            	int numSS = (int)tupla[1];
            	Date d = (Date)tupla[2];
            	float v = (float)tupla[3];
            	Prueba p = new Prueba(ID);
            	lista.add(p);
    		}

            return lista;
        }

        public Prueba(int id)
        {
        	// Crea el objeto cargando sus valores de la base de datos
        	BD miBD = new BD(BD_SERVER,BD_NAME);			
    		Object[] tupla = miBD.Select("SELECT * FROM tGlucometria WHERE ID = "+id+";").get(0);
    		ID = (int)tupla[0];
    		NumSS = (int)tupla[1];
    		Fecha = (Date)tupla[2];
    		Valor = (float)tupla[3];

         }

	public Prueba(int ID_Paciente, Date Fecha, float Valor)
         {
		// Crea el objeto y lo inserta en la base de datos
    		BD miBD = new BD(BD_SERVER,BD_NAME);		
    		ID = nuevoID();
    		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
            String DateToStr = format.format(Fecha);
    		miBD.Insert("INSERT INTO tGlucometria VALUES("+ "" + ID + ", " + ID_Paciente + ", '" + DateToStr + "', '" + Valor + "');" );
	    	
			NumSS = ID_Paciente;
			this.Fecha = Fecha;
			this.Valor = Valor;
         }

         private int nuevoID()
         {
        	 BD miBD = new BD(BD_SERVER,BD_NAME);
             return 1 + (int)miBD.SelectEscalar("SELECT MAX(ID) FROM tGlucometria;");
         }

         public int getIDPrueba()
         {
             return ID; 
             // No se permite cambiar el ID de una prueba
         }

         public int getPacientePrueba()
         {
             return NumSS; 
             // No se permite cambiar el paciente de una prueba
         }

         public Date getFechaPrueba()
         {
             return Fecha; 
         }
             
         public void setFechaPrueba(Date value)             
         {
        	 BD miBD = new BD(BD_SERVER,BD_NAME);
        	 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
             String DateToStr = format.format(value);
         		miBD.Update("UPDATE tGlucometria SET Fecha_Horal = '" + DateToStr 
         			+ "' WHERE NumSS='" + this.NumSS + "';");
         	
         	Fecha = value;
         }


	public double getValorPrueba()
        {
             return Valor; 
        }
        
	public void setValorPrueba(float value)
        {
		BD miBD = new BD(BD_SERVER,BD_NAME);
    		miBD.Update("UPDATE tGlucometria SET Valor = '" + value 
    			+ "' WHERE NumSS='" + this.NumSS + "';");
    	
    	Valor = value;
         }

         public void BorraPrueba()
         {
        	 BD miBD = new BD(BD_SERVER,BD_NAME);
         	miBD.Delete("DELETE FROM tGlucometria WHERE numSS='"+NumSS+"';" );	
         }
         
         public String toString()
         {
        	 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
             String DateToStr = format.format(Fecha);
             
        	 return DateToStr + " / " + Valor + " / " + ValoresGlucometria.NombreValorGlucometria(Valor) ;
         }
}
