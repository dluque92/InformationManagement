
import java.util.*;
import java.text.SimpleDateFormat;

public class Paciente
{
	    private static String BD_SERVER = "localhost";
	    private static String BD_NAME = "GI";
    
        private int NumSS;
        private String DNI_NIE;
        private String Nombre;
        private String Apellidos;
        private String Sexo;
        private Date FechaNacimiento;
        private String Direccion;
        private String Poblacion;
        private String Provincia;
        private String CodigoPostal;
        private Pais miPais;
        private String Telefono;
        private String e_mail;

        public static List<Paciente> ListaPacientes()
        {
        	BD miBD = new BD(BD_SERVER,BD_NAME);
            List<Paciente> lista = new ArrayList<Paciente>();
            for(Object[] tupla: miBD.Select("SELECT * FROM tPaciente;")){
            	int numSS = (int)tupla[0];
            	String dni_nie = (String)tupla[1];
            	String nombre = (String)tupla[2];
            	String apellidos = (String)tupla[3];
            	String sexo = (String)tupla[4];
            	Date fechaNac = (Date)tupla[5];
            	//String d = (String)tupla[5];
            	String dir = (String)tupla[6];
            	String poblacion = (String)tupla[7];
            	String provincia = (String)tupla[8];
            	String codigoP = (String)tupla[9];
            	//Pais pais = (Pais)tupla[10];
            	String pais1 = (String)tupla[10];
            	Pais pais = new Pais(pais1);
            	String tlf = (String)tupla[11];
            	String email = (String)tupla[12];
            	Paciente p = new Paciente(numSS);
            	lista.add(p);
            }
            
            return lista;
        }

        public Paciente(int nSS)
        {
        	// Crea el objeto cargando sus valores de la base de datos
        	BD miBD = new BD(BD_SERVER,BD_NAME);			
    		Object[] tupla = miBD.Select("SELECT * FROM tPaciente WHERE numSS='"+nSS+"';").get(0);
    		NumSS = (int)tupla[0];
    		DNI_NIE = (String)tupla[1];
    		Nombre = (String)tupla[2];
    		Apellidos = (String)tupla[3];
    		Sexo = (String)tupla[4];
    		FechaNacimiento = (Date)tupla[5];
    		Direccion = (String)tupla[6];
    		Poblacion = (String)tupla[7];
    		Provincia = (String)tupla[8];
    		CodigoPostal = (String)tupla[9];
    		String pais = (String)tupla[10];
    		miPais = new Pais(pais);
    		Telefono = (String)tupla[11];
    		e_mail = (String)tupla[12];
        }

        public Paciente(int NumSS, String DNI_NIE, String Nombre, String Apellidos, String Sexo,
            Date FechaNacimiento, String Direccion, String Poblacion, String Provincia,
            String CodigoPostal, Pais miPais, String Telefono, String e_mail)
        {
        	// Crea el objeto y lo inserta en la base de datos
        	BD miBD = new BD(BD_SERVER,BD_NAME);		
        	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
            String DateToStr = format.format(FechaNacimiento);
        	miBD.Insert("INSERT INTO tPaciente VALUES(" +  NumSS + ", '" + DNI_NIE + "', '" + Nombre + "', '" + Apellidos + "', '" + Sexo + "', '" + DateToStr + "', '" + Direccion + "', '" + Poblacion + "', '" + Provincia + "', '" + CodigoPostal + "', '" + miPais.getCodigo() + "', '" + Telefono + "', '" + e_mail + "');" );	
        	this.NumSS = NumSS;
        	this.DNI_NIE = DNI_NIE;
        	this.Nombre = Nombre;
        	this.Apellidos = Apellidos;
        	this.Sexo = Sexo;
        	this.FechaNacimiento = FechaNacimiento;
        	this.Direccion = Direccion;
        	this.Poblacion = Poblacion;
        	this.Provincia = Provincia;
        	this.CodigoPostal = CodigoPostal;
        	this.miPais = miPais;
        	this.Telefono = Telefono;
        	this.e_mail = e_mail;
        }

        public void BorrarPaciente()
        {
        	BD miBD = new BD(BD_SERVER,BD_NAME);
        	miBD.Delete("DELETE FROM tPaciente WHERE NumSS = "+NumSS+";" );	
        }

        public int getNumeroSS_Paciente()
        {
            return NumSS; 
            // No se permite cambiar el Número de la SS de un paciente
        }


        public String getDNI_NIE_Paciente()
        {
            return DNI_NIE;
        }

        public void setDNI_NIE_Paciente(String value)
        {
        	BD miBD = new BD(BD_SERVER,BD_NAME);
        	miBD.Update("UPDATE tPaciente SET DNI_NIE = '" + value 
        			+ "' WHERE numSS='" + this.NumSS + "';");
        	
        	DNI_NIE = value; 
        }

