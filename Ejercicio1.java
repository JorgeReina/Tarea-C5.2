import java.util.Scanner;

/**
*
*	Ejercicio 1,  Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
* 
*	Nombre del archivo: Ejercicio1.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio1 {
	public static void main(String[] args) {
		
		for (int i = 5; i <= 100; i++) {
			
			int mult5 = i % 5;
			if (mult5 == 0) {
				System.out.printf("El %s es multiplo de 5\n", i);
			}
			
		}
		
	}
}
