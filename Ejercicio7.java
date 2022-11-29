import java.util.Scanner;

/**
*
*	Ejercicio 7,  Realiza el control de acceso a una caja fuerte. La combinación será un
* número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
* acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
* y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
* Tendremos cuatro oportunidades para abrir la caja fuerte.
* 
*	Nombre del archivo: Ejercicio7.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio7 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		//Definimos la clave de la contraseña.
		int clave = 4876;
		
		//Definimos el bucle for para introducir la contraseña.
		for (int i = 1; i <= 4; i++) {
			
			System.out.println("Por favor, introduce la combinacion. (son 4 cifras)");
			int contraseña = datos.nextInt();
			
			if (clave == contraseña) {
				System.out.println("Clack, la caja fuerte se ha abierto satisfactoriamente.");
			} else {
				System.out.println("Bip, Lo siento, esa no es la combinación.");
			}
			
		}
		
	}
}
