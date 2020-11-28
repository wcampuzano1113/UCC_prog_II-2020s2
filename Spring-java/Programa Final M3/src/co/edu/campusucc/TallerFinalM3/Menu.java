package co.edu.campusucc.TallerFinalM3;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Menu {

	private static Path currentRelativePath;

	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|       Autor: Walter Campuzano         |");
		System.out.println("|        Ingenieria Industrial          |");
		System.out.println("|---------------------------------------|");
		System.out.println("|      Trabajo Final Momento 3          |");
		System.out.println("+---------------------------------------+");
	
		int ejercicios=0;
		String ejercicio2 = "";
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("Digite 1 para el Problema #1");
			System.out.println("Digite 2 para el Problema #2");
			System.out.println("Digite 3 para el Problema #3");
			System.out.println("Digite 4 para el Problema #4");
			System.out.println("Digite 5 para el Problema #5");
			System.out.println("Digite 6 para el Problema #6");
			System.out.println("Digite 7 para el Problema #7");
			System.out.println("Digite 8 para el Problema #8");
			System.out.println("Digite 9 para el Problema #9");
			System.out.println("Digite 10 para el Problema #10");
			System.out.println("Digite 11 para el Problema #11");
			System.out.println("Digite 12 para el Problema #12");
			System.out.println("Digite 13 para el Problema #13");
			ejercicios = leer.nextInt();
		
		switch (ejercicios) {
			case 1: 
				ejercicio2="java co.edu.campusucc.TallerFinalM3.Problema01";
				break;
			case 2:
				ejercicio2="java co.edu.campusucc.TallerFinalM3.Problema02";
				break;
			case 3:
				ejercicio2="java co.edu.campusucc.TallerFinalM3.Problema03";
				break;
			case 4:
				ejercicio2="java co.edu.campusucc.TallerFinalM3.Problema04";
				break;
			case 5:
				ejercicio2="java co.edu.campusucc.TallerFinalM3.Problema05";
				break;
			case 6:
				ejercicio2="java co.edu.campusucc.TallerFinalM3.Problema06";
				break;
			case 7:
				ejercicio2="java co.edu.campusucc.TallerFinalM3.Problema07";
				break;
			case 8:
				ejercicio2="java co.edu.campusucc.TallerFinalM3.Problema08";
				break;
			case 9:
				ejercicio2="java co.edu.campusucc.TallerFinalM3.Problema09";
				break;
			case 10:
				ejercicio2="java co.edu.campusucc.TallerFinalM3.Problema10";
				break;
			case 11:
				ejercicio2="java co.edu.campusucc.TallerFinalM3.Problema11";
				break;
			case 12:
				ejercicio2="java co.edu.campusucc.TallerFinalM3.Problema12";
				break;
			case 13:
				ejercicio2="java co.edu.campusucc.TallerFinalM3.Problema13";
				break;
			case 14:
				ejercicio2="java co.edu.campusucc.TallerFinalM3.Problema14";
				break;
			case 15:
				ejercicio2="java co.edu.campusucc.TallerFinalM3.Problema15";
				break;
			default: System.out.println("Digite un ejercicio valido"); 
			}
	
		try {
            setCurrentRelativePath(Paths.get(ejercicio2));
            System.out.println(ejercicio2);

            ProcessBuilder builder = new ProcessBuilder("java",ejercicio2);
            builder.redirectErrorStream(true);
            builder.inheritIO();
            Process process = builder.start();
            int errCode = process.waitFor();
            System.out.println("Error al ejecutar el comando? " + (errCode == 0 ? "No" : "Sí"));

        } catch (IOException e) {
            System.err.println("Error de lectoescritura");
        } catch (InterruptedException ex) {
            System.err.println("Problema con los hilos");
        }
    }
}

	public static Path getCurrentRelativePath() {
		return currentRelativePath;
	}

	public static void setCurrentRelativePath(Path currentRelativePath) {
		Menu.currentRelativePath = currentRelativePath;
	}
}
		
	
