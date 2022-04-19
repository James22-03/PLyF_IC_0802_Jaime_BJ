public class LambdaTest3{
	public static void main (String[] args){
	Operaciones op = (num1,num2) -> System.out.println(num1+num2);
	op.imprimeSuma(5,10);
	}
}