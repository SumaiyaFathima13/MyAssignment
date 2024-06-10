package week3.day2;

public class CountNumberChars {

	public static void main(String[] args) {
		String name = "Sumaiya Fathima";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println("The number of occurences of 'a' : "+count);
	}

}
