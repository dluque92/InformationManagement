namespace practica05
{
    partial class LOGIN
    {
        /// <summary>
        /// Variable del diseñador requerida.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén utilizando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben eliminar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido del método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.tUser = new System.Windows.Forms.TextBox();
            this.bLogin = new System.Windows.Forms.Button();
            this.tPwd = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.usuariosToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.pacientesToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.pruebasToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.cerrarSesionToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.salirToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.bExit = new System.Windows.Forms.Button();
            this.bPRUEBAS = new System.Windows.Forms.Button();
            this.bPACIENTES = new System.Windows.Forms.Button();
            this.bUSUARIOS = new System.Windows.Forms.Button();
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(94, 42);
            this.label1.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(43, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Usuario";
            // 
            // tUser
            // 
            this.tUser.Location = new System.Drawing.Point(148, 42);
            this.tUser.Margin = new System.Windows.Forms.Padding(2);
            this.tUser.Name = "tUser";
            this.tUser.Size = new System.Drawing.Size(126, 20);
            this.tUser.TabIndex = 1;
            // 
            // bLogin
            // 
            this.bLogin.Location = new System.Drawing.Point(497, 42);
            this.bLogin.Margin = new System.Windows.Forms.Padding(2);
            this.bLogin.Name = "bLogin";
            this.bLogin.Size = new System.Drawing.Size(56, 19);
            this.bLogin.TabIndex = 3;
            this.bLogin.Text = "Login";
            this.bLogin.UseVisualStyleBackColor = true;
            this.bLogin.Click += new System.EventHandler(this.bLogin_Click);
            // 
            // tPwd
            // 
            this.tPwd.Location = new System.Drawing.Point(362, 42);
            this.tPwd.Margin = new System.Windows.Forms.Padding(2);
            this.tPwd.Name = "tPwd";
            this.tPwd.PasswordChar = '*';
            this.tPwd.Size = new System.Drawing.Size(126, 20);
            this.tPwd.TabIndex = 2;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(296, 42);
            this.label2.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(61, 13);
            this.label2.TabIndex = 3;
            this.label2.Text = "Contraseña";
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.usuariosToolStripMenuItem,
            this.pacientesToolStripMenuItem,
            this.pruebasToolStripMenuItem,
            this.cerrarSesionToolStripMenuItem,
            this.salirToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Padding = new System.Windows.Forms.Padding(4, 2, 0, 2);
            this.menuStrip1.Size = new System.Drawing.Size(562, 24);
            this.menuStrip1.TabIndex = 6;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // usuariosToolStripMenuItem
            // 
            this.usuariosToolStripMenuItem.Name = "usuariosToolStripMenuItem";
            this.usuariosToolStripMenuItem.Size = new System.Drawing.Size(64, 20);
            this.usuariosToolStripMenuItem.Text = "Usuarios";
            this.usuariosToolStripMenuItem.Click += new System.EventHandler(this.usuariosToolStripMenuItem_Click);
            // 
            // pacientesToolStripMenuItem
            // 
            this.pacientesToolStripMenuItem.Name = "pacientesToolStripMenuItem";
            this.pacientesToolStripMenuItem.Size = new System.Drawing.Size(69, 20);
            this.pacientesToolStripMenuItem.Text = "Pacientes";
            // 
            // pruebasToolStripMenuItem
            // 
            this.pruebasToolStripMenuItem.Name = "pruebasToolStripMenuItem";
            this.pruebasToolStripMenuItem.Size = new System.Drawing.Size(61, 20);
            this.pruebasToolStripMenuItem.Text = "Pruebas";
            // 
            // cerrarSesionToolStripMenuItem
            // 
            this.cerrarSesionToolStripMenuItem.Name = "cerrarSesionToolStripMenuItem";
            this.cerrarSesionToolStripMenuItem.Size = new System.Drawing.Size(88, 20);
            this.cerrarSesionToolStripMenuItem.Text = "Cerrar Sesion";
            this.cerrarSesionToolStripMenuItem.Click += new System.EventHandler(this.cerrarSesionToolStripMenuItem_Click);
            // 
            // salirToolStripMenuItem
            // 
            this.salirToolStripMenuItem.Name = "salirToolStripMenuItem";
            this.salirToolStripMenuItem.Size = new System.Drawing.Size(41, 20);
            this.salirToolStripMenuItem.Text = "Salir";
            this.salirToolStripMenuItem.Click += new System.EventHandler(this.salirToolStripMenuItem_Click);
            // 
            // bExit
            // 
            this.bExit.Image = global::practica05.Properties.Resources.salir;
            this.bExit.Location = new System.Drawing.Point(316, 207);
            this.bExit.Margin = new System.Windows.Forms.Padding(2);
            this.bExit.Name = "bExit";
            this.bExit.Size = new System.Drawing.Size(142, 90);
            this.bExit.TabIndex = 7;
            this.bExit.UseVisualStyleBackColor = true;
            this.bExit.Click += new System.EventHandler(this.bExit_Click);
            // 
            // bPRUEBAS
            // 
            this.bPRUEBAS.Image = global::practica05.Properties.Resources.pruebas;
            this.bPRUEBAS.Location = new System.Drawing.Point(74, 207);
            this.bPRUEBAS.Margin = new System.Windows.Forms.Padding(2);
            this.bPRUEBAS.Name = "bPRUEBAS";
            this.bPRUEBAS.Size = new System.Drawing.Size(142, 90);
            this.bPRUEBAS.TabIndex = 6;
            this.bPRUEBAS.UseVisualStyleBackColor = true;
            // 
            // bPACIENTES
            // 
            this.bPACIENTES.Image = global::practica05.Properties.Resources.paciente;
            this.bPACIENTES.Location = new System.Drawing.Point(316, 82);
            this.bPACIENTES.Margin = new System.Windows.Forms.Padding(2);
            this.bPACIENTES.Name = "bPACIENTES";
            this.bPACIENTES.Size = new System.Drawing.Size(142, 90);
            this.bPACIENTES.TabIndex = 5;
            this.bPACIENTES.UseVisualStyleBackColor = true;
            // 
            // bUSUARIOS
            // 
            this.bUSUARIOS.Image = global::practica05.Properties.Resources.usuarios;
            this.bUSUARIOS.Location = new System.Drawing.Point(74, 82);
            this.bUSUARIOS.Margin = new System.Windows.Forms.Padding(2);
            this.bUSUARIOS.Name = "bUSUARIOS";
            this.bUSUARIOS.Size = new System.Drawing.Size(142, 90);
            this.bUSUARIOS.TabIndex = 4;
            this.bUSUARIOS.UseVisualStyleBackColor = true;
            this.bUSUARIOS.Click += new System.EventHandler(this.bUSUARIOS_Click);
            // 
            // LOGIN
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackgroundImage = global::practica05.Properties.Resources.hospital;
            this.ClientSize = new System.Drawing.Size(562, 330);
            this.Controls.Add(this.bExit);
            this.Controls.Add(this.bPRUEBAS);
            this.Controls.Add(this.bPACIENTES);
            this.Controls.Add(this.bUSUARIOS);
            this.Controls.Add(this.tPwd);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.bLogin);
            this.Controls.Add(this.tUser);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.menuStrip1);
            this.MainMenuStrip = this.menuStrip1;
            this.Margin = new System.Windows.Forms.Padding(2);
            this.Name = "LOGIN";
            this.Text = "LOGIN";
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox tUser;
        private System.Windows.Forms.Button bLogin;
        private System.Windows.Forms.TextBox tPwd;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem usuariosToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem pacientesToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem pruebasToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem salirToolStripMenuItem;
        private System.Windows.Forms.Button bUSUARIOS;
        private System.Windows.Forms.Button bPACIENTES;
        private System.Windows.Forms.Button bExit;
        private System.Windows.Forms.Button bPRUEBAS;
        private System.Windows.Forms.ToolStripMenuItem cerrarSesionToolStripMenuItem;
    }
}

