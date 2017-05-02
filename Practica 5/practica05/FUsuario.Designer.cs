namespace practica05
{
    partial class FUsuario
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.nombreDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.passwordDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.rolNameDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.tUser = new System.Windows.Forms.TextBox();
            this.tPwd = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.lRoles = new System.Windows.Forms.ListBox();
            this.bADD = new System.Windows.Forms.Button();
            this.bMODI = new System.Windows.Forms.Button();
            this.bDEL = new System.Windows.Forms.Button();
            this.bCLEAN = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // dataGridView1
            // 
            this.dataGridView1.AllowUserToAddRows = false;
            this.dataGridView1.AllowUserToDeleteRows = false;
            this.dataGridView1.AllowUserToOrderColumns = true;
            this.dataGridView1.AutoGenerateColumns = false;
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.nombreDataGridViewTextBoxColumn,
            this.passwordDataGridViewTextBoxColumn,
            this.rolNameDataGridViewTextBoxColumn});
            this.dataGridView1.Location = new System.Drawing.Point(126, 77);
            this.dataGridView1.MultiSelect = false;
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.ReadOnly = true;
            this.dataGridView1.RowTemplate.Height = 24;
            this.dataGridView1.Size = new System.Drawing.Size(445, 150);
            this.dataGridView1.TabIndex = 0;
            this.dataGridView1.SelectionChanged += new System.EventHandler(this.dataGridView1_SelectionChanged);
            // 
            // nombreDataGridViewTextBoxColumn
            // 
            this.nombreDataGridViewTextBoxColumn.DataPropertyName = "nombre";
            this.nombreDataGridViewTextBoxColumn.HeaderText = "nombre";
            this.nombreDataGridViewTextBoxColumn.Name = "nombreDataGridViewTextBoxColumn";
            this.nombreDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // passwordDataGridViewTextBoxColumn
            // 
            this.passwordDataGridViewTextBoxColumn.DataPropertyName = "password";
            this.passwordDataGridViewTextBoxColumn.HeaderText = "password";
            this.passwordDataGridViewTextBoxColumn.Name = "passwordDataGridViewTextBoxColumn";
            this.passwordDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // rolNameDataGridViewTextBoxColumn
            // 
            this.rolNameDataGridViewTextBoxColumn.DataPropertyName = "rolName";
            this.rolNameDataGridViewTextBoxColumn.HeaderText = "rolName";
            this.rolNameDataGridViewTextBoxColumn.Name = "rolNameDataGridViewTextBoxColumn";
            this.rolNameDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Verdana", 20F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(234, 33);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(203, 41);
            this.label1.TabIndex = 1;
            this.label1.Text = "USUARIOS";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(126, 250);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(111, 17);
            this.label2.TabIndex = 2;
            this.label2.Text = "Nombre Usuario";
            // 
            // tUser
            // 
            this.tUser.Location = new System.Drawing.Point(256, 250);
            this.tUser.Name = "tUser";
            this.tUser.Size = new System.Drawing.Size(315, 22);
            this.tUser.TabIndex = 3;
            // 
            // tPwd
            // 
            this.tPwd.Location = new System.Drawing.Point(253, 281);
            this.tPwd.Name = "tPwd";
            this.tPwd.Size = new System.Drawing.Size(315, 22);
            this.tPwd.TabIndex = 5;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(123, 281);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(81, 17);
            this.label3.TabIndex = 4;
            this.label3.Text = "Contraseña";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(126, 312);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(29, 17);
            this.label4.TabIndex = 6;
            this.label4.Text = "Rol";
            // 
            // lRoles
            // 
            this.lRoles.FormattingEnabled = true;
            this.lRoles.ItemHeight = 16;
            this.lRoles.Location = new System.Drawing.Point(253, 312);
            this.lRoles.Name = "lRoles";
            this.lRoles.Size = new System.Drawing.Size(315, 20);
            this.lRoles.TabIndex = 7;
            // 
            // bADD
            // 
            this.bADD.Location = new System.Drawing.Point(148, 351);
            this.bADD.Name = "bADD";
            this.bADD.Size = new System.Drawing.Size(89, 23);
            this.bADD.TabIndex = 8;
            this.bADD.Text = "AÑADIR";
            this.bADD.UseVisualStyleBackColor = true;
            this.bADD.Click += new System.EventHandler(this.bADD_Click);
            // 
            // bMODI
            // 
            this.bMODI.Location = new System.Drawing.Point(274, 351);
            this.bMODI.Name = "bMODI";
            this.bMODI.Size = new System.Drawing.Size(98, 23);
            this.bMODI.TabIndex = 9;
            this.bMODI.Text = "MODIFICAR";
            this.bMODI.UseVisualStyleBackColor = true;
            this.bMODI.Click += new System.EventHandler(this.bMODI_Click);
            // 
            // bDEL
            // 
            this.bDEL.Location = new System.Drawing.Point(388, 351);
            this.bDEL.Name = "bDEL";
            this.bDEL.Size = new System.Drawing.Size(91, 23);
            this.bDEL.TabIndex = 10;
            this.bDEL.Text = "BORRAR";
            this.bDEL.UseVisualStyleBackColor = true;
            this.bDEL.Click += new System.EventHandler(this.bDEL_Click);
            // 
            // bCLEAN
            // 
            this.bCLEAN.Location = new System.Drawing.Point(496, 351);
            this.bCLEAN.Name = "bCLEAN";
            this.bCLEAN.Size = new System.Drawing.Size(75, 23);
            this.bCLEAN.TabIndex = 11;
            this.bCLEAN.Text = "LIMPIAR";
            this.bCLEAN.UseVisualStyleBackColor = true;
            this.bCLEAN.Click += new System.EventHandler(this.bCLEAN_Click);
            // 
            // USUARIOS
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackgroundImage = global::practica05.Properties.Resources.usuarios;
            this.ClientSize = new System.Drawing.Size(664, 462);
            this.Controls.Add(this.bCLEAN);
            this.Controls.Add(this.bDEL);
            this.Controls.Add(this.bMODI);
            this.Controls.Add(this.bADD);
            this.Controls.Add(this.lRoles);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.tPwd);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.tUser);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.dataGridView1);
            this.Name = "USUARIOS";
            this.Text = "USUARIOS";
            this.Load += new System.EventHandler(this.USUARIOS_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.DataGridViewTextBoxColumn nombreDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn passwordDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn rolNameDataGridViewTextBoxColumn;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox tUser;
        private System.Windows.Forms.TextBox tPwd;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.ListBox lRoles;
        private System.Windows.Forms.Button bADD;
        private System.Windows.Forms.Button bMODI;
        private System.Windows.Forms.Button bDEL;
        private System.Windows.Forms.Button bCLEAN;
    }
}