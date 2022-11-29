import java.util.Scanner;

/**
*
*	Ejercicio 1,  Calcula la nota de un trimestre de la asignatura Programación.
* El programa pedirá las dos notas que ha sacado el alumno
* en los dos primeros controles.
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
