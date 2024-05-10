package assignments;

import java.util.Scanner;

public class Assignment02 {
	
	public void personaldetails (String fname, String lname, String gender, int age, long pn, int zc, String email)
	{
		System.out.println("Your First name is "+fname);
		System.out.println("Your Last name is "+lname);
		System.out.println("Your Gender is "+gender);
		System.out.println("Your Age is "+age);
		System.out.println("Your Phone number is "+pn);
		System.out.println("Your Zipcode is "+zc);
		System.out.println("Your email is "+email);
	}

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your First name");
		String f1 = sc.nextLine();
		
		System.out.println("Enter your Last name");
		String l1 = sc.nextLine();
		
		System.out.println("Enter your email");
		String em = sc.nextLine();
		
		System.out.println("Enter your Gender");
		String gen = sc.nextLine();
		
		System.out.println("Enter your Age");
		int ag = sc.nextInt();
		
		System.out.println("Enter your Phone number");
		long p = sc.nextLong();
		
		System.out.println("Enter your Zipcode");
		int z = sc.nextInt();
		
		
		
		Assignment02 ref1 = new Assignment02();
		ref1.personaldetails(f1, l1, gen, ag, p, z, em);
	
		sc.close();

}
}
