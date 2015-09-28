package cisc3150.hw4;

public class Driver {
	public static void main (String[] args)
	{
		char[] testValue = new char[] {'T','h','i','s',' ','a',' ','T','e','s','t'};
		char[] compareValue = new char[] {'T','h','i','s',' ','a',' ','T','X','X','X'};
		MyString myString = new MyString(testValue);
		MyString compareString = new MyString(compareValue);
		MyString compareAgainString = new MyString(testValue);
		
		System.out.println("Character at position 3=" + myString.charAt(3));
		System.out.println("Length =" + myString.length());
		System.out.println("ToLowerLength =" + myString.toLowerCase());

		System.out.println("Equals =" + myString.equals(compareString));
		System.out.println("Equals =" + myString.equals(compareAgainString));		
		//System.out.println("ToLowerLength =" + myString.toLowerCase().toString());
		//System.out.println("ToString =" + myString.toUpperCase().toString());		
		myString = null;
	}
}
