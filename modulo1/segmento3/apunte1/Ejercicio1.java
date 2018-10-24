import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese un número: ");
		Integer number = teclado.nextInt();

		if(number == 10)
				System.out.println("El número ingresado es 10");
	}
}
