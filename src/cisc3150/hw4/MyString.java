package cisc3150.hw4;

public class MyString implements Cics3150MyString {

	private static char[] internaValuePrivate; 
	char[] internaValue; 
	MyString compare;
	
	public MyString(char[] chars)
	{
		//this.internaValue = chars;
		copy(chars);
	}
	
	
	@Override
	public char charAt(int index) {
		
		int len = this.length(); 
		
		if (len > 0 && index < len - 1)
		{
			return this.internaValue[index-1];
		}
		
		return new Character('\0');
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		int len = 0;
		for (int i=0;i < this.internaValue.length;i++)
		{
			len++;
		}
		return len;
	}

	@Override
	public MyString substring(int begin, int end) {
		// TODO Auto-generated method stub
		//begin--;
		//end--;
		MyString myStrng = new MyString(new char[this.length()]);
		
		if (end < begin)
			return null;
		
		int len = this.length()-1;
		if (begin > len || end > len)
			return null;
		
		char[] tempChar = new char[(end - begin)+1];
		int index=0;
		for (int i = begin;i <= end;i++)
		{
			tempChar[index] = this.internaValue[i];
			index++;
		}
		
		myStrng.setMyString(tempChar);
		return myStrng;
	}

	@Override
	public MyString toUpperCase() {
		MyString myString = new MyString(new char[this.length()]);
		int len = this.length();
		for (int index = 0;index < len;index++)
		{
			int asciiCode = (int)this.internaValue[index];
			if (asciiCode >= 97 && asciiCode <= 122)
			{
				asciiCode = asciiCode - 32;
			}
			myString.internaValue[index] = (char)asciiCode;
		}
		return myString;
	}

	@Override
	public MyString toLowerCase() {
		MyString myString = new MyString(new char[this.length()]);
		int len = this.length();
		for (int index = 0;index < len;index++)
		{
			int asciiCode = (int)this.internaValue[index];
			if (asciiCode >= 65 && asciiCode <= 90)
			{
				asciiCode = asciiCode + 32;
			}
			myString.internaValue[index] = (char)asciiCode;
		}
		return myString;
	}

	@Override
	public boolean equals(MyString compare) {
		// TODO Auto-generated method stub
		boolean areEqual = false;
		
		int len = this.length();
		
		if (compare == null) 
			areEqual = false;
		
		if (len != compare.internaValue.length )
			areEqual = false;
		
		for (int i=0;i < len;i++)
		{
			if (this.internaValue[i] != compare.internaValue[i])
				return areEqual;
		}
			
		return true;
	}

	@Override
	public MyString getMyString() 
	{
		MyString myString = new MyString(new char[this.length()]);
		myString.setMyString(this.internaValue);
		return myString;
	}
	public void setMyString(char[] value)
	{
		this.internaValue = value.clone();
		MyString.internaValuePrivate= value.clone();
	}
	//private int getLength()
	//{
	//	return this.internaValue.length;
	//}
	private void copy(char[] chars)
	{
		this.internaValue = chars.clone();
		MyString.internaValuePrivate= chars.clone();
	}
	public String toString()
	{
		String tempString = new String();
		for (int i=0;i < this.internaValue.length;i++)
		{
			tempString = tempString + this.internaValue[i];
		}
		return tempString.toString();
	}
	public static MyString valueOf(int i)
	{
		MyString myString = new MyString(new char[1]);
		
		char[] value = new char[] {MyString.internaValuePrivate[i]};
				
		myString.setMyString(value);
		return myString;
	}

}
