package Practice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Time18 {

	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		DateFormat DateFormatOne = new SimpleDateFormat("hh:mm:ssaaa");
		DateFormat DateFormateTwo = new SimpleDateFormat("HH:mm:ss");

		System.out.println("Enter the date");
		Date date = DateFormatOne.parse(input.nextLine());

		System.out.println(DateFormateTwo.format(date));
		
		System.out.println("Enter the date");

		Date date1 = DateFormateTwo.parse(input.nextLine());
		System.out.println(DateFormatOne.format(date1));

		input.close();

	}

	// input 07:05:45PM
	// 19:05:45

}
