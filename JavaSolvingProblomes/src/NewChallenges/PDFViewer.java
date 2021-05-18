package NewChallenges;

import java.util.Scanner;

public class PDFViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int h[] = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int max=0;
        for(char c:word.toCharArray()){
            max=Math.max(max,h[c-'a']);
        }
        System.out.println(max*word.length());
    }
	
	
}
/*
abc
Sample Output 0

9  
test two
Sample Input 

1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7
zaba
Sample Output 

28
*/