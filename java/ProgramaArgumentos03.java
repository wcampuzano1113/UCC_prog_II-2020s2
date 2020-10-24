public class ProgramaArgumentos03 {
  public static void main(String[] args) {
	System.out.println("+-------------------------------------------------+");
	System.out.println("|             Autor: Walter Campuzano             |");
	System.out.println("|              Ingenieria Industrial              |");
	System.out.println("|-------------------------------------------------|");
	System.out.println("|Programa Argumentos 03: Multiplicacion de enteros|");
	System.out.println("+-------------------------------------------------+");
	
	System.out.println("argumento 1 = "+args[0]);
	System.out.println("argumento 2 = "+args[1]);
	
	int num1 = Integer.parseInt(args[0]);
	int num2 = Integer.parseInt(args[1]);
	int resultadoMultiplicacion = num1 * num2;
	
	System.out.println("Operacion Matematica: num1 = "+num1+", num2 = "+num2);
	System.out.println("MULTIPLICACION num1 * num2 = "+resultadoMultiplicacion);
  }
}