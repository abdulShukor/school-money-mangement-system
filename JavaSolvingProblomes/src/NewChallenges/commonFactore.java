package NewChallenges;

import java.util.Scanner;

public class commonFactore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int lcm;
		int n1 = input.nextInt();
		int n2 = input.nextInt();

		int gcd = 1;

		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0)
				gcd = i;
		}

		System.out.printf("GCD of %d and %d is: %d", n1, n2, gcd);
	}

}