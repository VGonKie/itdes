import java.util.Scanner;

public class Ejercicio6{
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Ingrese un número: ");
		Integer number1 = keyboard.nextInt();

		System.out.print("Ingrese otro número: ");
		Integer number2 = keyboard.nextInt();

		Integer result=number1 * number2;
		System.out.println("El resultado de la multiplicación es: " +result.toString());
	}
}
