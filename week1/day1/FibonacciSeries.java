package week1.day1;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n = 8;
		int num1 = 0, num2 = 1;
		System.out.println("Fibonacci Series values are: ");
		for (int i = 1; i <= n; i++) {
			System.out.println(num1);
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			
		}
	}

}
