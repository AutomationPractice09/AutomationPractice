package assignments;

public class Assignment09 {

	/* print "*" in 4 rows and 4 columns as per below
	 *  A
	 *  AB
	 *  ABC
	 *  ABCD
	*/

	
	public static void main(String[] args) 
	{
		
		int a = 65; 
	
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(a + j));
			}
			
			System.out.println("");
		}
		
		
	}

}
