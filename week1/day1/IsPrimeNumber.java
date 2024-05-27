package week1.day1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int num = 10;
		for (int i = 2; i < num; i++) {
			if (num%i==0) {
				System.out.println("Prime Number is: "+i);
			} else {
				System.out.println("Non Prime Number is: "+i);
			}
			
		}

	} 

}
