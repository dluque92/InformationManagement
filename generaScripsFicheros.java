import java.io.*;
import java.util.*;

public class generaScripsFicheros {
	
	private static final String DIR = "C:\\Users\\alumno\\Downloads\\";
	
	public static void main(String[] args) {
		System.out.println("generando Pais");
		generaPais(DIR+"pais.txt", DIR+"pais.sql");
		System.out.println("Pais generada");
		System.out.println("generando Paciente");
		generaPaciente(DIR+"paciente.txt", DIR+"paciente.sql");
		System.out.println("Paciente generada");
		System.out.println("generando Glucometria");
		generaGlucometria(DIR+"glucometria.txt", DIR+"glucometria.sql");
		System.out.println("Glucometria generada");
		System.out.println("generando Rol");
		generaRol(DIR+"rol.txt", DIR+"rol.sql");
		System.out.println("Rol generado");
		System.out.println("generando Usuario");
		generaUsuario(DIR+"usuario.txt", DIR+"usuario.sql");
		System.out.println("Usuario generado");
	}

	public static void generaGlucometria(String fOrigen, String fDestino) {
		String linea = "";
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(fDestino));
			pw.println("use GI;");
			pw.println("GO");
			pw.println("DELETE tValoresGlucometria;");
			BufferedReader br = new BufferedReader(new FileReader(fOrigen));
			while ((linea = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(linea, ";");
				String nombre = st.nextToken();
				double min = Double.parseDouble(st.nextToken());
				double max = Double.parseDouble(st.nextToken());
				pw.println("INSERT INTO tValoresGlucometria VALUES(" + "'"
						+ nombre + "', " + min + "," + max + ");");
			}
			pw.println("GO");
			br.close();
			pw.close();
		} catch (Exception ex) {
			System.out.println("Error en : " + linea);
			System.out.println(ex.getMessage());
		}
	}

	public static void generaPais(String fOrigen, String fDestino) {
		String linea = "";
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(fDestino));
			pw.println("use GI;");
			pw.println("GO");
			pw.println("DELETE tPais;");
			BufferedReader br = new BufferedReader(new FileReader(fOrigen));
			while ((linea = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(linea, ";");
				String codigo = st.nextToken();
				String descripcion = st.nextToken();
				pw.println("INSERT INTO tPais VALUES(" + "'"
						+ codigo + "', '" + descripcion + "');");
			}
			pw.println("GO");
			br.close();
			pw.close();
		} catch (Exception ex) {
			System.out.println("Error en : " + linea);
			System.out.println(ex.getMessage());
		}
	}

	public static void generaPaciente(String fOrigen, String fDestino) {
		String linea = "";
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(fDestino));
			pw.println("use GI;");
			pw.println("GO");
			pw.println("DELETE tPaciente;");
			BufferedReader br = new BufferedReader(new FileReader(fOrigen));
			while ((linea = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(linea, ";");
				int numSS = Integer.parseInt(st.nextToken());
				String DNI = st.nextToken();
				String nombre = st.nextToken();
				String apellidos = st.nextToken();
				String sexo = st.nextToken();
				String fecha = st.nextToken();
				String direccion = st.nextToken();
				String poblacion = st.nextToken();
				String provincia = st.nextToken();
				String codigoProv = st.nextToken();
				String pais = st.nextToken();
				String telefono = st.nextToken();
				String email = st.nextToken();
				pw.println("INSERT INTO tPaciente VALUES(" + numSS + ", '"
						+ DNI + "', '" + nombre + "', '" + apellidos + "', '"
						+ sexo + "', '" + fecha + "', '" + direccion + "', '"
						+ poblacion + "', '" + provincia + "','" + codigoProv + "', '" + pais + "', " 
						+ telefono + ", '" + email + "');");
			}
			pw.println("GO");
			br.close();
			pw.close();
		} catch (Exception ex) {
			System.out.println("Error en : " + linea);
			System.out.println(ex.getMessage());
		}
	}

	public static void generaRol(String fOrigen, String fDestino) {
		String linea = "";
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(fDestino));
			pw.println("use GI;");
			pw.println("GO");
			pw.println("DELETE tRol;");
			BufferedReader br = new BufferedReader(new FileReader(fOrigen));
			while ((linea = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(linea, ";");
				String rolName = st.nextToken();
				String rolDes = st.nextToken();
				int admin = Integer.parseInt(st.nextToken());
				pw.println("INSERT INTO tRol VALUES('"+ rolName + "', '" + rolDes + "'," + admin + ");");
			}
			pw.println("GO");
			br.close();
			pw.close();
		} catch (Exception ex) {
			System.out.println("Error en : " + linea);
			System.out.println(ex.getMessage());
		}
	}

	public static void generaUsuario(String fOrigen, String fDestino) {
		String linea = "";
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(fDestino));
			pw.println("use GI;");
			pw.println("GO");
			pw.println("DELETE tUsuario;");
			BufferedReader br = new BufferedReader(new FileReader(fOrigen));
			while ((linea = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(linea, ";");
				String nombre = st.nextToken();
				String password = st.nextToken();
				String rolname = st.nextToken();
				pw.println("INSERT INTO tUsuario VALUES('"+ nombre + "', '" + password + "', '" + rolname + "');");
			}
			pw.println("GO");
			br.close();
			pw.close();
		} catch (Exception ex) {
			System.out.println("Error en : " + linea);
			System.out.println(ex.getMessage());
		}
	}
}
