Proceso Ejercicio_Final
// las cantidades de pan a=algebrin, b=Dividin, Hombre rico=c,total de pan=d
	Definir a, b, c, d Como Entero;
	a<-5; b<-3; c<-0; d<-0;
	
//Asi fue como se dividieron los panes
	a<-a*3; b<-b*3; 
	d<-(a+b)/3;
	
//Así fue como se comieron los panes
	a<-a-8; b<-b-8; c<-a+b;
	
	Escribir "La cantidad de pan consumido por cada uno: ", d;
	Escribir "La cantidad de monedas en total que debe entregar el hombre rico son: ", c;
	Escribir "La cantidad de monedas para Algebrín son: ", a;
	Escribir "La cantidad de monedas para Dividín son: ", b;
	
FinProceso
