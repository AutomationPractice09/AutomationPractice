package package9_2505;

import java.util.Scanner;

public class B1_ExceptionHandling 
{
	
	int id = 101;                              //this is instance variable

	public static void main(String[] args) 
	{
		
		//Exception Handling for NullPointerException
		B1_ExceptionHandling r1 = new B1_ExceptionHandling();
		r1 = null;
		
		try 
		{
			System.out.println(r1.id);
		}
		catch (NullPointerException n)
		{
			System.out.println("Check the Object as it is not initiated");
		}
		
//-------------------------------------------------------------------------------------------------		
		
		//Exception Handling for NumberFormatException
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number to parse into Integer:");
		String data = sc.nextLine();
		
		try {
		int num = Integer.parseInt(data);
		System.out.println("The addition is "+(num+100));
		}
		catch(NumberFormatException n)
		{
			System.out.println("Please enter a valid string for number");
		}
	
//----------------------------------------------------------------------------------------------------
		
		//Exception Handling for ArithmaticException
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter any two number:");
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		
		try
		{
		System.out.println("Division of a and b is: "+(a/b));
		}
		catch(ArithmeticException ar)
		{
			System.out.println("Please enter b greater than 0.");
		}
		
//------------------------------------------------------------------------------------------------------
		
		//Exception Handling for ArrayOutOfBoundsException
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter an index number to print array element");
		int index = sc2.nextInt();
		
		int arr[] = {10,20,30,40,50,20};
		
		try
		{
			System.out.println("The Element is: "+arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException ab)
		{
			System.out.println("Please Enter a index in between 0 to "+(arr.length - 1));
		}
	}

}
