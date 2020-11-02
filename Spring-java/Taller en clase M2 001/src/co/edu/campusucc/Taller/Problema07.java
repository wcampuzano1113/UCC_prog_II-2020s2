package co.edu.campusucc.Taller;

import java.util.Scanner;

public class Problema07 {
	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|       Autor: Walter Campuzano         |");
		System.out.println("|        Ingenieria Industrial          |");
		System.out.println("|---------------------------------------|");
		System.out.println("|                                       |");
		System.out.println("+---------------------------------------+");
	
		double ValorHora, HorasT, Salario;
		String Nombre="";
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("Ingrese el Nombre del trabajador: ");
			Nombre = leer.nextLine();
			System.out.println("Ingrese el Valor de la hora de trabajo: ");
			ValorHora = leer.nextDouble();
			System.out.println("Ingrese la cantidad de horas trabajadas: ");
			HorasT = leer.nextDouble();
			
		}
		
		Salario = HorasT * ValorHora;
		
		System.out.println("El salario a pagar es: "+Salario);
		
			
	}	

}


