package R3;

import java.util.Scanner;

public class R3A1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] numbers = (in.nextLine()).toCharArray();
		int[] num = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			num[i] = Character.getNumericValue(numbers[i]);
		}

	}
}
