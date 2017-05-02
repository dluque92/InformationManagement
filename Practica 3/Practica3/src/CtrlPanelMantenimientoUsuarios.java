import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class CtrlPanelMantenimientoUsuarios implements ActionListener  
{
	private I_PanelMantenimientoUsuarios vista;	
	private Usuario u=null;

	public CtrlPanelMantenimientoUsuarios(I_PanelMantenimientoUsuarios vista)
	{
		this.vista = vista;
	}

	public void actionPerformed(ActionEvent e) 
	{
		String cmd = e.getActionCommand();
		
		try
		{
			
			if (cmd.equals(I_PanelMantenimientoUsuarios.LOGIN))
			{								
				vista.limpiar();
				vista.desactivaBotones();
				try
				{
					u = new Usuario(vista.getUser(), vista.getPwd());
					vista.mensaje("Usuario Identificado");

					if (u.getRol().Acceso("USUARIOS"))	vista.ActivarUsuarios(); 
					if (u.getRol().Modificacion("USUARIOS"))
					{
							CtrLista ctrLista = new CtrLista(u);
							vista.controladorLista(ctrLista);
							
					}
				}
				catch (Exception ex)
				{
					vista.alerta("Usuario Desconocido");
					ex.printStackTrace();
					u = null;
				}

			}
			else if (cmd.equals(I_PanelMantenimientoUsuarios.USUARIOS))
			{				
				vista.limpiar();
				List<Usuario> lista = Usuario.ListaUsuarios();
				vista.MostrarUsuarios(lista);
			}
		}	
		catch (Exception ex)
		{
			vista.alerta(ex.getMessage());
		}

	}

}
