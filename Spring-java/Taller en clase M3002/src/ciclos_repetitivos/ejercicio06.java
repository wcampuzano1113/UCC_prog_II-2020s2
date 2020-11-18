package ciclos_repetitivos;

import java.util.Scanner;

public class ejercicio06 {
	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|       Autor: Walter Campuzano         |");
		System.out.println("|        Ingenieria Industrial          |");
		System.out.println("|---------------------------------------|");
		System.out.println("|                                       |");
		System.out.println("+---------------------------------------+");
		
	int numero=0, i,a=0 ;
	
	try (Scanner leer = new Scanner(System.in)) {
		System.out.println("Ingrese un numero: ");
		numero = leer.nextInt();	
	}
	
	for (i = 1; i < (numero + 1 ); i++) {
	if (numero % i == 0) {
		a++;
	}
}
	if(a!=2){
        System.out.println("No es Primo");
      }else{
          System.out.println("Si es Primo");
      }
	}
}
