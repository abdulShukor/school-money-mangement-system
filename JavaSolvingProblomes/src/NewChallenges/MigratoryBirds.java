package NewChallenges;

import java.util.Scanner;

public class MigratoryBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] dp = new int[n];
		for (int types_i = 0; types_i < n; types_i++) {
			dp[input.nextInt()]++;
			
			//System.out.print(dp[input.nextInt()]++);

			
			//System.out.print(dp[types_i]);
		}
		// your code goes here
		int max = 0;
		int answer = 0;
		for (int i = 1; i < n; i++) {

			
			if ( dp[i]>max) {
				max = dp[i];
				//System.out.print(max+":");
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