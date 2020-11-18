package ciclos_repetitivos;

import java.util.Scanner;

public class ejercicio05 {
	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|       Autor: Walter Campuzano         |");
		System.out.println("|        Ingenieria Industrial          |");
		System.out.println("|---------------------------------------|");
		System.out.println("|                                       |");
		System.out.println("+---------------------------------------+");
	
		
		int numero, i=0, d, mayor=0;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("Ingrese un numero: ");
			numero = leer.nextInt();
		}
		while (numero > 0) {
			if (i==0) {
				d=numero % 10;
				mayor=d;
				numero = numero / 10;
				i++;
			}
			else {
				d = numero % 10;
				numero = numero / 10;
				if (mayor < d) {
					mayor = d;
				}
			}
			}
		System.out.println("el digito mayor es: " +mayor );
		}
		
	}	


