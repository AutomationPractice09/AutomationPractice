package package2_2804;

public class A1_DataTypes {

	public static void main(String[] args) 
	{
		//boolean
		boolean status = true;
		boolean newstatus = false;
		System.out.println("boolean status is: "+status);
		System.out.println("boolean status is: "+newstatus);
		
//--------------------------------------------------------------------------------------------------------------
		
		//char
		char c1 = 'A';
		System.out.println("Character data is: "+c1);
		
		char c2 = '$';    //we can store any special character also
		System.out.println("Special Character data is: "+c2);
		
		char c3 = 97;   //we can store number also as it return ascii values of that number
		System.out.println("Ascii values of 97 is: "+c3);

//--------------------------------------------------------------------------------------------------------------
		
		//byte (-128 to 128)
		byte b1 = 127;
		byte b2 = -128;
//		byte b3 = 129;   //it throws the error as Type missmatch: cannot convert from int to byte
		System.out.println("Value of b1 is: "+b1);
		System.out.println("Value of b2 is: "+b2);
		
		
		//short (-32767 to 32767)
		short s1 = 3453;
		short s2 = -4323;
//		short s3 = 35000;   //it throws the error as Type missmatch: cannot convert from int to short
		System.out.println("Value of s1 is: "+s1);
		System.out.println("Value of s2 is: "+s2);
		
		
		//int (default type)
		int i1 = 35000;
		int i2 = 876876876;
//		int i3 = 7709730086;   //it throws the error as type int is out of range
		System.out.println("Value of i1 is: "+i1);
		System.out.println("Value of i2 is: "+i2);
		
		
		//long 
		long l1 = 7709730085L;    //for long we need to write L at the last
		long l2 = 456L;
		System.out.println("Value of l1 is: "+l1);
		System.out.println("Value of l2 is: "+l2);
		
//--------------------------------------------------------------------------------------------------------------
		
		//double
		double d1 = 45456.987;
		double d2 = 9790.2322;
		System.out.println("Value of d1 is: "+d1);
		System.out.println("Value of d2 is: "+d2);
		
		
		//float
		float f1 = 3452.342F;
//		float f2 = 45334.45;   //it throws error as cannot convert from double to float as not end with F at last
		System.out.println("Value of f1 is: "+f1);
		
		
	}

}
