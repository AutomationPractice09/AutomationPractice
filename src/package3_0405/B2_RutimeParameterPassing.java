package package3_0405;

import java.util.Scanner;

public class B2_RutimeParameterPassing {
	
	
	public void add (int a, int b)
	{
		System.out.println("Addition of two numbers is "+(a+b));
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		B2_RutimeParameterPassing ref1 = new B2_RutimeParameterPassing();
		ref1.add(num1, num2);   //here we passing run time parameter
		
		
		sc.close();
		
		
	}

}
