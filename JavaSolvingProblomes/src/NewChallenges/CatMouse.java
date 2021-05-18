package NewChallenges;

import java.util.Scanner;

public class CatMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = input.nextInt();
            int y = input.nextInt();
            int z = input.nextInt();
            int dist1 = Math.abs(x - z);
            int dist2 = Math.abs(y - z);
            if (dist1 == dist2) System.out.println("Mouse C");
            else if (dist1 < dist2) System.out.println("Cat A");
                else System.out.println("Cat B");
        }
	}
}