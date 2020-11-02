package co.edu.campusucc.Taller;

import java.util.Scanner;

public class Problema06 {
		public static void main(String[] args) {
			System.out.println("+---------------------------------------+");
			System.out.println("|       Autor: Walter Campuzano         |");
			System.out.println("|        Ingenieria Industrial          |");
			System.out.println("|---------------------------------------|");
			System.out.println("|                                       |");
			System.out.println("+---------------------------------------+");
		
			double costo=0, pago=0, dev;
			
			try (Scanner leer = new Scanner(System.in)) {
				System.out.println("Ingrese el costo del artículo: ");
				costo = leer.nextDouble();
				System.out.println("Ingrese el efectivo del cliente: ");
				pago = leer.nextDouble();
				
			}
			
			dev=pago - costo;
			System.out.println("El cambio para el cliente es: "+dev);
				
		}

	}

