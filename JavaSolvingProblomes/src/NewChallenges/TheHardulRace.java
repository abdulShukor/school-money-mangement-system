package NewChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class TheHardulRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = input.nextInt();
        }
        Arrays.sort(height);
        System.out.println(Math.max(0, height[n-1]-k));
    }
}
/* 	5 4 hardul
	1 6 3 5 2
	Sample Output 0
	2
	
	test
	5 7
	2 5 4 5 2
	Sample Output 

	0
*/