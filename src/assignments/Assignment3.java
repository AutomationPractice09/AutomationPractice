package assignments;

import java.util.Scanner;

public class Assignment3 {
	
	// W.A Java program for accepting a number from user and test whether it is even or odd

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number to check whether Even or Odd");
		int num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Entered number is Even");
		}
		
		else
		{
			System.out.println("Entered number is Odd");
		}
		
		
		sc.close();

	}

}
