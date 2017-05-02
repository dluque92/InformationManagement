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
    public partial class FUsuario : Form
    {

        private Usuario user;
        private List<Rol> lista_roles;

        public FUsuario(Usuario user)
        {
            InitializeComponent();
            this.user = user;
            lista_roles = Rol.ListaRoles();
        }

        private void CargaUsuarios()
        {
            dataGridView1.Rows.Clear(); // Borro lo que haya
            foreach (Usuario u in Usuario.ListaUsuarios())
            {
                dataGridView1.Rows.Add(u.Nombre, u.Password, u.MyRol);
            }
        }
        private void USUARIOS_Load(object sender, EventArgs e)
        {

            CargaUsuarios();

            if (!user.AccesoPantalla(this.Name))
            {
                MessageBox.Show("ERROR: NO TIENE ACCESO A ESTE FORMULARIO");
                this.Close();
            }

            if (!user.ModificaPantalla(this.Name))
            {
                bADD.Enabled = false;
                bDEL.Enabled = false;
                bMODI.Enabled = false;
            }

            foreach (Rol r in lista_roles)
            {
                lRoles.Items.Add(r);
            }
            lRoles.SelectedIndex = -1;
        }

        private void bCLEAN_Click(object sender, EventArgs e)
        {
            tUser.Text = "";
            tPwd.Text = "";
            lRoles.SelectedIndex = -1;
        }

        private void dataGridView1_SelectionChanged(object sender, EventArgs e)
        {
            try
            {
                tUser.Text = dataGridView1.SelectedRows[0].Cells[0].Value.ToString();
                tPwd.Text = dataGridView1.SelectedRows[0].Cells[1].Value.ToString();
                Rol r= (Rol)dataGridView1.SelectedRows[0].Cells[2].Value;

                for (int i = 0; i < lista_roles.Count; ++i) 
                    if (r.RolName == lista_roles[i].RolName) lRoles.SelectedIndex = i;
            }
            catch
            {
                // Ignorar
            }
        }

        private void bADD_Click(object sender, EventArgs e)
        {
            try
            {
                String nombreUsuario = tUser.Text;
                String passUsuario = tPwd.Text;
                Rol r = (Rol)lRoles.SelectedItem;
                Usuario usuario = new Usuario(nombreUsuario, passUsuario, r);
                CargaUsuarios();
            }
            catch (Exception ex)
            {
                MessageBox.Show("ERROR: " + ex.Message);
            }
        }

        private void bMODI_Click(object sender, EventArgs e)
        {
            try
            {
                String nombreAntiguo = dataGridView1.SelectedRows[0].Cells[0].Value.ToString();
                String passAntiguo = dataGridView1.SelectedRows[0].Cells[1].Value.ToString();
                Usuario uAntiguo = new Usuario(nombreAntiguo, passAntiguo);

                String nombreUsuario = tUser.Text;
                String passUsuario = tPwd.Text;
                Rol r = (Rol)lRoles.SelectedItem;

                uAntiguo.Nombre = nombreUsuario;
                uAntiguo.Password = passUsuario;
                user.ModiRol(uAntiguo, r);
                CargaUsuarios();
                
            }
            catch (Exception ex)
            {
                MessageBox.Show("ERROR: " + ex.Message);
            }
        }

        private void bDEL_Click(object sender, EventArgs e)
        {
            try
            {
                String nombreAntiguo = dataGridView1.SelectedRows[0].Cells[0].Value.ToString();
                String passAntiguo = dataGridView1.SelectedRows[0].Cells[1].Value.ToString();
                Usuario uAntiguo = new Usuario(nombreAntiguo, passAntiguo);
                user.Borrar(uAntiguo);
                CargaUsuarios();
            }
            catch (Exception ex)
            {
                MessageBox.Show("ERROR: " + ex.Message);
            }
        }
    }
}
