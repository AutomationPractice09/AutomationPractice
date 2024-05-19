package package7_1805;

import java.util.Scanner;

class Demo
{
	final int id = 101;                          //here we make int id variable as final so cannot change it 
	
	public final void accept()                   //here we make accept() method as final so cannot override further
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Your name is: "+name);
		
		sc.close();
	}
}


public class A9_FinalKeyword extends Demo 
{	
	public void accept()                       //here we cannot override accept() method once we declare final in parent
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Your name is: "+name);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Your age is: "+age);
		
		sc.close();
		
	}
	

	public static void main(String[] args) 
	{
		A9_FinalKeyword ref1 = new A9_FinalKeyword();
		System.out.println(ref1.id);
		ref1.id = 10110;                //here we cannot assign another value to final keyword id
		
		

	}

}
