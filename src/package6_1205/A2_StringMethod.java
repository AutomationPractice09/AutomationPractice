package package6_1205;

public class A2_StringMethod {

	public static void main(String[] args) 
	{
	
		String s1 = "Software Testing";
		String s2 = "software testing";
		
		
		//Calculate length of string: .length()
		System.out.println(s1.length());
		
		
		
		//convert string to lowercase: .toLowerCase()
		System.out.println(s1.toLowerCase());
		
		
		
		//convert string to uppercase: toUpperCase()
		System.out.println(s1.toUpperCase());
		
		
		
		//compare 2 strings: .equals()   ----> this method matches exact string by considering lowercase and uppercase letters
		System.out.println(s2.equals(s1));
		
		
		
		//compare 2 strings: .equalsIgnoreCase()  --> this method matches by ignoring lowercase and uppercase letters
		System.out.println(s2.equalsIgnoreCase(s1));
		
		
		
		//compare 2 string: .compareTo()    --> this method compare string based uni-code value for each character
		System.out.println(s1.compareTo(s2));
		
		
		
		//get character at specific index: .charAt(index)
		System.out.println(s1.charAt(4));
		
		
		
		//get index value of specific character: .indexOf('char')   ---> this method will give index of first occurance of given character
		System.out.println(s1.indexOf('T'));
		
		
		
		//to append any string: .concat()
		s1 = s1.concat(" has huge demand!");
		System.out.println(s1);
	}

}
