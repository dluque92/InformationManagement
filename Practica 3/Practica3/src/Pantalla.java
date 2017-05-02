import java.util.*;

public class Pantalla 
{
    private static String BD_SERVER = "localhost";
    private static String BD_NAME = "GI";
    
	private String pantalla;


    public static List<Pantalla> ListaPantalla()
    {
    	BD miBD = new BD(BD_SERVER,BD_NAME);
		ArrayList<Pantalla> lista = new ArrayList<Pantalla>(); 		
		// Retorna una lista con todos los obejtos de la clase almacenados en la base de datos
		for(Object[] tupla: miBD.Select("SELECT rolName,pantalla,acceso,modificacion FROM tPermiso;"))
		{
			String p = (String)tupla[0];
			Pantalla pan = new Pantalla(p);
			lista.add(pan);
		}
		return lista;
    }
    
    public Pantalla(String p)
    {
	// Crea el objeto cargando sus valores de la base de datos. Si no existe lo inserta

    	BD miBD = new BD(BD_SERVER,BD_NAME);
    	
		int num= (Integer) miBD.SelectEscalar("SELECT COUNT(*) FROM tPantalla WHERE pantalla ='"+ p + "';");
		if (num==0)
			miBD.Insert("INSERT INTO tPantalla VALUES ('" + p +"');"); 
		
        pantalla = p;        
    }
    
	public void setPantalla(String value) 
	{
		// Actualiza el atributo en memoria y en la base de datos
    	BD miBD = new BD(BD_SERVER,BD_NAME);
    	miBD.Update("UPDATE tPantalla SET pantalla = '" + value 
    			+ "' WHERE pantalla ='"+ this.pantalla +"';");
    	
    	pantalla = value;
	}

	public String getPantalla() 
	{
		return pantalla;
	}    

}
