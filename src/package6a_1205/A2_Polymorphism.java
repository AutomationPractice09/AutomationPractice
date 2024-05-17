package package6a_1205;

public class A2_Polymorphism {
	
	/*
	 * Method Overloading
	 * ==================
	 * - Method will overload only and only if method is declared in same class with same name multiple time with
	 *   different signature
	 *   1) Number of arguments
	 *   2) Type of Arguments
	 *   3) Order of arguments can change
	 */
	
	public void add()                             //same method same with 0 parameter
	{
		int a = 10, b = 20;
		System.out.println("Addition is: "+(a+b));
	}
	
	public void add(int a, int b)				  //same method name with 2 parameter
	{
		System.out.println("Addition is: "+(a+b));
	}

	public void add(int a, int b, int c)	      //same method name with 3 parameter
	{
		System.out.println("Addition is: "+(a+b+c));
	}
	
	public void add(double a, int b)				  //same method name with 2 parameter with different data type
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	public void add(int a, double b)				  //same method name with 2 parameter but different order of parameter
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	
	
	public static void main(String[] args) 
	{

		A2_Polymorphism ref1 = new A2_Polymorphism();
		ref1.add();
		ref1.add(20, 30);
		ref1.add(40, 50, 60);
		ref1.add(23.21, 10);
		ref1.add(20, 44.56);
		
	}

}
