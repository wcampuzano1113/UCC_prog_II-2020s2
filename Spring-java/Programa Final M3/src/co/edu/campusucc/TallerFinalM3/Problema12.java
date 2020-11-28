package co.edu.campusucc.TallerFinalM3;

import java.util.Scanner;

public class Problema12 {
	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|       Autor: Walter Campuzano         |");
		System.out.println("|        Ingenieria Industrial          |");
		System.out.println("|---------------------------------------|");
		System.out.println("|                                       |");
		System.out.println("+---------------------------------------+");

		int numero = 0;

		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("Ingrese el numero que desea saber su valor absoluto: ");
			numero = leer.nextInt();
		}

		System.out.println("El valor absoluto del numero es: |" + Math.abs(numero) + "|");

	}
}
