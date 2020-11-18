package co.edu.campusucc.TallerM3001;

import java.util.Scanner;

public class ejercicio06 {
	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|       Autor: Walter Campuzano         |");
		System.out.println("|        Ingenieria Industrial          |");
		System.out.println("|---------------------------------------|");
		System.out.println("|                                       |");
		System.out.println("+---------------------------------------+");
	
		String Marca="";
		int cargo = 0, Servicio = 0, vtotal = 0;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("Digite el tipo de carro:");
			System.out.println("						");
			System.out.println("    MAZDA               ");
			System.out.println("    RENAULT             ");
			System.out.println("	CHEVROLET           ");
			System.out.println("	FIAT				");
			System.out.println("	DODGE				");
			System.out.println("	OTROS				");
			System.out.println("						");
			Marca = leer.nextLine();
		
		switch (Marca) {
			case "mazda":
				cargo=5000;
				System.out.println("Digite un servicio adicional");
				System.out.println("							");
				System.out.println("    1               		");
				System.out.println("    2            			");
				System.out.println("	3           			");
				System.out.println("	4						");
				System.out.println("	5						");
				System.out.println("	6						");
				System.out.println("							");
				Servicio = leer.nextInt();
				switch (Servicio) {
					case 1:
						vtotal=cargo+3500;
						break;
					case 2:
						vtotal=cargo+2800;
						break;
					case 3: 
						vtotal=cargo+1950;
						break;
					case 4:
						vtotal=cargo+2750;
						break;
					case 5:
						vtotal=cargo+3000;
						break;
					case 6:
						vtotal=cargo+1600;
						break;
				default: System.out.println("Digite un codigo de servicio valido");
				}
			break;
			
			case "reanult":
				cargo=3000;
				System.out.println("Digite un servicio adicional");
				System.out.println("							");
				System.out.println("    1               		");
				System.out.println("    2            			");
				System.out.println("	3           			");
				System.out.println("	4						");
				System.out.println("	5						");
				System.out.println("	6						");
				System.out.println("							");
				Servicio = leer.nextInt();	
				switch (Servicio) {
					case 1:
						vtotal=cargo+3500;
						break;
					case 2:
						vtotal=cargo+2800;
						break;
					case 3: 
						vtotal=cargo+1950;
						break;
					case 4:
						vtotal=cargo+2750;
						break;
					case 5:
						vtotal=cargo+3000;
						break;
					case 6:
						vtotal=cargo+1600;
						break;
				default: System.out.println("Digite un codigo de servicio valido");
				}
			break;
			
			case "chevrolet":
				cargo=2500;
				System.out.println("Digite un servicio adicional");
				System.out.println("							");
				System.out.println("    1               		");
				System.out.println("    2            			");
				System.out.println("	3           			");
				System.out.println("	4						");
				System.out.println("	5						");
				System.out.println("	6						");
				System.out.println("							");
				Servicio = leer.nextInt();
				switch (Servicio) {
					case 1:
						vtotal=cargo+3500;
						break;
					case 2:
						vtotal=cargo+2800;
						break;
					case 3: 
						vtotal=cargo+1950;
						break;
					case 4:
						vtotal=cargo+2750;
						break;
					case 5:
						vtotal=cargo+3000;
						break;
					case 6:
						vtotal=cargo+1600;
						break;
				default: System.out.println("Digite un codigo de servicio valido");
				}
			break;
			
			case "fiat":
				cargo=2000;
				System.out.println("Digite un servicio adicional");
				System.out.println("							");
				System.out.println("    1               		");
				System.out.println("    2            			");
				System.out.println("	3           			");
				System.out.println("	4						");
				System.out.println("	5						");
				System.out.println("	6						");
				System.out.println("							");
				Servicio = leer.nextInt();
				switch (Servicio) {
					case 1:
						vtotal=cargo+3500;
						break;
					case 2:
						vtotal=cargo+2800;
						break;
					case 3: 
						vtotal=cargo+1950;
						break;
					case 4:
						vtotal=cargo+2750;
						break;
					case 5:
						vtotal=cargo+3000;
						break;
					case 6:
						vtotal=cargo+1600;
						break;
				default: System.out.println("Digite un codigo de servicio valido");
				}
			break;
			
			case "dodge":
				cargo=2200;
				System.out.println("Digite un servicio adicional");
				System.out.println("							");
				System.out.println("    1               		");
				System.out.println("    2            			");
				System.out.println("	3           			");
				System.out.println("	4						");
				System.out.println("	5						");
				System.out.println("	6						");
				System.out.println("							");
				Servicio = leer.nextInt();
				switch (Servicio) {
					case 1:
						vtotal=cargo+3500;
						break;
					case 2:
						vtotal=cargo+2800;
						break;
					case 3: 
						vtotal=cargo+1950;
						break;
					case 4:
						vtotal=cargo+2750;
						break;
					case 5:
						vtotal=cargo+3000;
						break;
					case 6:
						vtotal=cargo+1600;
						break;
				default: System.out.println("Digite un codigo de servicio valido");
				}
			break;
			
			case "otros":
				cargo=1700;
				System.out.println("Digite un servicio adicional");
				System.out.println("							");
				System.out.println("    1               		");
				System.out.println("    2            			");
				System.out.println("	3           			");
				System.out.println("	4						");
				System.out.println("	5						");
				System.out.println("	6						");
				System.out.println("							");
				Servicio = leer.nextInt();
				switch (Servicio) {
					case 1:
						vtotal=cargo+3500;
						break;
					case 2:
						vtotal=cargo+2800;
						break;
					case 3: 
						vtotal=cargo+1950;
						break;
					case 4:
						vtotal=cargo+2750;
						break;
					case 5:
						vtotal=cargo+3000;
						break;
					case 6:
						vtotal=cargo+1600;
						break;
				default: System.out.println("Digite un codigo de servicio valido");
				}
			break;
		default: System.out.println("Digite una marca valida");	
		}
	
	
		System.out.println("El valor total a pagar es: "+vtotal);
	}
}
}
