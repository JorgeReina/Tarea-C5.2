/**
*
*	Ejercicio 2,  Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
* 
*	Nombre del archivo: Ejercicio2.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio2 {
	public static void main(String[] args) {
		
		//Definimos la variable i.
		int i = 1;
		
		//Definimos el bucle while donde comprobamos si es multiplo de 5.
		while (i < 100) {
			
			i++;
			int mult5 = i % 5;
			
			if (mult5 == 0) {
				System.out.printf("El %s es multiplo de 5\n", i);
			}
			
		}
		
	}
}
