package NewChallenges;

import java.util.Scanner;

public class MigratoryBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] types = new int[n];
		int[] dp = new int[6];
		for (int types_i = 0; types_i < n; types_i++) {
			int d = 0;
			d = input.nextInt();
			dp[d]++;
		}
		// your code goes here
		int max = -1;
		int answer = 0;
		for (int i = 1; i < 6; i++) {
			if (max < dp[i]) {
				max = dp[i];
				answer = i;
			}
		}
		System.out.println(answer);
	}
}

/*Sample Input 6
	1 4 4 4 5 3
	Sample Output 4
	
	*/