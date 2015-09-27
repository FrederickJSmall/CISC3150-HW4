package cisc3150.hw4;

public interface Cics3150MyString {
	//public MyString(char[] chars);
	public char charAt(int index);
	public int length();
	public MyString substring(int begin, int end);
	public MyString toLowerCase();
	public MyString toUpperCase();
	public boolean equals(MyString s);
	public MyString getMyString();
	public String toString();	
	//public static MyString valueOf(int i);
}
