import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Ingrese el nombre de su barrio: ");
		String barrio = keyboard.nextLine();

		System.out.print("Ingrese la dirección postal de la comisaria más cercana: ");
		String postal = keyboard.nextLine();

		System.out.print("Ingrese las entrecalles: ");
		String entrecalles = keyboard.nextLine();

		System.out.println("La comisaría de " + barrio + " se encuentra en la calle " + postal + " entre " + entrecalles + ".");
	}
}
