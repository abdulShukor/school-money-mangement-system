package ArrayExamples;

import java.util.Scanner;

public class BreakingRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input = new Scanner(System.in);
	        int n = input.nextInt();
	        int[] score = new int[n];
	        for(int score_i=0; score_i < n; score_i++){
	            score[score_i] = input.nextInt();
	        }
	        int max=score[0];
	        int min=score[0];
	        int maxcount=0;
	        int mincount=0;
	        for(int i=1;i<n;i++){
	            if(score[i]>max){
	                max=score[i];
	                maxcount++;
	            }
	            if(score[i]<min){
	                min=score[i];
	                mincount++;
	            }
	        }
	        System.out.println(maxcount+" "+mincount);
	        // your code goes here
	    }
	}

/*	9
	10 5 20 20 4 5 2 25 1
	Expected Output
	2 4
*/