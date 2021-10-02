package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 5;
		int fact = 1;
		for (int i = 1; i <= input; i++) {
			fact = fact * i;
		}
		System.out.println("The factorial of user input value " + input + " is: " + fact);

		// Opposite way of finding factorial

		/*
		 * int fact = 1; int input = 5; System.out.println("The factorial of 5 is:");
		 * for (int i = input; i > 1; i--) { fact = fact * i; System.out.println(fact);
		 * }
		 */

	}
}
