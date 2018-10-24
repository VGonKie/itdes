import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Genero: ");
		String sex = teclado.nextLine();

		System.out.print("Edad: ");
		Integer age = Integer.parseInt(teclado.nextLine());

		if(sex.equals("Masculino"))
			System.out.println("Usted es hombre");

		if(age >= 18)
			System.out.println("Usted es mayor de edad");
	}
}
