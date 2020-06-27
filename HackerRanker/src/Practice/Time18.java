package Practice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Time18 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		DateFormat DateFormatOne = new SimpleDateFormat("hh:mm:ssaaa");
		DateFormat DateFormateTwo = new SimpleDateFormat("HH:mm:ss");
		
		Scanner input = new Scanner(System.in);
		
		Date date = DateFormatOne.parse(input.nextLine());
		
		System.out.println(DateFormateTwo.format(date));

		input.close();

	}

}
