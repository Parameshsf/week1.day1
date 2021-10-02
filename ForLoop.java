package week1.day1;

public class ForLoop {

	public static void main(String[] args) {

		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println("Even number of i are " + i);
			}

		}

		// Indirect way of getting even numbers using continue keyword
		for (int i = 0; i <= 50; i++) {
			if (i % 2 != 0) {
				continue; // Once the condition is met, it will skip the following statements and continue
							// with the loop

			}
			System.out.println("Even numbers of i are " + i);

		}

	}
}
