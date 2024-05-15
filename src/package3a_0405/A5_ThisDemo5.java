package package3a_0405;


// this can be used to return the current class instance from the method.



class A 
{
	A()
	{
		B b1 = new B(this);    //here this can be passed as argument in the constructor call
	}
}


class B
{
	B(A a1)
	{
		System.out.println("This is A class object used!");
	}
	
}


public class A5_ThisDemo5 {
	
	
	public static void main(String[] args) 
	{
	
		A a1 = new A();
		
	}

}
