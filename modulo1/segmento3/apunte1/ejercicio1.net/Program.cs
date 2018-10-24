using System;

namespace ejercicio1.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un número: ");
			int number = Int32.Parse(Console.ReadLine());

			if(number == 10)
					Console.WriteLine("El número ingresado es 10");
        }
    }
}
