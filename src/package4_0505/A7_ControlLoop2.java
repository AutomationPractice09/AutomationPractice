package package4_0505;

import java.util.Scanner;

public class A7_ControlLoop2 {
	
	// while loop is entry control loop
	// required initialization
	// required increment/decrement or break condition

	public static void main(String[] args) 
	{
		//print hello
		
		int i = 5;
		
		while(i<=10)
		{
			System.out.println("Hello");
			i++;
		}
		
		
		// Accept the number from user and get sum of it e.g, number is 123 then sum is 1+2+3=6
		//here we don't know how much iteration we need to do which depends on input and varies each time
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number for which sum to be find: ");
		int num = sc.nextInt();
		
		int rem = 0, sum = 0;
		
		while (num>0)
		{
			rem = num%10;
			num = num/10;
			sum = sum+rem;
		}
		
		System.out.println("The sum of given entered number is: "+sum);
		
		
		
		//Accept the number and reverse the number
		System.out.println("Enter a number for reverse need to find: ");
		int num1 = sc.nextInt();
		
		int newnum=0, rem1=0;
		
		while (num1>0)
		{
			rem1 = num1%10;
			num1 = num1/10;
			newnum = (newnum*10)+rem1;
		}
		
		System.out.println("The reverse of given number is: "+newnum);
		
		
		sc.close();

	}

}
