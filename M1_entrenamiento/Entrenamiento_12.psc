Proceso Ejercicio_de_entrenamiento_12
	
	//Defino las variables
	Definir resp1, resp2, resp3, resp4, k Como Entero;
	
	Escribir "¿Benjamin Franklin inventó el pararrayos? ";
	Leer resp1;
	Escribir "¿Samuel Morse inventó el telégrafo? "; 
	Leer resp2;
	Escribir "¿Perú es un país suramericano? "; 
	Leer resp3;
	Escribir "¿5 es un número primo? "; 
	Leer resp4;
	
	Si (resp1>=resp2) y (resp3=resp4)
		entonces
		k<-1;
	SiNo
		k<-0;
		
	FinSi
	
	Escribir "El valor final vale", k;
	
FinProceso
