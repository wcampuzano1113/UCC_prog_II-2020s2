package co.edu.campusucc.TallerFinalM3;

import java.util.Scanner;

public class Problema02 {
		public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|       Autor: Walter Campuzano         |");
		System.out.println("|        Ingenieria Industrial          |");
		System.out.println("|---------------------------------------|");
		System.out.println("|                                       |");
		System.out.println("+---------------------------------------+");

		double numero = 0;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("Escriba un numero por favor");
			numero = leer.nextInt();
		}
		double cubo = Math.pow(numero, 3);
		
		System.out.println("El cubo del número es: " + cubo);
				
		}
}
