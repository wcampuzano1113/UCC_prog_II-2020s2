package co.edu.campusucc.TallerM3001;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|       Autor: Walter Campuzano         |");
		System.out.println("|        Ingenieria Industrial          |");
		System.out.println("|---------------------------------------|");
		System.out.println("|                                       |");
		System.out.println("+---------------------------------------+");
	
		String nom="";
		double sueldo=0, sueldot=0;
		int cate;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("Digite el nombre del empleado");
			nom = leer.next();
			System.out.println("Digite la categoria por favor");
			cate = leer.nextInt();
			System.out.println("Digite el sueldo por favor");
			sueldo = leer.nextDouble();
		}
		
		switch(cate) {
		case 1:
			sueldot=sueldo*1.15;
			break;
		case 2: 
			sueldot=sueldo*1.10;
			break;
		case 3: 
			sueldot=sueldo*1.8;
			break;
		case 4: 
			sueldot=sueldo*1.7;
			break;
		default: 
		case 0:
			System.out.println("La categoria no existe");
			break;
		
		} System.out.println("el sueldo a pagar para "+nom+" es: "+sueldot);
	}

}
