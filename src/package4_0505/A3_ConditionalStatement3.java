package package4_0505;

import java.util.Scanner;

public class A3_ConditionalStatement3 {
	
	//ladder if or if-else if: this is used to compare multiple conditions

	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers to comapare");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if (num1 > num2 && num1 > num3)
		{
			System.out.println(num1+" is greater than "+num2+" and "+num3);
		}
		else if (num2 > num1 && num2 > num3)
		{
			System.out.println(num2+" is greater than "+num1+" and "+num3);
		}
		else
		{
			System.out.println(num3+" is greater than "+num1+" and "+num2);
		}
		
		sc.close();
		
	}

}
