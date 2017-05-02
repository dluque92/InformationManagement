package genetica;

import java.io.*;
import java.util.*;

public class principal 
{

	public static void main(String[] args) 
	{
		for(Proteina p: Proteina.ListaProteinas()) p.delete();
		for(Gen g: Gen.ListaGenes()) g.delete();
		
		CargarGenes("GEN.txt");
		CargarProteinas("PROTEINA.txt");
		
		System.out.println("GENES");
		System.out.println("=====");
		for(Gen g: Gen.ListaGenes()) System.out.println(g.toString());
		
		System.out.println("PROTENAS");
		System.out.println("========");
		for(Proteina p: Proteina.ListaProteinas()) System.out.println(p.toString());
		
		Consulta_A();
		Consulta_B();
		Consulta_C();
		
		System.out.println("Ejecuci�n Finalizada");
	}
	
	public static void CargarGenes(String FileName)
	{
		try
		{
			BufferedReader bfr = new BufferedReader(new FileReader(FileName));
			String linea = bfr.readLine();
			while (linea != null) 
			{
				StringTokenizer lineaPalabras = new StringTokenizer(linea,";");
				int id = Integer.parseInt(lineaPalabras.nextToken());
				String n = lineaPalabras.nextToken();
				// TODO: Completar CargarGenes
				Gen g = new Gen(id,n);
				g.toString();
				linea = bfr.readLine();
			}
			bfr.close();
		}
		catch (Exception e)
		{
			System.out.println("Error en CargarGenes." + e.getMessage());
		}
	}
	
	public static void CargarProteinas(String FileName)
	{
		try
		{
			BufferedReader bfr = new BufferedReader(new FileReader(FileName));
			String linea = bfr.readLine();
			while (linea != null) 
			{
				StringTokenizer lineaPalabras = new StringTokenizer(linea,";");
				String c = lineaPalabras.nextToken();
				Gen g = new Gen(Integer.parseInt(lineaPalabras.nextToken()));
				String n = lineaPalabras.nextToken();
				int l = Integer.parseInt(lineaPalabras.nextToken());
				String s = lineaPalabras.nextToken();
				String e = lineaPalabras.nextToken();
				String f = lineaPalabras.nextToken();
				Proteina p = new Proteina(c,g,n,l,s,e,f);
				p.toString();
				// TODO: Completar CargarProteinas
				
				linea = bfr.readLine();
			}
			bfr.close();
		}
		catch (Exception e)
		{
			System.out.println("Error en CargarProteinas." + e.getMessage());
		}
	}
	
	public static void Consulta_A()
	{
		System.out.println("PROTENAS QUE COMIENZAN POR MAF");
		System.out.println("==============================");
		// TODO: Completar consulta A	
		for(Proteina p: Proteina.ListaProteinas()){
			if(p.getSecuencia().substring(0,3).equalsIgnoreCase("MAF")){
				System.out.println(p.toString());
			}
		}
	}

	public static void Consulta_B()
	{
		System.out.println("PROTENAS/GEN CON SECUENCIAS > 200");
		System.out.println("=================================");
		for(Proteina p: Proteina.ListaProteinas()){
			if(p.getLongitudSecuencia() > 200){
				System.out.println(p.getNOMBRE() +" " + p.getGen().getNombre());
			}
		}
		// TODO: Completar consulta B	
	}
	
	public static void Consulta_C()
	{
		System.out.println("PROTEINAS EN GENES");
		System.out.println("=================================");
		for(Gen g: Gen.ListaGenes()){
			int cont = 0;
			for(Proteina p: Proteina.ListaProteinas()){
				if(p.getGen().getCodigo() == g.getCodigo()){
					cont++;
				}
			}
			if(cont != 0){
				System.out.println(g.getNombre() + " -> " + cont);
			}
			
		}
		// TODO: Completar consulta C
	}
		
}
