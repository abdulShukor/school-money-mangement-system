package Practice;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create instance of Random class
		Random rand = new Random();

		// // Generate random integers in range 0 to 999
		int rand_int1 = rand.nextInt(1000);
		System.out.println(rand_int1);

		//
		// // Print random integers
		// System.out.println("Random Integers: " + rand_int1);
		//
		// // Generate Random doubles
		// double rand_dub1 = rand.nextDouble();
		//
		// // Print random doubles
		// System.out.println("Random Doubles: " + rand_dub1);

		// int a = rand.nextInt(10)+5;// this 1-14
		int min = 1;
		int max = 10;
		// System.out.println(rand.nextInt((max)));

		int a = rand.nextInt(10);//

		System.out.println(a);

		System.out.println("============================");
		System.out.println("Generating 10 random integer in range of 0 to 10 using Random");
		System.out.println("============================");
		Random randomGenerator = new Random();
		for (int i = 0; i < 10; i++) {// if we put 100 then will print 100 times value 1-10
			System.out.println(randomGenerator.nextInt(10) + 1);
		}
	}

}
