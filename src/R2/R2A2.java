package R2;

import java.util.Scanner;

public class R2A2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = Integer.parseInt(in.nextLine());
		for (int i=0; i<cases; i++){
			String[] A = in.nextLine().split(" ");
			int[] a = new int[A.length];
			for (int i=0; i<A.length; i++){ 
				a[i]=Integer.parseInt(A[i]);
			}
		}
	}
}
