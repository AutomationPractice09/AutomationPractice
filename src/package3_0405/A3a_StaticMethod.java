package package3_0405;

public class A3a_StaticMethod {

	//this is to call static method from another class into this class (within same package)
	
	public static void main(String[] args) 
	{
	
//		display();   we cannot call static method from another class into other class as it throws method undefined error
		A3_StaticMethod.display();   //we can call static method from another class using class name first.
	}

}
