package co.edu.campusucc.TallerFinalM3;

public class Problema01 {
	public static void main(String[] args) {
	System.out.println("+---------------------------------------+");
	System.out.println("|       Autor: Walter Campuzano         |");
	System.out.println("|        Ingenieria Industrial          |");
	System.out.println("|---------------------------------------|");
	System.out.println("|                                       |");
	System.out.println("+---------------------------------------+");
	
	int tela=0, cuentat=0;
	
	for (tela = 2; tela < 12; tela++) {
	    if (tela % 2 == 0) {
	        cuentat += 1;
	    }
	}
	System.out.println("la tela tarda "+cuentat+" días para poder seguir cortando de a 2 metros");
	System.out.println("ya que al sexto día quedarían solo 2 metros y no se podría seguir cortando de a 2 metros");
	}
}
