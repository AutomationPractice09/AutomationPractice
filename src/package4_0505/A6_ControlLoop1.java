package package4_0505;

import java.util.Scanner;

public class A6_ControlLoop1 {
	
	  // for loop - used when iterations are know
	 

	public static void main(String[] args) 
	{

		 // print welcome statement 10 times
		for(int i=1; i<=10; i++)
		{
			System.out.println("Welcome");
		}
		
		
		 // print 1 to 10
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		
		//print 10 to 1
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
		
		//write a code for factorial number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find factorial");
		int num = sc.nextInt();
		
		for (int i = num-1;i>=1;i--)
		{
			num = num * i;
		}
		
		System.out.println("Factorial of is "+num);
		
		sc.close();
		
		
		//write a code for sum of 100 natural numbers
		int num1 = 0;
		
		for (int i=1;i<=100;i++)
		{
			num1 = num1 + i;
		}
		
		System.out.println("Addition of 1 to 100 is "+num1);
	}

}
