package NewChallenges;

import java.util.Scanner;

public class AdditionRecursionAndFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int in = input.nextInt();
		System.out.print(add(in));

	}

	public static int add(int a) {

		if (a == 1 || a == 2) {
			return 1;
		} else {
			return add(a - 1) + add(a - 2);
		}

	}
}
