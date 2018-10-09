using System;

namespace ejercicio1.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Insertar nombre de su barrio: ");
			string barrio = Console.ReadLine();

			Console.Write("Insertar direccion postal de la comisaria más cercana: ");
			string postal = Console.ReadLine();

			Console.Write("Insertar entrecalle uno: ");
			string entre1 = Console.ReadLine();

			Console.Write("Insertar entrecalle dos: ");
			string entre2 = Console.ReadLine();

			Console.WriteLine("La comisaría de " + barrio + " se encuentra en " + postal
				+ " entre las entrecalles " + entre1 + " y " + entre2 );
        }
    }
}
