/**
*
*	Ejercicio 5,  Muestra los números del 320 al 160, contando de 20 en 20
* hacia atrás utilizando un bucle while.
* 
*	Nombre del archivo: Ejercicio5.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio5 {
	public static void main(String[] args) {
		
		//Definimos la variable i.
		int i = 320;
		
		//Definimos el bucle while.
		while (i >= 160) {
			System.out.println(i);
			i = i - 20;
		}
		
	}
}
