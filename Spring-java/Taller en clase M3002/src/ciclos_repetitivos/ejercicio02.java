package ciclos_repetitivos;

import java.util.Scanner;

public class ejercicio02 {
	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|       Autor: Walter Campuzano         |");
		System.out.println("|        Ingenieria Industrial          |");
		System.out.println("|---------------------------------------|");
		System.out.println("|                                       |");
		System.out.println("+---------------------------------------+");
	
		int numero, rsuma=0;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("Ingrese un numero para sumarle sus digitos: ");
			numero = leer.nextInt();
		}
		
		while (numero > 0) {
			rsuma += numero % 10;
			numero = numero / 10;
		}
			
		System.out.println("Los digitos sumados dan como resultado: "+rsuma);
		
		
	}	

}
