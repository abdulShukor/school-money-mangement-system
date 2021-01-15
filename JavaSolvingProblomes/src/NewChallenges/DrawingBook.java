package NewChallenges;

import java.util.Scanner;

public class DrawingBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();// pages
		int p = input.nextInt();// turns
		// your code goes here
		System.out.println(Math.min(p / 2, n / 2 - p / 2));
	}
}