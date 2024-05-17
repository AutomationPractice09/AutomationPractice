package assignments;

public class Assignment14 {

	//print given string where all character at even index is lower case and at odd is upper case
	
	public static void main(String[] args)
	{
		
		String s1 = "digvijaypatil";
		
		String s2 = "";       //this string we have taken for new string where required string we can store
		
		char ch[] = s1.toCharArray();    //converted string into array
		
		for(char i: ch)
		{
			int index = s1.indexOf(i);
			if (index%2==0)
			{
				s2 = s2+s1.toUpperCase().charAt(index);        //converted string to uppercase and get char at particular index
			}
			else
			{
				s2 = s2+s1.toLowerCase().charAt(index);
			}
		}
		
		System.out.println(s2);

	}

}
