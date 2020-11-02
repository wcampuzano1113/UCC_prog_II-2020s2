package co.edu.campusucc.Taller;

import java.util.Scanner;

public class Problema09 {
	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|       Autor: Walter Campuzano         |");
		System.out.println("|        Ingenieria Industrial          |");
		System.out.println("|---------------------------------------|");
		System.out.println("|                                       |");
		System.out.println("+---------------------------------------+");
	
	Double ValorH,DiasT,HorasD, HorasT, Salario, HorasEx=null, PagoHEx, Desc, PagoT, HorasTo;
	
	try (Scanner leer = new Scanner(System.in)) {
		System.out.println("Ingrese el valor de la hora laboral: ");
		ValorH = leer.nextDouble();
		System.out.println("Ingrese la cantidad de días trabajados: ");
		DiasT= leer.nextDouble();
		System.out.println("Ingrese la cantidad de horas trabajadas: ");
		HorasT = leer.nextDouble();
	}
		HorasD=DiasT*8;
		
		HorasTo=HorasT+HorasD;
	
	if (HorasTo>48) {
		HorasEx=HorasTo-48;
	}
	PagoHEx=HorasEx*0.5*ValorH;
	
	Salario=(HorasTo-HorasEx)*ValorH+PagoHEx;
	Desc=Salario*0.12;
	PagoT=Salario-Desc;
	
	System.out.println("Su Salario es de: "+Salario);
	System.out.println("El descuento de seguro social es de: "+Desc);
	System.out.println("Su pago total sería de: "+PagoT );
	
	
 }
	

}
