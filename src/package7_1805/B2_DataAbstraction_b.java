package package7_1805;

public class B2_DataAbstraction_b extends B1_DataAbstraction_a
{
	
	
	public void show()
	{
		System.out.println("This is show method");
	}
	
	
	public static void main(String[] args) 
	{
	    //scenario 1: Child class reference and child class object
		B2_DataAbstraction_b ref1 = new B2_DataAbstraction_b();
		System.out.println(ref1.name);                                //we can access variable from parent abstract class
		ref1.getShape();                                              //we can access implemented method from parent abstract class
		ref1.getShapeArea(); 										  //we can access abstract method from parent abstract class which override by child class method
		ref1.show();                                                  //we can access individual method of child class
		
		
		//scenario 2: parent class reference and parent class object (this is invalid scenario as object is not created for abstract class)
//		B1_DataAbstraction_a ref2 = new B1_DataAbstraction_a();
		
		
		//scenario 3: parent class reference and child class object
		B1_DataAbstraction_a ref3 = new B2_DataAbstraction_b();
		System.out.println(ref3.name);								  //we can access variable from parent abstract class
		ref3.getShape();											  //we can access implemented method from parent abstract class
		ref3.getShapeArea(); 										  //we can access abstract method from parent abstract class which override by child class method
//		ref3.show(); 												  //we cannot access individual method of child class
		
	}

	
	@Override                            //since we extends current class with existing abstract class so its mandatory to implement the abstract methods from abstract class 
	public void getShapeArea() 
	{
		System.out.println("The Area of circle is 2*3.14*r*r");
	}

}
