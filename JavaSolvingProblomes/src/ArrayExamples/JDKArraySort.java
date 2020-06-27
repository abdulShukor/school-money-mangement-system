package ArrayExamples;

import java.util.Arrays;

public class JDKArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		//has many sort methods depend on your need you can use it
		//Arrays has many methods 
		Arrays.sort(intArray);
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + "\t");
		}

	}

}
