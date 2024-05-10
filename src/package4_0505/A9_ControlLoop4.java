package package4_0505;

public class A9_ControlLoop4 {
	
	//nested for loop:

	public static void main(String[] args) 
	{
		/* print "*" in 4 rows and 4 columns as per below
		 *  * * * *
		 *  * * * *
		 *  * * * *
		 *  * * * *
		*/
		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				System.out.print(" * ");
			}
			
			System.out.println("");
		}
		
		
	}

}
