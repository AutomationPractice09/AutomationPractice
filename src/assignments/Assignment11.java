package assignments;

public class Assignment11 {

	/* print as per below (L Pattern)
	 *  1
	 *  2
	 *  3
	 *  4
	 *  567810
	*/
	
	public static void main(String[] args) 
	{
		int n=6,k=1;
		
	    for(int i=0;i<n;i++)
	    {
	      for(int j=0;j<n;j++)
	      {
	        if(i>=0 && i<n-1 && j==0 || i==n-1 && j>0)
	        {
	          System.out.print(k++);
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
