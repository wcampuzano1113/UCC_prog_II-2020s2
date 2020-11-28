package co.edu.campusucc.TallerFinalM3;

import java.util.Scanner;

public class Problema08 {
	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|       Autor: Walter Campuzano         |");
		System.out.println("|        Ingenieria Industrial          |");
		System.out.println("|---------------------------------------|");
		System.out.println("|                                       |");
		System.out.println("+---------------------------------------+");

		double minutosp = 2, pagm = 0.5, pag = 0, minutosf = 0, pagc = 0, tiempoc = 0;

		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("Ingrese cantidad de paginas escritas: ");
			pag = leer.nextDouble();
			System.out.println("Ingrese el tiempo en minutos para calcular paginas: ");
			tiempoc = leer.nextDouble();
		}

		minutosf = pag * minutosp;
		pagc = tiempoc * pagm;

		System.out.println("El tiempo estimado para escribir "+pag+" paginas es de "+minutosf+" minutos");

		System.out.println("Las paginas que se escribiran en "+tiempoc+" minutos son: " + pagc);

	}

}
