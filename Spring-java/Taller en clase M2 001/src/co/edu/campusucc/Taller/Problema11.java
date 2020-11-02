package co.edu.campusucc.Taller;

import java.util.Scanner;

public class Problema11 {
	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|       Autor: Walter Campuzano         |");
		System.out.println("|        Ingenieria Industrial          |");
		System.out.println("|---------------------------------------|");
		System.out.println("|                                       |");
		System.out.println("+---------------------------------------+");

		Double ValorH, HorasD, HorasT, Salario, HorasEx = null, PagoHEx;

		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("Ingrese el valor de la hora laboral: ");
			ValorH = leer.nextDouble();
			System.out.println("Ingrese la cantidad de horas trabajadas: ");
			HorasT = leer.nextDouble();
		}

		if (HorasT > 48) {
			HorasEx = HorasT - 48;
		}
		PagoHEx = HorasEx * 0.2 * ValorH;

		Salario = (HorasT - HorasEx) * ValorH + PagoHEx;

		System.out.println("Su Salario es de: " + Salario);

	}

}

