package cisc3150.hw4;

public class Driver {
	public static void main (String[] args)
	{
		char[] testValue = new char[] {'T','h','i','s',' ','a','T','e','s','t'};
		MyString myString = new MyString(testValue);
		
		System.out.println("Character at 3 =" + myString.charAt(3));
		
		myString = null;
	}
}
