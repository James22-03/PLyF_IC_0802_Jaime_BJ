public class LambdaTest4 {
	public static void main(String[] args){
		Operaciones op = (num1, num2) -> System.out.println(num1 + num2);
		LambdaTest4 objeto = new LambdaTest4();
		objeto.miMetodo(op, 10, 10);
	}
	public void miMetodo(Operaciones op, int num1, int num2){
		op.imprimeSuma(num1, num2);
	}
}