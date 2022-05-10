import java.util.List;

/*Structured Functional */

public class FP_Functional_Exercise_05{
	public static void main(String[] args){
	List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);


	System.out.println("printAllNumbersInList: ");
	printAllNumbersInListFunctional(numbers);
	System.out.println("\nprintOddNumbersInListFunctional: ");
	printOddNumbersInListFunctional(numbers);
	System.out.println("\nprintCubesOfEvenNumbersInListFunctional: ");
	printCubesOfOddNumbersInListFunctional(numbers);
	System.out.println("");
	}

	private static void print(int number){
		System.out.print(number + ",");
	}

	private static boolean isOdd(int number){
		return (number % 2 != 0);
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers){
		numbers.stream()
		.forEach(System.out::print);
		System.out.println("");
	}

	private static void printOddNumbersInListFunctional(List<Integer> numbers){
		numbers.stream()
			.filter(FP_Functional_Exercise_05::isOdd)
			.forEach(FP_Functional_Exercise_05::print);
		System.out.println("");
	}

	private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers){
		numbers.stream()
			.filter(number -> number % 2 !=0)
			.map(number -> number * number * number)
			.forEach(FP_Functional_Exercise_05::print);
		System.out.println("");
	}
}