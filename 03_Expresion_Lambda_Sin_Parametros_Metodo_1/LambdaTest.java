public class LambdaTest{
	public static void main (String[] args){
	FunctionTest ft = () -> System.out.println("Hola Mundo");
	ft.saludar();
	}
}