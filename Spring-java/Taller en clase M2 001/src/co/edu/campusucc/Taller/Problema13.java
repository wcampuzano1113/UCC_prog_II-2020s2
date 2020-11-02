package co.edu.campusucc.Taller;

import java.util.Scanner;

public class Problema13 {
	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|       Autor: Walter Campuzano         |");
		System.out.println("|        Ingenieria Industrial          |");
		System.out.println("|---------------------------------------|");
		System.out.println("|                                       |");
		System.out.println("+---------------------------------------+");

		int caracol = 0, cienpies = 0, gusano = 0, cuentaca = 0, cuentaci = 0, cuentagu = 0, pasosca=0, pasosci=0, pasosgu=0, muro=0;

		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("Ingrese cuanto mide el muro: ");
			muro = leer.nextInt();
			System.out.println("Ingrese cuanto avanza el caracol: ");
			pasosca = leer.nextInt();
			System.out.println("Ingrese cuanto avanza el cienpies: ");
			pasosci = leer.nextInt();
			System.out.println("Ingrese cuanto avanza el gusano: ");
			pasosgu = leer.nextInt();
		}
		
		
		for (caracol = 0; caracol < muro; caracol++) {
			if (caracol % pasosca == 0) {
				cuentaca += 1;
			}
		}
		System.out.println("El caracol tardaría " + cuentaca + " días en subir el muro");

		for (cienpies = 0; cienpies < muro; cienpies++) {
			if (cienpies % pasosci == 0) {
				cuentaci += 1;
			}
		}
		System.out.println("El cienpies tardaría " + cuentaci + " días en subir el muro");

		for (gusano = 0; gusano < muro; gusano++) {
			if (gusano % pasosgu == 0) {
				cuentagu += 1;
			}
		}
		System.out.println("El gusano tardaría " + cuentagu + " días en subir el muro");

	}
}
