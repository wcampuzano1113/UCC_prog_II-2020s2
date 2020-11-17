public class ProgramaComparacion01 {
  public static void main(String[] args) {
	System.out.println("+---------------------------------------+");
	System.out.println("|       Autor: Walter Campuzano         |");
	System.out.println("|        Ingenieria Industrial          |");
	System.out.println("|---------------------------------------|");
	System.out.println("|Programa Argumentos 05: Comparacion    |");
	System.out.println("+---------------------------------------+");
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Ingrese un número decimal");
	int numero = scanner.nextInt();
	String binario = " ";
	if (numero>0)
		while (numero>0){
			if (numero % 2==0){
				binario="0" + binario;
			} else{
				binario = "1" + binario;
			}
			numero = numero /2;
		}
	else if (numero == 0){
		binario = "0";
	}else {
		binario="No se puede convertir";
	}
	System.out.prinln("El numero en binario es: "+binario);
  }
}

	
	