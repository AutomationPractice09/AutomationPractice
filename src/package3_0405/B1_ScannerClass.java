package package3_0405;

import java.util.Scanner;

public class B1_ScannerClass {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int i1 = sc.nextInt();
		System.out.println("your age is: "+i1);
		
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Your name is: "+name);
		
		sc.close();
	
	}

}
