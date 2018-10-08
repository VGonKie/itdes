import java.util.Scanner;

public class Ejercicio2{
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Ingrese su DNI: ");
		Integer DNI = keyboard.nextInt();
		keyboard.nextLine();

		System.out.print("Ingrese su nombre y apellido: ");
		String name = keyboard.nextLine();

		System.out.print("Ingrese su Dirección: ");
		String dir = keyboard.nextLine();

		System.out.print("Ingrese su teléfono: ");
		Integer phone = keyboard.nextInt();
		keyboard.nextLine();

		System.out.println("Nombre y Apellido: " + name + ", DNI: " + DNI.toString() + ", Dirección: " + dir + ", Teléfono: " + phone.toString());
	}
}
