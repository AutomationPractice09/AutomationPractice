package package3_0405;

public class A4_ParameterisedMethod {
	
	public void add()      //this is zero parameterized method
	{
		int a = 20, b= 10;     //these are local variables
		System.out.println("Addition of a and b is: "+(a+b));
	}
	
	public void sub(int a, int b)   //this is parameterized method with 2 parameter which is local
	{
		System.out.println("Subtraction of a and b is: "+(a-b));
	}

	public static void main(String[] args) 
	{
	
		A4_ParameterisedMethod ref1 = new A4_ParameterisedMethod();
		ref1.add();
		ref1.sub(20, 10);   //this is compile time calling and passing parameters with original data-arguments
		ref1.sub(430, 50);
	}

}
