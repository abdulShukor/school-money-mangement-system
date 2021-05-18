package NewChallenges;

import java.util.Scanner;

public class SequenceEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		for (int i = 1; i <= n; i++)
			a[i] = sc.nextInt();

		for (int target = 1; target <= n; target++) {
			for (int i = 1; i <= n; i++) {
				if (a[a[i]] == target) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}
/* x=1=p[2]=p[p[2]];
 * 3
 
2 3 1
Sample Output

2
3
1

5
4 3 5 1 2
Sample Output 1

1
3
5
4
2
*/