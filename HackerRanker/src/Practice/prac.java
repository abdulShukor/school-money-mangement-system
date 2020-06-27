

package Practice;

import java.util.Scanner;

public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputValue = new Scanner(System.in);
		int number = inputValue.nextInt();
		int diagnol1 = 0;
		int diagnol2 = 0;
		for (int i = 0; i < number; i++) {
			for (int k = 0; k < number; k++) {
				int num = inputValue.nextInt();
				// System.out.println(i);
				// System.out.println(k);

				if (i == k) {
					diagnol1 += num;
					//System.out.println("i value" + i);
					// System.out.println(a);
				}
				if (i + k == number - 1) {
				//	System.out.println("i value is this " + i);

					diagnol2 += num;
					// System.out.println(b);

				}
			}
		}
		System.out.println(Math.abs(diagnol1 - diagnol2));
		inputValue.close();

	}

}
