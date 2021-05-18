package NewChallenges;

import java.util.Scanner;

public class HalloweenSale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int pstartingPrice = input.nextInt();
		int dreducingByYearly = input.nextInt();
		int mlastPrice = input.nextInt();
		int sMoney = input.nextInt();
		int answer = howManyGames(pstartingPrice, dreducingByYearly, mlastPrice, sMoney);
		System.out.println(answer);
		input.close();
	}

	static int howManyGames(int p, int d, int m, int s) {
		// Return the number of games you can buy
		int price = p;
		int k = 0;
		while (s >= price) {
			s -= price;

			if (price - d >= m)
				price -= d;
			else
				price = m;
			k++;
		}
		return k;
	}
}
/*Sample Input 0

20 3 6 80// 20-3=17,14,11,8,66
Sample Output 

6

test 2
20 3 6 85
Sample Output 

7 */