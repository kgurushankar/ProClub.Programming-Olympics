package R3;

import java.util.Scanner;

public class R3B2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int aspeed = in.nextInt();
		int hspeed = in.nextInt();
		int alaps = in.nextInt();
		in.close();
		int val = (int) (alaps*hspeed/aspeed);
		System.out.println(val);
		
	}
}
