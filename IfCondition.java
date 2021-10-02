package week1.day1;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		num = 25;

		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("TRIZZ-FIZZ");

		} else if (num % 5 == 0) {
			System.out.println("FIZZ");

		} else if (num % 3 == 0) {
			System.out.println("TRIZZ");
		} else {
			System.out.println("Not divisible by 3 & 5");
		}
		// find a number is positive or negative
		int val = 0;
		if (val > 0) {
			System.out.println("The number " + val + " is positive");

		} else if (val < 0) {
			System.out.println("The number " + val + " is negative");

		} else {
			System.out.println("The number is neutral");
		}

		// find a number is odd or even
		int val1 = 13;
		if (val1 % 2 == 0) {
			System.out.println("The number " + val1 + " is EVEN");

		} else if (val1 % 2 != 0) {
			System.out.println("The number " + val1 + " is ODD");

		}
	}

}
