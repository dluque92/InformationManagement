import java.util.Date;



public class principal 
{
	public static void main(String[] args) 
	{
		
		
		try
		{			
			Paciente p = new Paciente(11);
			p.BorrarPaciente();
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		

		for(Paciente p: Paciente.ListaPacientes())
		{
			System.out.println(p);
		}
		
		try
		{			
			Paciente p = new Paciente(11, "11", "N11", "AP11", "HOMBRE", new Date(), "CASA 11",
		            "MALAGA", "MALAGA", "29011", new Pais ("ESP"), "11111111", "11.GMAIL.COM");
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		for(Paciente p: Paciente.ListaPacientes())
		{
			System.out.println(p);
			for(Prueba pb: Prueba.ListaPruebas(p.getNumeroSS_Paciente()))
			{
				System.out.println("\t"+pb);
			}
		}
		
	}

}
