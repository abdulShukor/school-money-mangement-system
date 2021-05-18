package ArrayExamples;

import java.util.Scanner;

public class RepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner in = new Scanner(System.in);
	        String s = in.next(); // string 
	        long n = in.nextLong(); // int 
	        long num = n/s.length();
	       // System.out.println(":"+num);

	        long rem = n%s.length();
	        //System.out.println(":"+rem);

	        long ans = 0;
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i)=='a') {
	                ans += num;
	    	       // System.out.println("ans"+ans);

	                if (i < rem)
	                    ans++;
	            }
	        }
	        System.out.println(ans);
	    }
	}
/*input aba(repeated until10) and 10
  out put is 7*/
 