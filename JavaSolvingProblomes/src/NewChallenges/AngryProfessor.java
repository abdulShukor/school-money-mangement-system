package NewChallenges;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int inputT = scanner.nextInt();

		// we are executing the loop twice( executing the problem or testing it twice
		// at the same time).

		for (int t = 0; t < inputT; t++) {
			int N = scanner.nextInt();
			int KStudentThreshhold = scanner.nextInt();
			int cnt = 0;

			for (int i = 0; i < N; i++) {
				int a = scanner.nextInt();
				if (a <= 0) {
					cnt++;
				}
			}

			if (cnt < KStudentThreshhold) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

		scanner.close();
	}
}

/* Sample Input


2	(executing the loop or the problem twice and we get two at out at the same time after executing
4 3
-1 -3 4 2

4 2
0 -1 2 1
Sample Output

YES
NO*/