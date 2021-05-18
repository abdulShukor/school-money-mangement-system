package NewChallenges;

import java.util.Scanner;

public class ElectronicsShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int s = input.nextInt();
		int n = input.nextInt();
		int m = input.nextInt();
		int[] keyboards = new int[n];
		for (int keyboards_i = 0; keyboards_i < n; keyboards_i++) {
			keyboards[keyboards_i] = input.nextInt();
		}
		int[] pendrives = new int[m];
		for (int pendrives_i = 0; pendrives_i < m; pendrives_i++) {
			pendrives[pendrives_i] = input.nextInt();
		}

		int max = -1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				long sum = keyboards[i] + pendrives[j];
				if (sum <= s && sum > max) {
					max = (int) sum;
				}
			}
		}

		System.out.println(max);
	}
}
/*
 * int keyboards[n]: the keyboard prices int drives[m]: the drive prices int b:
 * the budget
 * 
 * 10 2 3
3 1
5 2 8
Sample Output 0
9

test two
5 1 1
4
5
Sample Output 1

-1
 */