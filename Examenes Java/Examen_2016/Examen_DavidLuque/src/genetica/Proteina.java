package genetica;

import java.util.*;

public class Proteina 
{
	private String codigo;
	private Gen gen;
	private String nombre;
	private int longitudSecuencia;
	private String secuencia;
	private String estado;
	private String funcion;	
	
	public static String BD_SERVER = "localhost";
    public static String BD_NAME = "GI";
	
	/**
	 * Devuelve una lista con todas las proteinas almacenadas en la BD.
	 * 
	 * @return la lista con todas las proteinas almacenadas en la BD.
	 */
	public static List<Proteina> ListaProteinas()// Devuelve una Lista con todos las proteinas almacenadas en la BD
	{
		BD miBD = new BD(BD_SERVER,BD_NAME);
		List<Proteina> res = new ArrayList<Proteina>();
		for(Object[] tupla: miBD.Select("SELECT * FROM PROTEINA;")){
			String codi = (String)tupla[0];
			Proteina p = new Proteina(codi);
			res.add(p);
		}
		// TODO: Completar ListaProteinas
		return res;
	}
	
	/**
	 * Lee de la BD todos los atributos de la proteina indicada y construye una instancia con los mismos.
	 * 
	 * @param co El codigo de la proteina.
	 */
	public Proteina(String co)// Carga los atributos de la BD
	{
		BD miBD = new BD(BD_SERVER,BD_NAME);
		for(Object[] tupla: miBD.Select("SELECT * FROM PROTEINA WHERE Codigo = '" + co + "';")){
			codigo = (String)tupla[0];
			gen = new Gen((int)tupla[1]);
			nombre = (String)tupla[2];
			longitudSecuencia = (int)tupla[3];
			secuencia = (String)tupla[4];
			estado = (String)tupla[5];
			funcion = (String)tupla[6];
		}
		// TODO: Implementar constructor Proteina (el que lee de la BD).
	}
	
	/**
	 * Inserta en la BD una proteina con los atributos especificados y construye una instancia con los mismos.
	 * 
	 * @param co El codigo de la proteina 
	 * @param g El gen al que pretenece
	 * @param n El nombre de la proteina
	 * @param l La longitud de la secuencia de la proteina
	 * @param s La secuencia de la proteina
	 * @param e El estado de la proteina
	 * @param f La funcion de la proteina
	 */
	public Proteina(String co, Gen g, String n, int l, String s, String e, String f)// Carga los atributos e inserta la nueva proteina en la BD	
	{
		BD miBD = new BD(BD_SERVER,BD_NAME);
		miBD.Insert("INSERT INTO PROTEINA VALUES('" + co + "','"+ g.getCodigo() + "','" + n + "','" + l + "','" + s +"','" + e + "','" + f + "'); ");
		codigo = co;
		gen = g;
		nombre = n;
		longitudSecuencia = l;
		secuencia = s;
		estado = e;
		funcion = f;
		// TODO: Implementar constructor Proteina (el que inserta en la BD).
	}
	
	/**
	 * Actualiza el codigo de la proteina, tanto en la instancia como en la BD. 
	 * 
	 * @param c El nuevo codigo de la proteina.
	 */
	public void setCodigo(String c)
	{
		BD miBD = new BD(BD_SERVER,BD_NAME);
		miBD.Update("UPDATE PROTEINA SET Codigo = '" + c + "' WHERE Codigo = '" + codigo + "');");
		codigo = c;
		// TODO: Implementar setCodigo
	}

	public String getCODIGO() 
	{
		return codigo;
	}
	
	/**
	 * Actualiza el gen al que pertenece la proteina, tanto en la instancia como en la BD. 
	 * 
	 * @param g El nuevo gen al que pertenece la proteina.
	 */	
	public void setGen(Gen g)
	{
		BD miBD = new BD(BD_SERVER,BD_NAME);
		miBD.Update("UPDATE PROTEINA SET CodigoGen = '" + g.getCodigo() + "' WHERE Codigo = '" + codigo + "');");
		gen = g;
		// TODO: Implementar setGen
	}

	public Gen getGen() 
	{
		return gen;
	}

	/**
	 * Actualiza el nombre de la proteina, tanto en la instancia como en la BD. 
	 * 
	 * @param n El nuevo nombre de la proteina.
	 */	
	public void setNombre(String n)
	{
		BD miBD = new BD(BD_SERVER,BD_NAME);
		miBD.Update("UPDATE PROTEINA SET Nombre = '" + n + "' WHERE Codigo = '" + codigo + "');");
		nombre = n;
		// TODO: Implementar setNombtr
	}

	public String getNOMBRE() 
	{
		return nombre;
	}
	
	/**
	 * Actualiza la secuencia de la proteina, tanto en la instancia como en la BD. 
	 * 
	 * @param s La nueva secuencia de la proteina.
	 */	
	public void setSecuencia(String s)
	{
		BD miBD = new BD(BD_SERVER,BD_NAME);
		miBD.Update("UPDATE PROTEINA SET Secuencia = '" + s + "' WHERE Codigo = '" + codigo + "');");
		secuencia = s;
		// TODO: Implementar setSecuencia
	}
	
	public String getSecuencia() 
	{
		return secuencia;
	}
	
	/**
	 * Actualiza el estado de la proteina, tanto en la instancia como en la BD. 
	 * 
	 * @param e El nuevo estado de la proteina.
	 */	
	public void setEstado(String e) 
	{
		BD miBD = new BD(BD_SERVER,BD_NAME);
		miBD.Update("UPDATE PROTEINA SET Estado = '" + e + "' WHERE Codigo = '" + codigo + "');");
		estado = e;
		// TODO: Implementar setEstado
	}
	
	public String getEstado() 
	{
		return estado;
	}
	
	/**
	 * Actualiza la funcion de la proteina, tanto en la instancia como en la BD. 
	 * 
	 * @param f La nueva funcion de la proteina.
	 */	
	public void setFuncion(String f)
	{
		BD miBD = new BD(BD_SERVER,BD_NAME);
		miBD.Update("UPDATE PROTEINA SET Funcion = '" + f + "' WHERE Codigo = '" + codigo + "');");
		funcion = f;
		// TODO: Implementar setFuncion
	}
	
	public String getFuncion() 
	{
		return funcion;
	}

	/**
	 * Actualiza la longitud de secuencia de la proteina, tanto en la instancia como en la BD. 
	 * 
	 * @param l La nueva longitud de la secuencia de la proteina.
	 */	
	public void setLongitudSecuencia(int l) //Actualiza el atributo y la BD
	{
		BD miBD = new BD(BD_SERVER,BD_NAME);
		miBD.Update("UPDATE PROTEINA SET LongitudSecuencia = '" + l + "' WHERE Codigo = '" + codigo + "');");
		longitudSecuencia = l;
		// TODO: Implementar setLongitudSecuencia
	}

	public int getLongitudSecuencia() 
	{
		return longitudSecuencia;
	}
	
	/**
	 * Elimina la proteina de la BD y deja el codigo como un string de longitud 0 ("")
	 */
	public void delete()
	{
		BD miBD = new BD(BD_SERVER,BD_NAME);
		miBD.Delete("DELETE FROM PROTEINA WHERE Codigo ='" + codigo + "';");
		codigo = "";
		// TODO: Implementar delete
	}
	
	public String toString()
	{
		return codigo + ";"
			+ gen.getCodigo() + ";"
			+ nombre + ";"
			+ longitudSecuencia + ";"
			+ secuencia + ";"
			+ estado  + ";"
			+ funcion  + ";";
	}

}
