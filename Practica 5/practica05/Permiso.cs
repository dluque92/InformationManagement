using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using BDLibrary;

namespace practica05
{
    public class Permiso
    {

        private static string BD_SERVER = "localhost";
        private static string BD_NAME = "GI";

        private string rolName;
        private string pantalla;
        private bool acceso;
        private bool modificacion;


        public static List<Permiso> ListaPermisosRol(string rolName)
        {
		    List<Permiso> lista = new List<Permiso>();
            SQLSERVERDB miBD = new SQLSERVERDB(BD_SERVER, BD_NAME);
            foreach (object[] tupla in miBD.Select("SELECT pantalla FROM tPermiso WHERE rolName='" + rolName + "';"))
            {
                string p = (string)tupla[0];
                Permiso per = new Permiso(rolName, p);
                lista.Add(per);
            }
		    return lista;
        }

        public Permiso(String r, String p)
        {
            SQLSERVERDB miBD = new SQLSERVERDB(BD_SERVER, BD_NAME);
            object[] tupla = miBD.Select("SELECT * FROM tPermiso WHERE rolName='" + r + "' AND pantalla='" + p +"';")[0];
            rolName = (String)tupla[0];
            pantalla = (String)tupla[1];
            acceso = (bool)tupla[2];
            modificacion = (bool)tupla[3];

        }

        public Permiso(string r, string p, bool a, bool m)
        {
            int iA = 0, iM = 0;

            if (a) iA = 1;
            if (m) iM = 1;

            SQLSERVERDB miBD = new SQLSERVERDB(BD_SERVER, BD_NAME);

            miBD.Insert("INSERT INTO tPermiso VALUES("
                    + "'" + r + "', '" + p + "', " + iA + ", "+ iM + ");");
            rolName = r;
            pantalla = p;
            acceso = a;
            modificacion = m;
        }

        public string RolName
        {
            get { return rolName; }
            set
            {
                SQLSERVERDB miBD = new SQLSERVERDB(BD_SERVER, BD_NAME);
                miBD.Update("UPDATE tPermiso SET rolName = '" + value
                    + "' WHERE rolName ='" + this.rolName + "' AND pantalla ='" + this.pantalla + "';");
                rolName = value; 
            }
        }

        public string Pantalla
        {
            get { return pantalla; }
            set
            {
                SQLSERVERDB miBD = new SQLSERVERDB(BD_SERVER, BD_NAME);
                miBD.Update("UPDATE tPermiso SET pantalla = '" + value
                    + "' WHERE rolName ='" + this.rolName + "' AND pantalla ='" + this.pantalla + "';");
                pantalla = value; 
            }
        }

        public bool Acceso
        {
            get { return acceso; }
            set {
                    int iA = 0;
                    if (value) iA = 1;

                    SQLSERVERDB miBD = new SQLSERVERDB(BD_SERVER, BD_NAME);
                    miBD.Update("UPDATE tPermiso SET acceso = " + iA
                        + " WHERE rolName ='" + this.rolName + "' AND pantalla ='" + this.pantalla + "';");
                    acceso = value; 

                }
        }

        public bool Modificacion
        {
            get { return modificacion; }
            set {
                    int iM = 0;
                    if (value) iM = 1;

                    SQLSERVERDB miBD = new SQLSERVERDB(BD_SERVER, BD_NAME);
                    miBD.Update("UPDATE tPermiso SET modificacion = " + iM
                        + " WHERE rolName ='" + this.rolName + "' AND pantalla ='" + this.pantalla + "';");
                    modificacion = value; 
                }
        }

    }
}
