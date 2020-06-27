package Practice;

import java.util.Scanner;

public class RecursionFoctorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for recursion you need some condition that return fail or break if we do not
		// such condition will never finish the recursion call or the base case. you
		// need breaking condition. will get stalkoverflow memory. consume more memory.but
		// 100 line of of code can be write in few steps
		
		// n! =n*(n-1)
		// System.out.print(factorial(6));
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		System.out.print("Factorial of " + n + " is " + factorialRecursion(n));

	}

	public static int factorialRecursion(int num) {
		if (num == 0) {
			return 1;
		}
		return num * factorialRecursion(num - 1);

		// public static int factorial(int fact) {
		// if (fact == 0) {
		// return 1;
		// }
		//
		// int factorial = 1;
		//
		// for (int i = 1; i <= fact; i++) {
		// factorial *= i;
		// }
		//
		// return factorial;
		//
	}

}
