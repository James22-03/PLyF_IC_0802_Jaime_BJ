public class Principal{
	public static void main (String args []){
		Principal.PE = Prueba_Examen();

		public static int Operacion_Prueba(int a, int b){
			System.out.println(a + b);
		}

		public void Mensaje_Hola();

		public void Mensaje_Hola("Hola");

		PE.Operacion_Prueba(int a, int b, int c){
			System.out.println(x -> a + (b * c));
		}

		PE.Operacion_Prueba(9,Operacion_Prueba(3,2), PE_Operacion_Prueba(5,4));

		MiMetodo (Prueba_Examen PE);

		MiMetodo (x -> a + (b/c));

		PE (x -> a + (b/c));

		MiMetodo (PE, 2,9,3);
	}

	private static void MiMetodo(PE Prueba_E){
		Prueba_E.Operacion_Prueba(9,Prueba_E.Operacion_Prueba(3,2),Prueba_E.Operacion_Prueba(5,4));
	}

	private static void MiMetodo(Object Prueba_Examen PEx, int a, int b, int c){
		PEx.Operacion_Prueba(a, PEx.Operacion_Prueba(b,b),PEx.Operacion_Prueba(c,c));
	}
}