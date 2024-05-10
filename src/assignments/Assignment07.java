package assignments;

import java.util.Scanner;

public class Assignment07 {

	
	//W.A Program to accept number from user and reverse the same
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
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
