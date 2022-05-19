punlic interface Prueba_Examen{
	public void Mensaje_Hola(){
		System.out.println("Hola mi nombre es Jaime");
	}

	public void Mensaje_Hola(String cadena){
		System.out.println("La cadena es: " + cadena);
	}

	public static int Operacion_Prueba (int a, int b){
		return a + b;
	}

	public abstract void Operacion_Prueba (int a, int b, int c);
}