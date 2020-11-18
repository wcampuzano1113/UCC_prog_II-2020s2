package ciclos_repetitivos;

import java.util.Scanner;

public class ejercicio03 {
	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|       Autor: Walter Campuzano         |");
		System.out.println("|        Ingenieria Industrial          |");
		System.out.println("|---------------------------------------|");
		System.out.println("|                                       |");
		System.out.println("+---------------------------------------+");
			
		int numero, invertido=0, cifra, aux;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("Ingrese un numero para comprobar si es capicua: ");
			numero = leer.nextInt();
		}	while (numero < 10);
		
		aux = numero;
		while (aux != 0) {
			cifra = aux % 10;
			invertido = invertido * 10 + cifra;
			aux = aux / 10; 
			}
	
	if (numero == invertido) {
		System.out.println("El numero es capicua");
	}
	else {
		System.out.println("El numero no es capicua");
	}
	}	
}
