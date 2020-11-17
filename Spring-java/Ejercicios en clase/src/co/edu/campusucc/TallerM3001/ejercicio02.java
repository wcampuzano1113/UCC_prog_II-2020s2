package co.edu.campusucc.TallerM3001;

import java.util.Scanner;

public class ejercicio02 {
	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|       Autor: Walter Campuzano         |");
		System.out.println("|        Ingenieria Industrial          |");
		System.out.println("|---------------------------------------|");
		System.out.println("|                                       |");
		System.out.println("+---------------------------------------+");

	int semestre=0;
	String nombre="", programa="";
	double total=0;
	
	
	try (Scanner leer = new Scanner(System.in)) {
		System.out.println("Digite el nombre del estudiante");
		nombre = leer.next();
		System.out.println("Digite el nombre del programa academico");
		programa = leer.next();
		System.out.println("Digite el semestre por favor");
		semestre = leer.nextInt();
		
	}
	
	switch(semestre) {
	case 1:
	case 2:	
	case 3: 
		break;
	case 4:
	case 5:	
	case 6:
	case 7: 	
		total=2220+4000+5000;
		break;
	case 8:
	case 9:
	case 10: 	
		total=3000+6000+7000;
		break;

	default:
	case 0:
		System.out.println("Semestre incorrecto");
		break;
	
	} System.out.println("el valor a pagar para "+nombre+" del programa de "+programa+" es: "+total);
	
	}
}
