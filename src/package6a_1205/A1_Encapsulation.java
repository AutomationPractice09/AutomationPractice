package package6a_1205;

     //Encapsulation: Hiding data and function into one class


class Books
{
	private int page_no;
	
	public void setPageNo (int num)         //this method to set private int variable
	{
		if(num>0)
		{
			this.page_no = num;
		}
		else
		{
			System.out.println("Page number is not acceptable");
		}
	}
	
	
	public int getPageNo()					//this method to get private int variable
	{
		return this.page_no;
	}

}



public class A1_Encapsulation {

	public static void main(String[] args) 
	{
		Books ref1 = new Books();
		ref1.setPageNo(-12);
		System.out.println(ref1.getPageNo());
	}

}
