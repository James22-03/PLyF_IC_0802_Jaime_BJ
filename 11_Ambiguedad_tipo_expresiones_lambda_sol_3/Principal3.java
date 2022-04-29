public class Principal3{
	public static void main(String[] args){
		CalculadoraInt objInt1 = (x, y) -> x + y;
		CalculadoraInt objInt2 = (x, y) -> x * y;
		CalculadoraInt objInt3 = (x, y) -> x / y;
		CalculadoraInt objInt4 = (x, y) -> x - y;
		CalculadoraInt objInt5 = (x, y) -> x % y;
		CalculadoraLong objLong1 = (x, y) -> x + y;
		CalculadoraLong objLong2 = (x, y) -> x * y;
		CalculadoraLong objLong3 = (x, y) -> x / y;
		CalculadoraLong objLong4 = (x, y) -> x - y;
		CalculadoraLong objLong5 = (x, y) -> x % y;
		System.out.println("Resultados Calculadora INT");
		Principal3.engine(objInt1);
		Principal3.engine(objInt2);
		Principal3.engine(objInt3);
		Principal3.engine(objInt4);
		Principal3.engine(objInt5);
		
		System.out.println("Resultados Calculadora LONG");
		Principal3.engine(objLong1);
		Principal3.engine(objLong2);
		Principal3.engine(objLong3);
		Principal3.engine(objLong4);
		Principal3.engine(objLong5);
	}

	//Sobrecarga de Metodos
	private static void engine (CalculadoraInt cal){
		int x =2, y =4;
		int resultado = cal.calcular(x, y);
		System.out.println("resultado = " + resultado);
	}

	private static void engine (CalculadoraLong cal){
		long x = 2, y= 4;
		long resultado = cal.calcular(x, y);
		System.out.println("resultado = " + resultado);
	}
}