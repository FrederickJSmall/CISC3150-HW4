package cisc3150.hw4;

public class MyString implements Cics3150MyString {

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
		MyString myStrng = new MyString(new char[this.length()]);
		
		if (end > begin)
			return null;
		
		int len = this.length()-1;
		if (begin > len || end > len)
			return null;
		
		char[] tempChar = new char[end - begin];
		int index=0;
		for (int i = begin;i < end;i++)
		{
			tempChar[index] = this.internaValue[i];
			index++;
		}
		
		
		return null;
	}

	@Override
	public MyString toLowerCase() {
		int len = this.length();
		for (int index = 0;index < len;index++)
		{
			int asciiCode = (int)this.internaValue[index];
			//System.out.println(this.internaValue[index] + "=" + asciiCode);
			if (asciiCode >= 97 && asciiCode <= 122)
			{
				asciiCode = asciiCode - 32;
			}
			System.out.println(this.internaValue[index] + "=" + (char)asciiCode);			
			
		}
		
		return null;
	}

	@Override
	public MyString toUpperCase() {
		// TODO Auto-generated method stub
		return null;
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
	public MyString getMyString() {
		// TODO Auto-generated method stub
		return this;
	}
	private int checkLength()
	{
		return this.internaValue.length;
	}
	private void copy(char[] chars)
	{
		this.internaValue = chars.clone();
		//for (int i=0;i < chars.length;i++)
		//{
		//	
		//}
	}
	public String toString()
	{
		String tempString = new String();
		for (int i=0;i < this.internaValue.length;i++)
		{
			tempString = tempString + this.internaValue[i];
		}
		return tempString;
	}
	public void setValue(char[] value)
	{
		this.internaValue = value.clone();
	}
	public char[] getValue()
	{
		return this.internaValue;
	}

}
