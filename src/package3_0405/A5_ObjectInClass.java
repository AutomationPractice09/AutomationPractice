package package3_0405;

public class A5_ObjectInClass {

	static A5_ObjectInClass ref1 = new A5_ObjectInClass();     // we can create object under class instead of main but need to make it as static to call under main method
	
	public void add()      //this is zero parameterized method
	{
		int a = 20, b= 10;     //these are local variables
		System.out.println("Addition of a and b is: "+(a+b));
	}
	
	public static void main(String[] args) 
	{

       ref1.add();   //we can call using object reference since object is static under class method but this is not a good practice

	}

}
