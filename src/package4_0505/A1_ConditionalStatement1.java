package package4_0505;

import java.util.Scanner;

public class A1_ConditionalStatement1 {

	//if condition: it is useful to check single condition

	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your location");
		String loc = sc.nextLine();
		
		if(loc.equalsIgnoreCase("Pune"))
		{
			System.out.println("You are working in Pune");
		}
		
		sc.close();
	}

}
