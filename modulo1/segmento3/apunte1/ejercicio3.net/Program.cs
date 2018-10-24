using System;

namespace ejercicio3.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese su genero (Masculino o Femenino): ");
			string sex = Console.ReadLine();

			if(sex=="Femenino")
				Console.WriteLine("Su genero es Femenino");
        }
    }
}
