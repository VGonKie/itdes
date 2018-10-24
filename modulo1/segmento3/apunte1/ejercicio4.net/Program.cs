using System;

namespace ejercicio4.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un número: ");
			int number1 = Int32.Parse(Console.ReadLine());

			Console.WriteLine("Ingrese otro número: ");
			int number2 = Int32.Parse(Console.ReadLine());

            Console.WriteLine("Ingrese otro número: ");
			int number3 = Int32.Parse(Console.ReadLine());

            Console.WriteLine("Ingrese otro número: ");
			int number4 = Int32.Parse(Console.ReadLine());

			if(number1 == number2)
				Console.WriteLine(number1 + " y " + number2 + " son iguales");

			if(number3 == number4)
				Console.WriteLine(number3 + " y " + number4 + " son iguales");
        }
    }
}
