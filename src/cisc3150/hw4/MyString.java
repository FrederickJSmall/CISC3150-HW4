package cisc3150.hw4;

public class MyString implements Cics3150MyString {

	char[] internaValue; 
	//MyString(char[] chars);
	
	public MyString(char[] chars)
	{
		this.internaValue = chars;
	}
	
	
	@Override
	public char charAt(int index) {
		
		int len = this.length(); 
		
		if (len > 0 && index < len)
		{
			return this.internaValue[index];
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
		return null;
	}

	@Override
	public MyString toLowerCase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MyString toUpperCase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(MyString s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MyString getMyString() {
		// TODO Auto-generated method stub
		return null;
	}
	private int checkLength()
	{
		return this.internaValue.length;
	}

}
