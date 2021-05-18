package NewChallenges;

import java.util.List;
import java.util.Scanner;

public class BirdMigratorWithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		
		int [] arr= new int [input];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();
		}

       // int result = migratoryBirds(a);

	}
	static int migratoryBirds(List<Integer> arr) {
        int[] types = new int[5];
        for(int i=0; i<arr.size(); i++){
            switch(arr.get(i)){
                case 1:
                    types[0]++;
                    break;
                case 2:
                    types[1]++;
                    break;
                case 3:
                    types[2]++;
                    break;
                case 4:
                    types[3]++;
                    break;
                case 5:
                    types[4]++;
                    break;
            }
        }
        int max = types[0];
        int index = 1;
        for(int j = 1; j<types.length;j++){
            if(max < types[j]){
                max = types[j];
                index = j+1;
            }
        }
        return index;
        
    }
}
