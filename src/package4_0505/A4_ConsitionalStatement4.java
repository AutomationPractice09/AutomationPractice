package package4_0505;

import java.util.Scanner;

public class A4_ConsitionalStatement4 {
	
	//nested if condition: Nested means within.

	public static void main(String[] args) 
	{
		
		/*
		 * Marks>=90 then A
		 * Marks >=95 then A++
		 * Otherwise B
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Marks");
		int marks = sc.nextInt();
		
		if(marks>=90)
		{
			if(marks>=95)
			{
				System.out.println("You got A++");
			}
			else
			{
				System.out.println("You got A");
			}
		}
		else
		{
			System.out.println("You got B");
		}
		
		sc.close();

	}

}
