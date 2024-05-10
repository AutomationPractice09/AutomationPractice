package package4_0505;

public class B1_ControlLoop5 {

	public static void main(String[] args) 
	{
	
		/*
		 * print * in below format
		 *  *
		 *  * *
		 *  * * *
		 *  * * * *
		 */
		
		for (int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			
			System.out.println("");
		}
		
	}

}
