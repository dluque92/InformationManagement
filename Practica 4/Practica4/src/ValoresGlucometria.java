import java.util.*;

public class ValoresGlucometria
{
    private static String BD_SERVER = "localhost";
    private static String BD_NAME = "GI";
    
	private String Nombre;
	private float ValorMinimo;
	private float ValorMaximo;


        public static List<ValoresGlucometria> ListaValoresGlucometria()
        {
        	BD miBD = new BD(BD_SERVER,BD_NAME);
        	List<ValoresGlucometria> lista = new ArrayList<ValoresGlucometria>();
        	for(Object[] tupla: miBD.Select("SELECT * FROM tValoresGlucometria;"))
    		{
        		String nombre = (String)tupla[0];
        		float valorMin = (float)tupla[1];
        		float valorMax = (float)tupla[2];
        		ValoresGlucometria vg = new ValoresGlucometria(nombre);
        		lista.add(vg);
    		}
            return lista;
        }

        public static String NombreValorGlucometria(float val)
        {
        	String valor = "";
        	for(ValoresGlucometria vg :ListaValoresGlucometria()){
        		if(vg.ValorMinimo < val && val <= vg.ValorMaximo){
        			valor += vg.Nombre;
        		}
        	}
        	return valor;
        }
        
        public ValoresGlucometria(String id)
        {
        	// Crea el objeto cargando sus valores de la base de datos
        	BD miBD = new BD(BD_SERVER,BD_NAME);			
    		Object[] tupla = miBD.Select("SELECT * FROM tValoresGlucometria WHERE Nombre='"+id+"';").get(0);
    		Nombre = (String)tupla[0];
    		ValorMinimo = (float)tupla[1];
    		ValorMaximo = (float)tupla[2];
        }

        public ValoresGlucometria(String n, float min, float max)
        {
        	BD miBD = new BD(BD_SERVER,BD_NAME);			
        	miBD.Insert("INSERT INTO tValoresGlucometria VALUES("+ "'" + n + "', '" + min + "', '" + max + "');" );
    		Nombre = n;
    		ValorMinimo = min;
    		ValorMaximo = max;
        }

        public String getNombre()
        {
        	return Nombre;
        }

        public void setNombre(String value)
        {
        	BD miBD = new BD(BD_SERVER,BD_NAME);
        	miBD.Update("UPDATE tValoresGlucometria SET Nombre = '" + value 
        			+ "' WHERE Nombre='" + Nombre + "';");
        	
        	Nombre = value;
        }
        
        
        public double getValorMinimo()
        {
        	return ValorMinimo;
        }
        
        public void setValorMinimo(float value)
        {
        	BD miBD = new BD(BD_SERVER,BD_NAME);
        	miBD.Update("UPDATE tValoresGlucometria SET ValorMinimo = '" + value 
        			+ "' WHERE ValorMinimo='" + Nombre + "';");
        	
        	ValorMinimo = value;
        }
        
        
        public double getValorMaximo()
        {
        	return ValorMaximo;
        }
        
        public void setValorMaximo(float value)
        {
        	BD miBD = new BD(BD_SERVER,BD_NAME);
        	miBD.Update("UPDATE tValoresGlucometria SET ValorMaximo = '" + value 
        			+ "' WHERE ValorMaximo='" + Nombre + "';");
        	
        	ValorMaximo = value;
        }
        
        public String toString()
        {
            return Nombre;
        }
}
