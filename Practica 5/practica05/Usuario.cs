using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using BDLibrary;

namespace practica05
{
    public class Usuario
    {
        private static string BD_SERVER = "localhost";
        private static string BD_NAME = "GI";

        private string nombre;
        private string password;
        private Rol rol;


	public static List<Usuario> ListaUsuarios()
	{
		List<Usuario> lista = new List<Usuario>();
        SQLSERVERDB miBD = new SQLSERVERDB(BD_SERVER, BD_NAME);
        foreach (object[] tupla in miBD.Select("SELECT nombre,password FROM tUsuario;"))
		{
            string id = (string)tupla[0];
            string p = (string)tupla[1];
			Usuario u = new Usuario(id,p);
			lista.Add(u);
		}
		return lista;
	}

    public Usuario(string n, string p)
    {
        SQLSERVERDB miBD = new SQLSERVERDB(BD_SERVER, BD_NAME);
        object[] tupla = miBD.Select("SELECT * FROM tUsuario WHERE nombre='" + n + "';")[0];

        nombre = (string)tupla[0];
        password = (string)tupla[1];

        if (p.CompareTo(password) != 0)
        {
            nombre = password = "";
            throw new Error("Usuario o Contraseña Incorrecta");
        }
        rol = new Rol((string)tupla[2]);        
    }

    public Usuario(string n, string p, Rol r)
    {
        SQLSERVERDB miBD = new SQLSERVERDB(BD_SERVER, BD_NAME);
    	 	
    	miBD.Insert("INSERT INTO tUsuario VALUES("
				+ "'" + n + "', '" + p + "', '" + r.RolName + "');" );			
	    nombre = n;
        password = p;
        rol = r;
    }

        public string Nombre
        {
            get { return nombre; }
            set {
                SQLSERVERDB miBD = new SQLSERVERDB(BD_SERVER, BD_NAME);
                    miBD.Update("UPDATE tUsuario SET nombre = '" + value
                        + "' WHERE nombre ='" + this.nombre + "';");
                    nombre = value; 
                }
        }

        public string Password
        {
            get { return password; }
            set {
                SQLSERVERDB miBD = new SQLSERVERDB(BD_SERVER, BD_NAME);
                    miBD.Update("UPDATE tUsuario SET password = '" + value
                            + "' WHERE nombre ='" + this.nombre + "';");

                    password = value; 
                }
        }

        public Rol MyRol
        {
            get { return rol; }
        }

        public void ModiRol(Usuario u, Rol r)
        {
            if (!this.rol.Admin) throw new Error("El usuario " + this.Nombre + " no puede cambiar el rol del usuario " + u.Nombre);

            SQLSERVERDB miBD = new SQLSERVERDB(BD_SERVER, BD_NAME);
            miBD.Update("UPDATE tUsuario SET rolName = '" + r.RolName
                    + "' WHERE nombre ='" + u.Nombre + "';");

            u.rol = r;
        }

        public void Borrar(Usuario u)
        {
            if (!this.rol.Admin) throw new Error("El usuario " + this.Nombre + " no puede eliminar al usuario " + u.Nombre);

            SQLSERVERDB miBD = new SQLSERVERDB(BD_SERVER, BD_NAME);
            miBD.Delete("DELETE FROM tUsuario WHERE nombre = '" + u.nombre + "' AND password ='" + u.password + "';");
        }


        public bool AccesoPantalla(string p)
        {
            return rol.Acceso(p);
        }

        public bool ModificaPantalla(string p)
        {
            return rol.Modificacion(p);
        }

    }
}
