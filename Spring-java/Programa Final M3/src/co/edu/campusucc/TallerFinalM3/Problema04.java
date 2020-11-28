package co.edu.campusucc.TallerFinalM3;

import java.util.Scanner;

public class Problema04 {
		public static void main(String[] args) {
			System.out.println("+---------------------------------------+");
			System.out.println("|       Autor: Walter Campuzano         |");
			System.out.println("|        Ingenieria Industrial          |");
			System.out.println("|---------------------------------------|");
			System.out.println("|                                       |");
			System.out.println("+---------------------------------------+");

		double nota1, nota2, nota3;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("Escriba la primera nota: ");
			nota1 = leer.nextDouble();
			System.out.println("Escriba la segunta nota: ");
			nota2 = leer.nextDouble();
			System.out.println("Escriba la tercera nota: ");
			nota3 = leer.nextDouble();
		}	

		double Notadefinitiva = ((nota1*0.3)+(nota2*0.3)+(nota3*0.4));
		
		System.out.println("La nota definitiva es: "+Notadefinitiva);
		
		}		
}