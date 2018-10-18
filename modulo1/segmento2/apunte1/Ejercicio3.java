import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Ingrese un número: ");
		String number1 = keyboard.nextLine();

		System.out.print("Ingrese otro número: ");
		String number2 = keyboard.nextLine();

		System.out.print("Ingrese otro número: ");
		String number3 = keyboard.nextLine();

		System.out.print("Ingrese otro número: ");
		String number4 = keyboard.nextLine();

		System.out.print("Ingrese otro número: ");
		String number5 = keyboard.nextLine();

		System.out.println("Orden inverso de los números ingresados: "								   + number5 + number4 + number3 + number2 + number1);
	}
}
