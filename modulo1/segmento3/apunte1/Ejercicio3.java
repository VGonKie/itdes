import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese su genero (Masculino o Femenino): ");
		String sex = teclado.nextLine();

		if(sex.equals("Femenino"))
			System.out.println("Su genero es Femenino");
	}
}
