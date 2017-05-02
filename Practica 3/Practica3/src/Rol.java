import java.util.*;


public class Rol 
{
    private static String BD_SERVER = "localhost";
    private static String BD_NAME = "GI";
    
    private String rolName;
    private String rolDes;
    private boolean admin;
    private List<Permiso> permisos;

	public static List<Rol> ListaRoles()
	{
		BD miBD = new BD(BD_SERVER,BD_NAME);
		ArrayList<Rol> lista = new ArrayList<Rol>(); 
		// Retorna una lista con todos los obejtos de la clase almacenados en la base de datos
		for(Object[] tupla: miBD.Select("SELECT rolName,rolDes,admin FROM tRol;"))
		{
			String rolN = (String)tupla[0];
			String rolD = (String)tupla[1];
			Boolean adm = (boolean)tupla[2];
			Rol r = new Rol(rolN);
			lista.add(r);
		}
		return lista;
	}
	
    public Rol(String name)
    {
		// Crea el objeto cargando sus valores de la base de datos
    	BD miBD = new BD(BD_SERVER,BD_NAME);			
		Object[] tupla = miBD.Select("SELECT * FROM tRol WHERE rolName='"+name+"';").get(0);
		
        rolName = (String)tupla[0];
        rolDes = (String)tupla[1];
        admin = (boolean)tupla[2];
        permisos = Permiso.ListaPermisosRol(rolName);
        
        if (name.compareTo(rolName)!=0)
        {
        	throw new Error("Rol Incorrecto");
        }
    }
    
    public Rol(String name, String des, boolean adm)
    {
		// Crea el objeto y lo inserta en la base de datos
    	BD miBD = new BD(BD_SERVER,BD_NAME);		
    	int i = 0;
    	if(adm)i=1;
    	miBD.Insert("INSERT INTO tRol VALUES("
				+ "'" + name + "', '" + des + "', " + i + ");" );			
	
        rolName = name;
        rolDes = des;
        admin = adm;
    	
    }

    public String getRolName() 
    { 
    	return rolName; 
    }
        
    public void setRolName(String value) 
    { 
		// Actualiza el atributo en memoria y en la base de datos
    	BD miBD = new BD(BD_SERVER,BD_NAME);
    	miBD.Update("UPDATE tRol SET rolName = '" + value 
    			+ "' WHERE rolName ='"+ this.rolName + "';");
    	
    	rolName = value;
    }

    public String getRolDes() 
    { 
    	return rolDes; 
    }
    
    public void setRolDes(String value) 
    {
		// Actualiza el atributo en memoria y en la base de datos
    	BD miBD = new BD(BD_SERVER,BD_NAME);
    	miBD.Update("UPDATE tRol SET rolDes = '" + value 
    			+ "' WHERE rolDes ='"+ this.rolDes + "';");
    	
    	rolDes = value;
    	
    }

    public boolean getAdmin()
    { 
    	return admin; 
    }
    
    public void setAdmin(boolean value)
    {
    	throw new Error("Un Rol no puede concederse permisos de administración a sí mismo.");
    }
    public void setAdmin(Rol other, boolean value)
    {
    	if (!admin) throw new Error("Rol sin permiso para establecer administradores.");
    	
    	int i = 0;
    	if (value) i=1;
    	
		// Actualiza el atributo admin de other en memoria y en la base de datos
    	BD miBD = new BD(BD_SERVER,BD_NAME);
    	miBD.Update("UPDATE tRol SET admin = '" + i 
    			+ "' WHERE rolName ='"+ other.rolName + "';");
    	
    }

    
    public boolean Acceso(String pantalla)
    {
        for (Permiso p : permisos)
        {
            if (p.getPantalla().compareTo(pantalla)==0) return p.getAcceso();
        }
        return false;
    }

    public boolean Modificacion(String pantalla)
    {
        for (Permiso p : permisos)
        {
            if (p.getPantalla().compareTo(pantalla)==0) return p.getModificacion();
        }
        return false;
    }

    public void AddPermiso(Permiso p)
    {
        if (!permisos.contains(p))
        {
            permisos.add(p);
        }
    }
    
}
