package assignments;

public class Assignment8 {
	
	/* print "*" in 4 rows and 4 columns as per below
	 *  1
	 *  23
	 *  456
	 *  78910
	*/

	public static void main(String[] args) 
	{
		int k =1;
		
		for (int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k++ +(""));
			}
			
			System.out.println("");
		}

	}

}
