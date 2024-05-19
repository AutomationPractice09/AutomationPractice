package package7_1805;

public abstract class B1_DataAbstraction_a     //since class has 1 abstract method so this class also need to declare with abstract keyword
{
	
	String name = "Circle";
	
	public void getShape()                             //this is implemented method
	{
		System.out.println("The shape is: "+name);
	}
	
	public abstract void getShapeArea();              //this is abstract class (without any body) | declare with abstract

}
