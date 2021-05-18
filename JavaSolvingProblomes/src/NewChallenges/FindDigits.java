package NewChallenges;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin=new Scanner(System.in);
		int tNumberOfTests=stdin.nextInt();
		while(tNumberOfTests-->0) {
			int n=stdin.nextInt();
			int temp=n,count=0;
			while(temp>0) {
				if(temp%10!=0)
					if(n%(temp%10)==0) count++;
				temp/=10;
			}
			System.out.println(count);
		}
	}
}

/*The first line is an integer, , the number of test cases.
The  subsequent lines each contain an integer, .

Sample Input

2 two test case at the same time
12
1012
Sample Output

2
3*/