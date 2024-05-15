package assignments;

public class Assignment12 {

/*	Create array for your personal data for name, address, age and emailID
	- calculate total data
	- iterate array using simple for loop and for each loop
*/
	
	public static void main(String[] args)
	{
		
		Object perDts [] = {"Digvijay","Kolhapur",29,"digvi@gmail.com"};
		
		
		System.out.println(perDts.length);           //calculate total data     
		
		
		for(int i=0;i<perDts.length;i++)            //iterate array using simple for loop
		{
			System.out.println(perDts[i]);
		}
		
		
		for(Object i:perDts)						//iterate array using for each loop
		{
			System.out.println(i);
		}
		

	}

}
