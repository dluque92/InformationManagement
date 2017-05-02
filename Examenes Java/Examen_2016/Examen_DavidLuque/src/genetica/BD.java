package genetica;


import java.sql.*;
import com.microsoft.sqlserver.jdbc.*;
import java.util.*;

public class BD 
{
    public static String BD_SERVER = "localhost";
    public static String BD_NAME = "GI";

	private SQLServerDataSource ds;
	private Connection con ;	
	
	public BD() {
		this(BD_SERVER, BD_NAME);
	}
	
	public BD(String server, String databaseName)
	{
		try
		{
			ds = new SQLServerDataSource();
			ds.setIntegratedSecurity(true);
			ds.setServerName(server);
			ds.setPortNumber(1433); 
			ds.setDatabaseName(databaseName);
			con = ds.getConnection();
		}
		catch (SQLException ex)
		{
			throw new BDException("Error al conectar con la base de datos", ex);
		}
	}
	
	protected void finalize () 
	{
		try
		{
			if (con!=null)  con.close();
		}
		catch (SQLException ex)
		{
			throw new BDException("Error al cerrar la conexion", ex);
		}
    }
	
	public Object SelectEscalar(String sel)
	{
		ResultSet rset;
		Object res = null;
		try
		{
			Statement stmt = con.createStatement();
			rset = stmt.executeQuery(sel);
			rset.next();
			res = rset.getObject(1);
			rset.close();
			stmt.close();
		}
		catch (SQLException ex)
		{
			throw new BDException("Error en el SELECT: " + sel, ex);
		}		
		
		return res;
	}
	
	public List<Object[]> Select(String sel)
	{
		ResultSet rset;
		List<Object[]> lista = new ArrayList<Object[]>();
		try
		{
			Statement stmt = con.createStatement();
			rset = stmt.executeQuery(sel);
			ResultSetMetaData meta = rset.getMetaData();
			int numCol = meta.getColumnCount();
			while (rset.next())
			{
				Object[] tupla = new Object[numCol];
				for(int i=0; i<numCol;++i)
				{
					tupla[i] = rset.getObject(i+1);
				}
				lista.add(tupla);
			}
			rset.close();
			stmt.close();
		}
		catch (SQLException ex)
		{
			throw new BDException("Error en el SELECT: " + sel, ex);
		}		
		
		return lista;
	}
	
	public void Insert(String ins)
	{
		try
		{
			Statement stmt = con.createStatement();
			stmt.execute(ins);
			stmt.close();
		}
		catch (SQLException ex)
		{
			throw new BDException("Error en el INSERT: " + ins, ex);
		}
	}

	public void Delete(String del)
	{
		try
		{
			Statement stmt = con.createStatement();
			stmt.execute(del);
			stmt.close();
		}
		catch (SQLException ex)
		{
			throw new BDException("Error en el DELETE: " + del, ex);
		}
	}

	public void Update(String up)
	{
		try
		{
			Statement stmt = con.createStatement();
			stmt.execute(up);
			stmt.close();
		}
		catch (SQLException ex)
		{
			throw new BDException("Error en el UPDATE: " + up, ex);
		}
	}

}
