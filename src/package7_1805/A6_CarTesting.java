package package7_1805;

public class A6_CarTesting 
{
	
	//A5_BMW is Child class and A4_Car is parent class

	public static void main(String[] args) 
	{
		
		//Scenario 1: Child class reference and Child class object (then we can access all parent and child class methods)
		A5_BMW ref1 = new A5_BMW();
		ref1.autoEngine();              //this is individual method
		ref1.start();                   //this is inherited method
		ref1.refuel();					//this is inherited method
		ref1.stop();					//this is inherited method
		
		
		//Parent class reference and Parent class object (then we can access methods from parent class only)
		A4_Car ref2 = new A4_Car();
		ref2.start();
		ref2.refuel();
		ref2.stop();
		
		
		//Parent class reference and Child class object (then we can access methods from parent class only)
		A4_Car ref3 = new A5_BMW();
		ref3.start();
		ref3.refuel();
		ref3.stop();
		
		
		//Child class reference and Parent class object (this is invalid scenario)
//		A5_BMW ref4 = new A4_Car();    ----> it throws error as "Type mismatch: cannot convert from A4_Car to A5_BMW" 
		
	
		
		
	}

}
