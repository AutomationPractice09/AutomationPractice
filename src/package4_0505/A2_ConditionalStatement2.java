package package4_0505;

import java.util.Scanner;

public class A2_ConditionalStatement2 {
	
//	if else condition: it execute for both true and false condition

	public static void main(String[] args) 
	{
	
		//validate users vote is eligible for vote or not
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Age");
		int age = sc.nextInt();
		
		if (age>=18)
		{
			System.out.println("You are eligible to vote");
		}
		
		else
		{
			System.out.println("You are not eligible to vote");
		}
		
		
		sc.close();
		
	}

}
