/*
 * Frederick Small
 * CISC 3150
 * HW4
 * 
 */
package cisc3150.hw4;

public class Driver {
	public static void main (String[] args)
	{
		char[] testValue = new char[] {'T','h','i','s',' ','a',' ','T','e','s','t'};
		char[] compareValue = new char[] {'T','h','i','s',' ','a',' ','T','X','X','X'};
		MyString myString = new MyString(testValue);
		MyString compareString = new MyString(compareValue);
		MyString compareAgainString = new MyString(testValue);
		MyString.internaValuePrivate = new char[]{'U','s','e',' ','S','t','a','t','i','c',' ','V','a','l','u','e'};
		
		System.out.println("Starting Value \t\t\t" + myString.toString());
		System.out.println("Static Value reference\t\t" + MyString.internaValuePrivate.toString());		
		System.out.println("************** \t\t\t");
		System.out.println("Character at position 3 \t=" + myString.charAt(3));
		System.out.println("Length \t\t\t\t=" + myString.length());
		System.out.println("Substring 4,6 \t\t\t=" + myString.substring(4, 9));
		
		//System.out.println("ToLower \t\t\t=" + myString.toLowerCase());
		System.out.println("To Lower Case \t\t\t=" + myString.toLowerCase().toString());
		System.out.println("To Upper Case \t\t\t=" + myString.toUpperCase().toString());
		
		System.out.println("Equals(" + compareString.toString() + ")\t\t=" + myString.equals(compareString));
		System.out.println("Equals(" + compareAgainString.toString()+ ")\t\t=" + myString.equals(compareAgainString));		
		
		System.out.println("Get My String \t\t\t=" + myString.getMyString());			
		System.out.println("Value of 4     \t\t\t=" + MyString.valueOf(4));
		
		System.out.println("************** \t\t\t");
		System.out.println("Ending Value   \t\t\t" + myString.toString());
		//System.out.println("ToString =" + myString.toUpperCase().toString());		
		myString = null;
		compareString = null;
		compareAgainString = null;
	}
}
