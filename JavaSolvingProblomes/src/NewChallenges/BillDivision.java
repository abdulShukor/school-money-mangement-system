package NewChallenges;

import java.util.Scanner;

public class BillDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int k = input.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (i != k) {
				sum += input.nextInt();
			} else {
				input.nextInt();
			}
		}
		int res = input.nextInt();
		int t = res - sum / 2;
		System.out.println(t == 0 ? ("Bon Appetit") : t);
	}
}

/* input 4 1
3 10 2 9
12
Expected Output
5
test 2

4 1
3 10 2 9
7
Expected Output

Bon Appetit
*/