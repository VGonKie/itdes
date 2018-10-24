import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese un número: ");
		Integer number1 = Integer.parseInt(teclado.nextLine());

		System.out.print("Ingrese otro número: ");
		Integer number2 = Integer.parseInt(teclado.nextLine());

		System.out.print("Ingrese otro número: ");
		Integer number3 = Integer.parseInt(teclado.nextLine());

		System.out.print("Ingrese otro número: ");
		Integer number4 = Integer.parseInt(teclado.nextLine());

		if(number1 == number2)
			System.out.println(number1.toString() + " y " + number2.toString() +							 " son iguales");

		if(number3 == number4)
			System.out.println(number3.toString() + " y " + number4.toString() +							 " son iguales");
	}
}