        public String getNombre_Paciente()
        {
            return Nombre;
        }
            
        public void setNombre_Paciente(String value)
        {
        	BD miBD = new BD(BD_SERVER,BD_NAME);
        	miBD.Update("UPDATE tPaciente SET Nombre = '" + value 
        			+ "' WHERE numSS='" + this.NumSS + "';");
        	
        	Nombre = value;
        }

        public String getApellidos_Paciente()
        {
            return Apellidos;
        }
            
        public void setApellidos_Paciente(String value)            
        {
        	BD miBD = new BD(BD_SERVER,BD_NAME);
        	miBD.Update("UPDATE tPaciente SET Apellidos = '" + value 
        			+ "' WHERE numSS='" + this.NumSS + "';");
        	
        	Apellidos = value;
        }

        public String getSexo_Paciente()
        {
            return Sexo;
        }
            
        public void setSexo_Paciente(String value)            
        {
        	BD miBD = new BD(BD_SERVER,BD_NAME);
        	miBD.Update("UPDATE tPaciente SET Sexo = '" + value 
        			+ "' WHERE numSS='" + this.NumSS + "';");
        	
        	Sexo = value;
        }

        public Date getFechaNacimiento_Paciente()
        {
            return FechaNacimiento;
        }
            
        public void setFechaNacimiento_Paciente(Date value)
        {
           	BD miBD = new BD(BD_SERVER,BD_NAME);
           	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
            String DateToStr = format.format(value); 
            	
             miBD.Update("UPDATE tPaciente SET FechaNacimiento='" + DateToStr 
                    + "' WHERE NumSS=" + this.NumSS + ";");
                FechaNacimiento = value;
        }

        public String getDireccion_Paciente()
        {
            return Direccion;
        }
            
        public void setDireccion_Paciente(String value)
        {
        	BD miBD = new BD(BD_SERVER,BD_NAME);
        	miBD.Update("UPDATE tPaciente SET Direccion = '" + value 
        			+ "' WHERE numSS='" + this.NumSS + "';");
        	
        	Direccion = value;
        }

        public String getPoblacion_Paciente()
        {
            return Poblacion;
        }
        
        public void setPoblacion_Paciente(String value)
        {
        	BD miBD = new BD(BD_SERVER,BD_NAME);
        	miBD.Update("UPDATE tPaciente SET Poblacion = '" + value 
        			+ "' WHERE numSS='" + this.NumSS + "';");
        	
        	Poblacion = value;
        }

        public String getProvincia_Paciente()
        {
            return Provincia;
        }
        
        public void setProvincia_Paciente(String value)
        {
        	BD miBD = new BD(BD_SERVER,BD_NAME);
        	miBD.Update("UPDATE tPaciente SET Provincia = '" + value 
        			+ "' WHERE numSS='" + this.NumSS + "';");
        	
        	Provincia = value;
        }

        public String getCodigoPostal_Paciente()
        {
            return CodigoPostal;
        }
        
        public void setCodigoPostal_Paciente(String value)
        {
        	BD miBD = new BD(BD_SERVER,BD_NAME);
        	miBD.Update("UPDATE tPaciente SET CodigoPostal = '" + value 
        			+ "' WHERE numSS='" + this.NumSS + "';");
        	
        	CodigoPostal = value;
        }

        public Pais getPais_Paciente()
        {
            return miPais;
        }
        
        public void setPais_Paciente(Pais value)
        {
        	BD miBD = new BD(BD_SERVER,BD_NAME);
        	miBD.Update("UPDATE tPaciente SET Pais = '" + value 
        			+ "' WHERE numSS='" + this.NumSS + "';");
        	
        	miPais = value;
        }

        public String getTelefono_Paciente()
        {
            return Telefono;
        }
        
        public void setTelefono_Paciente(String value)
        {
        	BD miBD = new BD(BD_SERVER,BD_NAME);
        	miBD.Update("UPDATE tPaciente SET Telefono = '" + value 
        			+ "' WHERE numSS='" + this.NumSS + "';");
        	
        	Telefono = value;
        }

        public String getE_mail_Paciente()
        {
            return e_mail;
        }
        
        public void setE_mail_Paciente(String value)
        {
        	BD miBD = new BD(BD_SERVER,BD_NAME);
        	miBD.Update("UPDATE tPaciente SET e_mail = '" + value 
        			+ "' WHERE numSS='" + this.NumSS + "';");
        	
        	e_mail = value;
        }

        public String toString()
        {
            return NumSS + "->" + DNI_NIE + "//" + Nombre + " " + Apellidos;
        }
}
