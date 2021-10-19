package crearConexion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;



public class principal {

	public static void main(String[] args) throws IOException {
		File fichero = new File("conexion.cfg");
		
		conexion conn = leerDatos(fichero);
		System.out.println(conn);
	}

	private static conexion leerDatos(File fichero) throws IOException {
	
		conexion contenido = new conexion();
		
	
			FileReader fch = new FileReader (fichero);
			BufferedReader bufLectura = new BufferedReader(fch);
			String lineaLeida = bufLectura.readLine();
			
			String[] campos;
			HashMap<String, String> mapa = new HashMap <String,String>();
			
			while (lineaLeida!= null) {
				
				campos = lineaLeida.split(":");
				mapa.put(campos[0].trim().toUpperCase(), campos[1].trim());
				
				
				
				lineaLeida = bufLectura.readLine();
			}
			
			
			bufLectura.close();
			fch.close();
			contenido.setHost(mapa.get("HOST"));
			contenido.setPort(mapa.get("PORT"));
			contenido.setDbname(mapa.get("DBNAME"));
			contenido.setUsername(mapa.get("USERNAME"));
			contenido.setUserpass(mapa.get("USERPASS"));
			
			return contenido;
	
		
		
	}
}


