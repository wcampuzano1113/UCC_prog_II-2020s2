package co.edu.campusucc.TallerFinalM3;

import java.util.Scanner;

public class Problema05 {
	private static String nombre;

	public static void main(String[] args) {
	System.out.println("+---------------------------------------+");
	System.out.println("|       Autor: Walter Campuzano         |");
	System.out.println("|        Ingenieria Industrial          |");
	System.out.println("|---------------------------------------|");
	System.out.println("|                                       |");
	System.out.println("+---------------------------------------+");

	nombre = "";
	Double Salario, Descuento, Valorpago;
	
	try (Scanner leer = new Scanner(System.in)) {
		System.out.println("Escriba el nombre del empleado: ");
		nombre = leer.nextLine();
		System.out.println("Escriba el salario: ");
		Salario = leer.nextDouble();
		System.out.println("Escriba el descuento: ");
		Descuento = leer.nextDouble();
	}
	
	Valorpago = Salario - Descuento;
	
	System.out.println("El valor a pagar es: " + Valorpago);
	
	}

}

