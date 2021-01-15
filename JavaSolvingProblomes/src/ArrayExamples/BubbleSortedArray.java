package ArrayExamples;

import java.util.Scanner;

public class BubbleSortedArray {
	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		
		int n = input.nextInt();
		int []intArray= new int [n];
		
		// int[] intArray = { 20, 35, -15, 7, 55, 1, -22 ,35};

		// sorting array
		// The outer loop checking every element against other and pushing it to the end
		// of array if it
		// greater
		
		for(int h=0;h<n;h++)
		{
			intArray[h]=input.nextInt();
		}
		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (intArray[i] > intArray[i + 1]) {// if change the sign to < then will print descending order
					swap(intArray, i, i + 1);
				}
			}
		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + "\t");
		}

	}

	public static void swap(int[] array, int i, int j) {
		if (i == j) {
			return;
		}
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

}
