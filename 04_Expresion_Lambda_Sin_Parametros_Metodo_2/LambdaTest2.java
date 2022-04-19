public class LambdaTest2{
	public static void main (String[] args){
	FunctionTest ft = () -> System.out.println("Hola Mundo");
	//ft.saludar();
	LambdaTest2 objeto = new LambdaTest2();
	objeto.miMetodo(ft);
	}
	public void miMetodo(FunctionTest parametro){
		parametro.saludar();
	}
}