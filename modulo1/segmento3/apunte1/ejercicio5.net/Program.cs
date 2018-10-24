using System;

namespace ejercicio5.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Genero:");
			string sex = Console.ReadLine();

			Console.WriteLine("Edad: ");
			int age = Int32.Parse(Console.ReadLine());

			if(sex == "Masculino")
			Console.WriteLine("Usted es Hombre");

			if(age >= 18)
			Console.WriteLine("Usted es mayor de edad");
        }
    }
}
