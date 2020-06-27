package Practice;

public class BufferStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "abdul";
		StringBuffer buffer = new StringBuffer(name);
		buffer.reverse();
		System.out.print(buffer.toString());
	}
	// make sure to display the buffer.toString(); otherwise will return nothing in
	// in method you need to return it back to the user or display it:
	// support  append, reverse, replace, concatenate 

}
