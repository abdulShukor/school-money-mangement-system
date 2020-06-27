package Practice;

import java.util.Scanner;

public class Kangaroo {

	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x1 = input.nextInt();
		int v1 = input.nextInt();
		int x2 = input.nextInt();
		int v2 = input.nextInt();

		if ((v1 > v2) && (x2 - x1) % (v1 - v2) == 0)
			System.out.println("YES");
		else
			System.out.println("NO");
		input.close();
	}
	
	

}
