package ciclos_repetitivos;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|       Autor: Walter Campuzano         |");
		System.out.println("|        Ingenieria Industrial          |");
		System.out.println("|---------------------------------------|");
		System.out.println("|                                       |");
		System.out.println("+---------------------------------------+");
		
		int numero, invertido=0, resto;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("Ingrese un numero: ");
			numero = leer.nextInt();
		}
				
		while (numero > 0 ) {
			resto = numero % 10;
			invertido = invertido * 10 + resto;
			numero /= 10;
			
		}
		
		System.out.println("El numero invertido es: "+invertido);
	}
}

