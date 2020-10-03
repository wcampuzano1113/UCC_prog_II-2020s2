Proceso Entrenamiento_05
	//Definir Variables
	Definir x Como Entero;
	Definir yy Como Logico;
	Definir c Como Caracter;
	
	x<- 10; yy<- Falso; c<- 'a';
	si x>0 Entonces
		yy<-Verdadero; // Al ser x un entero se debe asignar como un valor logico
	SiNo
		yy<-Falso;
	FinSi
	
	c<- 'b';
	yy<- Verdadero;
	
	Escribir "El valor de x es: ", x;
	Escribir "El valor de yy es: ", yy;
	Escribir "El valor de c es: ", c;
	
FinProceso
