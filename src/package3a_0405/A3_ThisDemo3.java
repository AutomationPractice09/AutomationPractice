package package3a_0405;

public class A3_ThisDemo3 {
	
	
	//this keyword used to invoke current class constructor
	
	
	public A3_ThisDemo3()
	{
        this(60);                                            //calling parameterized constructor at first line using this keyword		
		System.out.println("This is default constructor");
//		this(60);                                            //if we call another constructor instead of first statement then java throws error as "Constructor call must be the first statement in a constructor"
	}
	
	public A3_ThisDemo3(int a)
	{
		this("Manaswinee");                                  //calling parameterized constructor at first line using this keyword
		System.out.println("This is Parameterized constructor: "+a);
	}
	
	public A3_ThisDemo3(String name)
	{
		System.out.println("This is Parameterized constructor: "+name);
	}

	
	public static void main(String[] args) 
	{
		
		A3_ThisDemo3 ref1 = new A3_ThisDemo3();     //this calling default constructor 

	}

}
