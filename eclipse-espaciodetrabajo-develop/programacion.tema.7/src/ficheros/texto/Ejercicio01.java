package ficheros.texto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * Crea un programa que muestre el contenido de un fichero de texto, cuyo 
 * nombre deberá introducir el usuario. Debe avisar si el fichero no existe.(Texto01.java).
 * 
 * */

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica el archivo que buscas con su nombre");
		String ruta = sc.nextLine();
		System.out.println(ruta);
		
		sc.close();
	}

	
	
	public static void Enseniar(String ruta) throws FileNotFoundException, IOException {
		try {
		String cadena;
		FileReader fr = new FileReader(ruta);
		BufferedReader br = new BufferedReader(fr);
		while((cadena = br.readLine()) != null) {
			System.out.println(cadena);
		}
		br.close();
		
		} catch (FileNotFoundException nop){
			System.out.println("Archivo no encontrado");
		} catch (IOException nop2) {
			System.out.println("error");
		}
	}
}	
