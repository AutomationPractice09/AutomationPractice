package assignments;

public class Assignment15 {

	//Print given string into reverse order
	
	public static void main(String[] args) 
	{
	
		String name = "Digvijay Bhagwan Patil";
		
		String rev = "";
	
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev = rev + name.charAt(i);
		}
		
		System.out.println(rev);
	
	}

}
