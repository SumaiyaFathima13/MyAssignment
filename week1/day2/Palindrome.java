package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int input = 121;
		int output = 0;
		for (int i = input; i > 0;) {
			int	r = i%10;
			output  = output*10 + r;
			i = i / 10;
		} {
		
			if (input==output) {
				System.out.println(output+" is Palindrome");}
				else {
				System.out.println(output+" is not Palindrome");
				}
			}
		}

	}
