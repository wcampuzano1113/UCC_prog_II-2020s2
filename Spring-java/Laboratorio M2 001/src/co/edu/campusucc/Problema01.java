package co.edu.campusucc;

import java.util.Scanner;

public class Problema01 {
	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|       Autor: Walter Campuzano         |");
		System.out.println("|        Ingenieria Industrial          |");
		System.out.println("|---------------------------------------|");
		System.out.println("|                                       |");
		System.out.println("+---------------------------------------+");
		
		int res1, res2 = 0;
		boolean k1 = false, k2 = false, k;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("La tierra es redonda?[0]...falso [1]...verdad");
			res1 = leer.nextInt();
			System.out.println("25 es un cuadrado perfecto?[0]...falso [1]...verdad");
			res2 = leer.nextInt();
		}
		
		if (res1!=0) k1= true;
		if (res2!=0) k2= true;
		
		k= k1 && k2;
		
		System.out.println("El valor final de la variable k es: " +k);
			
	}
}
