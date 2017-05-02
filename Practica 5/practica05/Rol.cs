using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using BDLibrary;

namespace practica05
{
    public class Rol
    {
        private static string BD_SERVER = "localhost";
        private static string BD_NAME = "GI";

        private string rolName;
        private string rolDes;
        private bool admin;

        private List<Permiso> permisos;

        public static List<Rol> ListaRoles()
	    {
		    List<Rol> lista = new List<Rol>();
            SQLSERVERDB miBD = new SQLSERVERDB(BD_SERVER, BD_NAME);
            foreach (object[] tupla in miBD.Select("SELECT * FROM tRol;"))
            {
                string n = (string)tupla[0];
                Rol r = new Rol(n);
                lista.Add(r);
            }
		    return lista;
	    }

        public Rol(string name)
        {
            SQLSERVERDB miBD = new SQLSERVERDB(BD_SERVER, BD_NAME);
            object[] tupla = miBD.Select("SELECT * FROM tRol WHERE rolName='" + name + "';")[0];
            rolName = (String)tupla[0];
            rolDes = (String)tupla[1];
            admin = (bool)tupla[2];
            permisos = Permiso.ListaPermisosRol(name);
        }
    
        public Rol(string name, string des, bool adm)
        {

            int iadmin = 0;
            if (adm) iadmin = 1;

            SQLSERVERDB miBD = new SQLSERVERDB(BD_SERVER, BD_NAME);

            miBD.Insert("INSERT INTO tRol VALUES("
                    + "'" + name + "', '" + des + "', " + iadmin + ");");
            rolName = name;
            rolDes = des;
            admin = adm;
        }

        public string RolName
        {
            get { return rolName; }
            set {
                SQLSERVERDB miBD = new SQLSERVERDB(BD_SERVER, BD_NAME);
                miBD.Update("UPDATE tRol SET rolName = '" + value
                    + "' WHERE rolName ='" + this.rolName + "';");
                rolName = value; 
                }
        }

        public string RolDes
        {
            get { return rolDes; }
            set {
                SQLSERVERDB miBD = new SQLSERVERDB(BD_SERVER, BD_NAME);
                miBD.Update("UPDATE tRol SET rolDes = '" + value
                    + "' WHERE rolName ='" + this.rolName + "';");
                rolDes = value; 
                }
        }

        public bool Admin
        {
            get { return admin; }
        }

        public void setAdmin(Rol other, bool value)
        {
            if (!admin) throw new Error("Rol sin permiso para establecer administradores.");

            int i = 0;
            if (value) i = 1;

             SQLSERVERDB miBD = new SQLSERVERDB(BD_SERVER, BD_NAME);
                miBD.Update("UPDATE tRol SET admin = " + i
                    + " WHERE rolName ='" + other.rolName + "';");
                other.admin = value; 

        }

        public bool Acceso(string pantalla)
        {
            foreach (Permiso p in permisos)
            {
                if (p.Pantalla.Equals(pantalla)) return p.Acceso;
            }
            return false;
        }

        public bool Modificacion(string pantalla)
        {
            foreach (Permiso p in permisos)
            {
                if (p.Pantalla.Equals(pantalla)) return p.Modificacion;
            }
            return false;
        }

        public void AddPermiso(Permiso p)
        {
            if (!permisos.Contains(p))
            {
                permisos.Add(p);
            }
        }

        public override string ToString()
        {
            return rolName;
        }
    }
}
