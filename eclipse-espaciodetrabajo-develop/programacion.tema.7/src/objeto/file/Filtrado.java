package objeto.file;
import java.io.File;
import java.util.Scanner;

public class Filtrado {
	
	/*++++++++++++++++ESTA HECHO PERO SIN APLICAR LA CLASE FILTRO+++++++++++++++++++++++*/
	//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Filtrado.listado();
		} catch (Exception e) {
			System.out.println("error");
		}
		
	}
	
	//metodos
	public static void listado() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe el nombre del directorio");
		String ruta = sc.next();
		File directorio = new File(ruta);
		if(directorio.isDirectory()) {
			System.out.println("Escribe la extension(sin punto)");
			String extension = sc.next();
			File[] archivos = directorio.listFiles();
			for(int i = 0; i<archivos.length; i++) {
				if(archivos[i].getName().endsWith("." + extension)) {
					System.out.println(archivos[i].getName());
				}
			}
		} else {
			System.out.println("Tienes que elegir un directorio");
		}
		sc.close();
	}
}

