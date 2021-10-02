package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		System.out.println("Fibonacci series for the input value of " + input + " is as follows,");
		for (int i = 1; i <= input; i++) {
			System.out.println(firstNum);
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			
		}

	}

}
