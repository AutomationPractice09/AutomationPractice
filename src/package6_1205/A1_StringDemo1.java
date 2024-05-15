package package6_1205;

public class A1_StringDemo1 {

	public static void main(String[] args) 
	{
	
		//String declaration by using new keyword
		
		String s1 = new String("Hello");    //it create memory in NCSP region
		
		String s2 = new String("Hello");
		
		System.out.println(s1==s2);         //it gives false as duplicate memory is allowed in ncsp region and here s1 and s2 occupied 2 memories with different id's
		                                    ///Note: when user use == for compare then it compares 2 id's instead of content
		
	//------------------------------------------------------------------------------------------------------------
		
		//string declaration as literal
		
		String s3 = "Hello";               //here s3 create memory in SCP region
		
		String s4 = "Hello";
		
		System.out.println(s3==s4);       //it gives true as duplicate is not allowed in scp region and here s3 and s4 occupied same memory with same id's  
		
		
	}

}
