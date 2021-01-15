package ArrayExamples;

import java.util.Scanner;

public class DivisbleSumPaira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cnt=0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = input.nextInt();
        }
        for(int a_i=0; a_i < n-1; a_i++){
          for(int a_j=a_i+1; a_j< n; a_j++){
           if( (a[a_i]+a[a_j])%k==0)
               cnt++;
               
        } 
        }
        System.out.println(cnt);
    }
}

/*	6 3
	1 3 2 6 1 2
	Sample Output
 	5
 	test 2
 	5 3
	2 8 6 8 4
	Expected Output
	3
 */