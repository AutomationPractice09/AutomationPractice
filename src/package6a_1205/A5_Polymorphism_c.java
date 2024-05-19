package package6a_1205;

/* Runtime Polymorphism or Method overriding
 * here class A is Parent and class B is child
 */

class A
{
	public void colour()
	{
		System.out.println("Colour is Blue");
	}
}

class B extends A
{
	public void colour()
	{
		System.out.println("Colour is Yellow");
	}
}


public class A5_Polymorphism_c {

	public static void main(String[] args) 
	{
	
		//scenario 1: Child class reference and Child class object
		B ref1 = new B();
		ref1.colour();        //child method override here
		
		//scenario 2: Parent class reference and Parent class object
		A ref2 = new A();
		ref2.colour();       //child doesn't override as its only parent reference and parent object
		
		//scenario 3: Parent class reference and Child class object
		A ref3 = new B();
		ref3.colour();       //child class method override over parent class method
		
		
	}

}
