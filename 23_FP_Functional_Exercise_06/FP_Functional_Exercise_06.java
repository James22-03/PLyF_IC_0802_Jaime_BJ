import java.util.List;

/*Structured Functional */

public class FP_Functional_Exercise_06{
	public static void main(String[] args){
	List<String> courses = List.of("Spring","Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");


	System.out.println("printCoursesAtLeastFourLetters: ");
	printCoursesAtLeastFourLetters(courses);
	System.out.println("");
	}

	private static void print(String course){
		System.out.println(course + ",");
	}

	private static void printCoursesAtLeastFourLetters(List<String> courses){
		courses.stream()
    	.forEach(course -> System.out.println("El curso " + course + " tiene " +course.length() + " caracteres"));
		System.out.println("");
	}
}