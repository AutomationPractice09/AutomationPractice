package package4_0505;

public class B2_Break_Continue {

	public static void main(String[] args) 
	
	{

		for(int i=1;i<=10;i++)
		{
			if(i>5)
			{
				break;
			}
			else
			{
				System.out.println(i);
			}
		}
		
		
		
		System.out.println("----------------");
		
		
		
		for(int i=1;i<=10;i++)
		{
			if(i<=5)
			{
				continue;
			}
			else
			{
				System.out.println(i);
			}
		}
		

	}

}
