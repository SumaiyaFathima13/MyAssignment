package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int num[] = {1,4,3,2,8,6,7};
		
		Arrays.sort(num);
	for (int i = 0; i < num.length-1; i++) {
			int j = i + 1;
			if (j!=num[i]) {
				System.out.println("Missing Value is: "+j);
				break;
			}
		}

	}

}
