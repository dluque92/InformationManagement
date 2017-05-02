package genetica;
import java.util.*;

public class Gen 
{
	private int codigo;
	private String nombre;	
	
	public static String BD_SERVER = "localhost";
    public static String BD_NAME = "GI";
	
	/**
	 * Devuelve una lista con todos los genes almacenados en la BD.
	 * 
	 * @return la lista con todos los genes almacenados en la BD.
	 */
	public static List<Gen> ListaGenes() 
	{
		BD miBD = new BD(BD_SERVER,BD_NAME);
		List<Gen> res = new ArrayList<Gen>();
		for(Object[] tupla: miBD.Select("SELECT * FROM GEN;")){
			int cod = (int)tupla[0];
			Gen g = new Gen(cod);
			res.add(g);
		}
		// TODO: implementar ListaGenes

		return res;
	}
	
	/**
	 * Lee de la BD los atributos del gen especificado y construye una instancia con dichos valores.
	 * 
	 * @param cod El identificador del gen.
	 */
	public Gen(int cod)
	{	
		BD miBD = new BD(BD_SERVER,BD_NAME);
		for(Object[] tupla: miBD.Select("SELECT * FROM GEN WHERE Codigo = '" + cod + "';")){
			codigo = (int)tupla[0];
			nombre = (String)tupla[1];
		}
		// TODO: implementar constructor Gen (el que lee de la BD)
	}
	
	/**
	 * Inserta en la BD el gen especificado y construye una instancia con los valores especificados.
	 * 
	 * @param cod El identificador del gen.
	 * @param nom El nombre del gen.
	 */
	public Gen(int cod, String nom) // Carga los atributos e inserta el nuevo gen en la BD	
	{
		BD miBD = new BD(BD_SERVER,BD_NAME);
		miBD.Insert("INSERT INTO GEN VALUES('" + cod + "', '" + nom + "');");
		codigo = cod;
		nombre = nom;
		// TODO: implementar constructor Gen (el que inserta en la BD)
	}
	
	
	public String toString()
	{
		return 	codigo  + ";" + nombre;
	}
	
	/**
	 * Actualiza el codigo del gen (tanto en la instancia como en la BD).
	 *  
	 * @param cod El nuevo codigo del gen.
	 */
	public void setCodigo(int cod)
	{
		BD miBD = new BD(BD_SERVER,BD_NAME);
		miBD.Update("UPDATE GEN SET Codigo = '" + cod + "' WHERE Codigo = '" + codigo + "');");
		codigo = cod;
		// TODO: implementar setCodigo
	}

	public int getCodigo() 
	{
		return codigo;
	}

	/**
	 * Actualiza el nombre del gen (tanto en la instancia como en la BD).
	 * 
	 * @param nom El nuevo nombre para el gen
	 */
	public void setNombre(String nom)
	{
		BD miBD = new BD(BD_SERVER,BD_NAME);
		miBD.Update("UPDATE GEN SET Nombre = '" + nom + "' WHERE Codigo = '" + codigo + "');");
		nombre = nom;
		// TODO: Implementar setNombre 
	}

	public String getNombre() 
	{
		return nombre;
	}
	
	/**
	 * Borra el objeto de la base de datos y deja el código a -1
	 */
	public void delete()
	{
		BD miBD = new BD(BD_SERVER,BD_NAME);
		miBD.Delete("DELETE FROM GEN WHERE Codigo ='" + codigo + "';");
		codigo = -1;
		// TODO: Implementar Delete
	}
}
