package package8_1905;

public class A2_ChildHDFC implements A1_RBI          //we use word implements instead of extends for class to interface relation
{
	
	public void cust_details()
	{
		System.out.println("This is Customer Details");      //this is individual method of current class
	}

	public static void main(String[] args) 
	{
		//scenario 1: child class reference and child class object
		A2_ChildHDFC ref1 = new A2_ChildHDFC();
		
		ref1.deposite();            //this is inherited abstract method
        ref1.withdraw();            //this is inherited abstract method
        ref1.rateOfInterest();      //this is inherited abstract method
        ref1.cust_details();        //this is individual method
        
        
        //scenario 2: parent class reference and parent class object
//        A1_RBI ref2 = new A1_RBI()      --> java throws error as Cannot instantiate the interface
        
        
      //scenario 3: parent class reference and parent class object
          A1_RBI ref3 = new A2_ChildHDFC();
          ref3.deposite();          
          ref3.withdraw();
          ref3.rateOfInterest();
//        ref3.cust_details();     //cannot access individual method
	}

	@Override
	public void deposite() 							//non-implemented methods from interface need to implement in child class once we implement interface in any class
	{
		System.out.println("This is Deposite Details");
	}

	@Override
	public void withdraw() 
	{
		System.out.println("This is withdraw Details");
	}

	@Override
	public void rateOfInterest() 
	{
		System.out.println("This is rateOfInterest Details");	
	}

}
