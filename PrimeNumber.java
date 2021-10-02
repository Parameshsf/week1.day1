package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 13;
		boolean flag = false;

		for (int i = 2; i <= input / 2; i++) {
			if (input % i == 0) {
				flag = true;
				break;

			}
		}
		if (!flag) {
			System.out.println("The given input number " + input + " is Prime");

		} else {
			System.out.println("The given input number " + input + " is NOT Prime");
		}

	}

}
