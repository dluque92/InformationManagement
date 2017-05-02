import java.util.*;

public class Pais
{
    private static String BD_SERVER = "localhost";
    private static String BD_NAME = "GI";
    
    private String cod;
    private String des;

        public static List<Pais> ListaPaises()
        {
        	BD miBD = new BD(BD_SERVER,BD_NAME);
        	List<Pais> lista = new ArrayList<Pais>();
        	for(Object[] tupla: miBD.Select("SELECT * FROM tPais;")){
        		String cod = (String)tupla[0];
        		String des = (String)tupla[1];
        		Pais p = new Pais(cod);
        		lista.add(p);
        	}
            	return lista;
        }

        public Pais(String cod)
        {
        	// Crea el objeto cargando sus valores de la base de datos
        	BD miBD = new BD(BD_SERVER,BD_NAME);			
    		Object[] tupla = miBD.Select("SELECT * FROM tPais WHERE Codigo='"+cod+"';").get(0);
    		this.cod = (String)tupla[0];
    		this.des = (String)tupla[1];
        }

        public Pais(String cod, String des)
        {
        	// Crea el objeto y lo inserta en la base de datos
        	BD miBD = new BD(BD_SERVER,BD_NAME);		
        	
        	miBD.Insert("INSERT INTO tPais VALUES("+ "'" + cod + "', '" + des + "');" );
        	this.cod = cod;
        	this.des = des;

        }

        public String getCodigo()
        {
            return cod; 
        }
        
        public void setCodigo(String value)
        {
        	BD miBD = new BD(BD_SERVER,BD_NAME);
        	miBD.Update("UPDATE tPais SET Codigo = '" + value 
        			+ "' WHERE Codigo='" + this.cod + "';");
        	
        	this.cod = value;
        }

        public String getDescripcion()
        {
            return des; 
        }

        public void setDescripcion(String value)            
        {            	
        	BD miBD = new BD(BD_SERVER,BD_NAME);
        	miBD.Update("UPDATE tPais SET Descripcion = '" + value 
        			+ "' WHERE Descripcion='" + this.des + "';");
        	
        	this.des = value;

        }

        public String toString()
        {
            return des;
        }
}
