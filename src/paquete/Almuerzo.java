package paquete;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Almuerzo {
	
	private int numComensales;
	private int numCubiertosT1;
	private int numCubiertosT2;
	private int numPlatos;
	private int tamFregadero;
	
	public static void main(String[] args) {
		Almuerzo almuerzo = new Almuerzo();
		Properties setup = new Properties();
		try {
			setup.load(new FileInputStream("./data/setup.properties"));
			
			almuerzo.numComensales = Integer.valueOf(setup.getProperty("concurrencia.numComensales"));
			almuerzo.numCubiertosT1 = Integer.valueOf(setup.getProperty("concurrencia.numCubiertosT1"));
			almuerzo.numCubiertosT2 = Integer.valueOf(setup.getProperty("concurrencia.numCubiertosT2"));
			almuerzo.numPlatos = Integer.valueOf(setup.getProperty("concurrencia.numPlatos"));
			almuerzo.tamFregadero = Integer.valueOf(setup.getProperty("concurrencia.tamFregadero"));
			
			
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: No se encontró el archivo.");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("ERROR: No se pudo leer el archivo.");
			System.exit(0);
		} catch (NumberFormatException e) {
			System.out.println("ERROR: Los valores dados no están en el formato correcto.");
			System.exit(0);
		}
	}

}
