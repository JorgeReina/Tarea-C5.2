/**
*
*	Ejercicio 6,  Muestra los números del 320 al 160, contando de 20 en 20
* utilizando un bucle do-while.
* 
*	Nombre del archivo: Ejercicio6.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio6 {
	public static void main(String[] args) {
		
		//Definimos la variable i.
		int i = 320;
		
		//Definimos el bucle do-while.
		do {
			System.out.println(i);
			i = i - 20;
		}while (i >=160);
		
	}
}
