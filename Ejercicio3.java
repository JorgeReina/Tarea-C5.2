/**
*
*	Ejercicio 3,  Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
* 
*	Nombre del archivo: Ejercicio3.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio3 {
	public static void main(String[] args) {
		
		//Definimos la variable i.
		int i = 1;
		
		//Definimos el bucle do-while donde comprobamos si es multiplo de 5.
		do {
			
			i++;
			
			int mult5 = i % 5;
			
			if (mult5 == 0) {
				System.out.printf("El %s es multiplo de 5\n", i);
			}
			
		} while (i < 100);
		
	}
}
