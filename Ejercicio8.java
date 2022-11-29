import java.util.Scanner;

/**
*
*	Ejercicio 8,  Muestra la tabla de multiplicar de un número introducido por teclado.
* 
*	Nombre del archivo: Ejercicio8.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio8 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca un número por teclado.
		System.out.print("Por favor, introduce el número que desees mostrar su tábla de multiplicar: ");
		int n = datos.nextInt();
		System.out.printf("TABLA DE MULTIPLICAR DEL %s\n", n);
		
		//Definimos el bucle for.
		for (int i = 1; i <= 10; i++) {
			int mult = n * i;
			System.out.printf("%s * %s = %s\n",i , n, mult);
		}
		
	}
}
