package assignments;

public class Assignment10 {
	
	/* print "*" in 4 rows and 4 columns as per below (L Pattern)
	 *  *
	 *  *
	 *  *
	 *  ****
	*/

	public static void main(String[] args) 
	{
		
		int n=7;
		
	    for(int i=0;i<n;i++)
	    {
	      for(int j=0;j<n;j++)
	      {
	        if(i>=0 && i<n-1 && j==0 || i==n-1 && j>0)
	        {
	          System.out.print("*");
	        }
	        else
	        {
	          System.out.print("");
	        }
	      }
	      System.out.println();

	}

}
}
