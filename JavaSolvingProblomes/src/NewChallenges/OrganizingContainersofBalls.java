package NewChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class OrganizingContainersofBalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) { //the outer loop will execute the entire statements twice
			int n = in.nextInt();
			int[][] M = new int[n][n];
			for (int M_i = 0; M_i < n; M_i++) {
				for (int M_j = 0; M_j < n; M_j++) {
					M[M_i][M_j] = in.nextInt();
				}
			}
			int[] rt = new int[n];
			int[] ct = new int[n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					rt[i] += M[i][j];
				System.out.println("row"+rt[i]);

					ct[j] += M[i][j];
					
//					System.out.print("row"+rt[i]);
				System.out.println("col"+ct[j]);

					
				}
				
			}
			
			
			Arrays.sort(rt);
			Arrays.sort(ct);
			
			String ans = "Possible";
			for (int i = 0; i < n; i++) {
				if (rt[i] != ct[i])
					ans = "Impossible";
			}
			System.out.println(ans);
		}
	}
}

/* 2 executing the loop twice and will input twice and the output is twice
2
1 1
1 1



2
0 2
1 1
Sample Output 
Possible
Impossible

   3
1 3 1
2 1 2
3 3 3
3
0 2 1
1 1 1
2 0 0
Sample Output 

Impossible
Possible */