package ciclos_repetitivos;

import java.util.Random;

public class Numeros_primos {
	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|       Autor: Walter Campuzano         |");
		System.out.println("|        Ingenieria Industrial          |");
		System.out.println("|---------------------------------------|");
		System.out.println("|                                       |");
		System.out.println("+---------------------------------------+");
	
	
		Random random = new Random ();
		int numero = random.nextInt(1000);
		boolean esPrimo = verificaPrimo (numero);
		System.out.println("El numero "+numero+ " es primo? " +esPrimo);
	}
	
	public static boolean verificaPrimo(int numero) {
		boolean esPrimo = true;
		int numerosDivisibles = 0;
		int numerosDivisiblesPrimo=2;
		
		for (int i=1; i<=numero; i++)
			if (numero % i==0)
				numerosDivisibles++;
		
		if (numerosDivisibles == numerosDivisiblesPrimo)
			esPrimo = true;
		
		return esPrimo;
	}
}
