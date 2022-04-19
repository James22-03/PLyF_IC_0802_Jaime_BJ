public class LambdaTest5{
	public static void main(String[] args){
		Operaciones op = (num1, num2) -> System.out.println(num1 + num2);
		op.imprimeOperacion(5, 10);
		LambdaTest5 objeto = new LambdaTest5();
		objeto.miMetodo((num1, num2) -> System.out.println(num1 - num2), 20, 10);
		objeto.miMetodo((num1, num2) -> System.out.println(num1 * num2), 20, 10);
	}
	public void miMetodo(Operaciones op, int num1, int num2){
		op.imprimeOperacion(num1, num2);
	}
}