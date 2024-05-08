package package3_0405;

public class A3_StaticMethod {
	
	/* Static Method:
	 * method with static keyword is static method
	 * Memory at the time of class load so inside meta space
	 * Without object we can call static method
	 *    If you are calling static method in same class then call directly
	 *    If you are calling static method in different class then call with class name
	 */  

	public static void display()
	{
		System.out.println("This is static display method");
	}
	
	public static void main(String[] args) 
	{

		display();                        //static method can call direct without any object
		A3_StaticMethod.display();        //static method can call using class name also and no need of object to call

//		A3_StaticMethod ref2 = new A3_StaticMethod();
//s		ref2.display();     //we can call static method with object but java throws warning that its not correct method to call static method
		
	}

}
