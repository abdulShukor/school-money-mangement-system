package NewChallenges;

import java.util.Scanner;

public class ViralAdvertising {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long cur = 5, ans = 0;
		while (n-- > 0) {

			// cur =cur / 2;
			cur /= 2;

			// System.out.println(":"+cur);

			ans += cur;
			// cur=cur * 3;
			cur *= 3;

		}
		System.out.println(ans);
	}
}
/*
 * Sample Input
 * 
 * 3 Sample Output
 * 
 * 9
 */