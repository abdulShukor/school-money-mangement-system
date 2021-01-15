package ArrayExamples;

import java.util.Scanner;

public class CountingValley {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		input.nextInt();
		String s = input.next();

		int level = 0;
		int valleys = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'U') {
				level++;
			} else if (s.charAt(i) == 'D') {
				if (level == 0) {
					valleys++;
				}
				level--;
			}
		}
		System.out.println(valleys);
	}
}

/*Sample Input

8
UDDDUDUU
Sample Output

1*/