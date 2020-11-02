package co.edu.campusucc.Taller;

import java.util.Scanner;

public class Problema10 {
	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|       Autor: Walter Campuzano         |");
		System.out.println("|        Ingenieria Industrial          |");
		System.out.println("|---------------------------------------|");
		System.out.println("|                                       |");
		System.out.println("+---------------------------------------+");

		int numero = 0, sumDig = 0;

		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("Ingrese el numero que desea sumarle los digios: ");
			numero = leer.nextInt();
		}
		int numd = numero;

		while (numero != 0) {

			sumDig = sumDig + (numero % 10);

			numero = numero / 10;
		}

		System.out.println("La suma de los digitos de " + numd + " es: " + sumDig);

	}

}
