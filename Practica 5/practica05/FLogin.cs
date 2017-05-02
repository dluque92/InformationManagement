using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace practica05
{
    public partial class LOGIN : Form
    {
        private Usuario user;

        public LOGIN()
        {
            InitializeComponent();
            ocultar_botones();
        }

        private void bExit_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void salirToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void bLogin_Click(object sender, EventArgs e)
        {
            try
            {
                String usuario = tUser.Text;
                String clave = tPwd.Text;
                user = new Usuario(usuario, clave);
                activa_botones();
            }
            catch (Exception ex)
            {
                MessageBox.Show("Error: " + ex.Message);
            }
        }

        private void ocultar_botones()
        {
            label1.Visible = true;
            label2.Visible = true;
            tUser.Visible = true;
            tPwd.Visible = true;
            bLogin.Visible = true;
            bUSUARIOS.Visible = false;
            bPACIENTES.Visible = false;
            bPRUEBAS.Visible = false;
            foreach (ToolStripItem i in menuStrip1.Items) i.Visible = false;
        }

        private void activa_botones()
        {
            label1.Visible = false;
            label2.Visible = false;
            tUser.Visible = false;
            tPwd.Visible = false;
            bLogin.Visible = false;

            bUSUARIOS.Visible = true;
            bPACIENTES.Visible = true;
            bPRUEBAS.Visible = true;

            foreach (Control c in this.Controls)
            {
                if (c is Button)
                {
                    Button b = (Button)c;
                    string pantalla = b.Name.Substring(1).ToUpper();
                    if (pantalla.Equals("EXIT")) b.Enabled = true;
                    else if (!user.AccesoPantalla(pantalla)) b.Enabled = false;
                    else                                     b.Enabled = true;
                }
            }
            foreach (ToolStripItem i in menuStrip1.Items)
            {
                i.Visible = true;
                string name = i.Text.ToUpper();
                if (name.Equals("CERRAR SESION") || name.Equals("SALIR")) i.Enabled = true;
                else if (!user.AccesoPantalla(name)) i.Enabled = false;
                else                                 i.Enabled = true;
            }
        }

        private void usuariosToolStripMenuItem_Click(object sender, EventArgs e)
        {
            lanzar_ventana_usuarios();
        }

        private void cerrarSesionToolStripMenuItem_Click(object sender, EventArgs e)
        {
            user = null;
            tUser.Text = "";
            tPwd.Text = "";
            ocultar_botones();
        }

        private void bUSUARIOS_Click(object sender, EventArgs e)
        {
            lanzar_ventana_usuarios();
        }

        private void lanzar_ventana_usuarios()
        {
            FUsuario ventana = new FUsuario(user);
            this.Visible = false; // Oculto el Formulario de Login
            ventana.ShowDialog();
            this.Visible = true; // Muestro el Formulario de Login
        }
    }
}
