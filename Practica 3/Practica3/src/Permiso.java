import java.util.*;


public class Permiso 
{
    private static String BD_SERVER = "localhost";
    private static String BD_NAME = "GI";
    
	private String rolName;
	private String pantalla;
    private boolean acceso;
    private boolean modificacion;


    public static List<Permiso> ListaPermisosRol(String rolName)
    {
    	BD miBD = new BD(BD_SERVER,BD_NAME);
		ArrayList<Permiso> lista = new ArrayList<Permiso>(); 		
		// Retorna una lista con todos los obejtos de la clase almacenados en la base de datos
		for(Object[] tupla: miBD.Select("SELECT rolName,pantalla,acceso,modificacion FROM tPermiso WHERE rolName='"+rolName+"';"))
		{
			String rolN = (String)tupla[0];
			String p = (String)tupla[1];
			boolean acc = (boolean)tupla[2];
			boolean mod = (boolean)tupla[3];
			Permiso per = new Permiso(rolN,p);
			lista.add(per);
		}
		return lista;
    }
    
    public Permiso(String r, String p)
    {
		// Crea el objeto cargando sus valores de la base de datos
    	BD miBD = new BD(BD_SERVER,BD_NAME);			
		Object[] tupla = miBD.Select("SELECT * FROM tPermiso WHERE rolName='"+r+"' AND pantalla='"+p+"';").get(0);
		
        rolName = (String)tupla[0];
        pantalla = (String)tupla[1];
        acceso = (boolean)tupla[2];
        modificacion = (boolean)tupla[3];
        
        if (p.compareTo(pantalla)!=0)
        {
        	rolName= pantalla = "";
        	throw new Error("Rol o Pantalla Incorrecta");
        }
    }

    public Permiso(String r, String p, boolean a, boolean m)
    {
    	int iA=0,iM=0;
    	
    	if (a) iA=1;
    	if (m) iM = 1;
    	
		// Crea el objeto y lo inserta en la base de datos
    	
    	BD miBD = new BD(BD_SERVER,BD_NAME);		
    	
    	miBD.Insert("INSERT INTO tPermiso VALUES("
				+ "'" + r + "', '" + p + "', " + iA +  ", " + iM + ");" );			
	
        rolName = r;
        pantalla = p;
        acceso = a;
        modificacion = m;
    }
    
	public void setRolName(String value) 
	{
		BD miBD = new BD(BD_SERVER,BD_NAME);
		
		miBD.Update("UPDATE tPermiso SET rolName = '"+ value 
				+ "' WHERE rolName='"+ this.rolName + "';");
		this.rolName = value;
	}

	public String getRolName() 
	{
		return rolName;
	}
    
    public String getPantalla() 
    {
    	return pantalla; 
    }
    
    public void setPantalla(String value) 
    {
		// Actualiza el atributo en memoria y en la base de datos
    	BD miBD = new BD(BD_SERVER,BD_NAME);
    	miBD.Update("UPDATE tPermiso SET pantalla = '" + value 
    			+ "' WHERE rolName ='"+ this.rolName + " AND pantalla = '" + this.pantalla +"';");
    	
    	pantalla = value;
    }
    

    public boolean getAcceso() 
    { 
    	return acceso; 
    }
        
    public void setAcceso(boolean value) 
    { 
    	int iA =0;
    	if (value) iA=1;
    	
		// Actualiza el atributo en memoria y en la base de datos
    	BD miBD = new BD(BD_SERVER,BD_NAME);
    	miBD.Update("UPDATE tPermiso SET acceso = '" + iA 
    			+ "' WHERE rolName ='"+ this.rolName + " AND pantalla = '" + this.pantalla +"';");
    	
    	acceso = value;
    }

    
    public boolean getModificacion() 
    { 
    	return modificacion; 
    }
    
    public void setModificacion(boolean value) 
    { 
    	int iM =0;
    	if (value) iM=1;
    	
		// Actualiza el atributo en memoria y en la base de datos
    	BD miBD = new BD(BD_SERVER,BD_NAME);
    	miBD.Update("UPDATE tPermiso SET acceso = '" + iM 
    			+ "' WHERE rolName ='"+ this.rolName + " AND pantalla = '" + this.pantalla +"';");
    	
    	modificacion = value;
    }


}
