package Practice;

public class BufferStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(bufferMethod("I am learning"));// I am returning but to display it
		String name = "abdul";
		StringBuffer buffer = new StringBuffer(name);
		buffer.reverse();
		System.out.println(buffer.toString());
	}
	// make sure to display the buffer.toString(); otherwise will return nothing in
	// in method you need to return it back to the user or display it:
	// support append, reverse, replace, concatenate
	// buffer.reverse();
	// System.out.println(buffer.toString());
	// buffer.append("name");
	// System.out.println( buffer.append(" name")); // Adding the string to the end
	// of string

	// wrapping in a method
	public static StringBuffer bufferMethod(String name)// method return data is StringBuffer
	{
		StringBuffer buffer = new StringBuffer(name);
		buffer.reverse();
		return buffer;
		// if you don't want to have return type then you need to display the result back
		// even you returning value back but the main where you are calling the method
		// you need to print it to the console through System.out.println
	}

}
