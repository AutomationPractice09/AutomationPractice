package package6a_1205;

public class A4_Polymorphism_b {
	
	/*
	 * main function overloading is possible 
	 * but while execution JVM run only main(String[] args)
	 */

	public static void main(String[] args) 
	{
		System.out.println("This is calling with Array of string");
		main("Hello");            //if we call another main function under main(String[] args) then it can execute
		main(1022);
	}
	
	public static void main(String args)
	{
		System.out.println("This is calling with String!");
	}
	
	public static void main(int args)
	{
		System.out.println("This is calling with int!");
	}

}
