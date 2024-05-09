package package3_0405;

public class B3_Constructor {
	
	/*
	 * Constructor is special method
	 * Constructor name should be same like its class name
	 * Constructor is used to initialize Object
	 * Constructor get called at the time of Object Creation
	 * Constructor should not have return type
	 * Constructor should not have any special keyword like final, static
	 * 
	 * 
	 * Types
	 * =====
	 * 1) Default constructor
	 * 2) Parameterized constructor
	 */

	public B3_Constructor()         //this is default constructor
	{
		System.out.println("Default constructor");
	}
	
	public B3_Constructor(int a)    //this is parameterized constructor
	{
		System.out.println("Parameterized constructor: "+a);
	}
	
	
	public static void main(String[] args) 
	{
		B3_Constructor ref1 = new B3_Constructor();     //since we write constructor and JVM call default constructor at the time of object creation
		B3_Constructor ref2 = new B3_Constructor(90);   //this is calling parameterised constructor while creating object for class

	}

}
