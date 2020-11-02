package co.edu.campusucc.Taller;

import java.util.Scanner;

public class Problema03 {
	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|       Autor: Walter Campuzano         |");
		System.out.println("|        Ingenieria Industrial          |");
		System.out.println("|---------------------------------------|");
		System.out.println("|                                       |");
		System.out.println("+---------------------------------------+");
		
		int a,b;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("Escriba el primer número: ");
			a = leer.nextInt();
			System.out.println("Escriba el segundo número: ");
			b = leer.nextInt();
		}

		int suma = a + b;
		int resta = a - b;
		int producto = a * b;
		double promedio = suma / 2;
		
		System.out.println("Los resultados son los siguientes:");
		System.out.println("LA SUMA ES: "+suma);
		System.out.println("LA RESTA ES: "+resta);
		System.out.println("EL PRODUCTO ES: "+producto);
		System.out.println("EL PROMEDIO ES: "+promedio);
				
	}	
}
