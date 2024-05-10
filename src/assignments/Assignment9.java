package assignments;

public class Assignment9 {

	/* print "*" in 4 rows and 4 columns as per below
	 *  A
	 *  AB
	 *  ABC
	 *  ABCD
	*/

	
	public static void main(String[] args) 
	{
		
		int alphabet = 65; 
	
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char) (alphabet + j));
			}
			
			System.out.println("");
		}
		
		
	}

}
