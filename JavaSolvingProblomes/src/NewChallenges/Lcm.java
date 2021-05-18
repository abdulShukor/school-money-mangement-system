package NewChallenges;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int lcm;
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		// maximum number between n1 and n2 is stored in lcm
		lcm = (n1 > n2) ? n1 : n2;

		// Always true
		while (true) {
			if (lcm % n1 == 0 && lcm % n2 == 0) {
				System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
				break;
			}
//			++lcm;
			lcm++;
		}
	}
}