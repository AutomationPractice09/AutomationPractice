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
		
		
		
		//to remove white spaces before and after: .trim()
		String s3 = "    this is me    ";      //this line contain white spaces before and after
		System.out.println(s3.trim());
		
		
		
		//for partial match: .contains()
		String s4 = "Selenium WebDriver is an API";
		System.out.println(s4.contains("API"));
		System.out.println(s4.contains("Automation"));
		
		
		
		//to validate if string starts with particular word: .startsWith()
		System.out.println(s4.startsWith("Selenium"));       //this is case sensitive
		System.out.println(s4.startsWith("Sel"));
		System.out.println(s4.startsWith("lenium"));
		
		
		
		//to validate if string ends with particular word: .endsWith()
		System.out.println(s4.endsWith("API"));              //this is case sensitive
		System.out.println(s4.endsWith("PI"));
		System.out.println(s4.endsWith("AP"));
		
		
		
		//to check if string is empty: .isEmpty();
		String s5 = "";
		System.out.println(s5.isEmpty());
		
		
		
		//if user want to print string after specific index: .substring(index)
		String s6 = "This is my Computer";
		System.out.println(s6.substring(3));       //print string s6 from index 3
		
		
		
		//if user want to print string from specific index to any specific index: substring(begin index, endindex)
		System.out.println(s6.substring(5, 11));    //it ending on 10 and not on 11
		
		
		
		//if user want to replace character from string: .replace()
		System.out.println(s6.replace('m', 'M'));      //this will replace all m character to M
		
		
		
		//if user want to convert string into array: .toCharArray();
		String s7 = "digvijay";
		char ch[] = s7.toCharArray();
		
		
		
		//If user want to split string with multiple words in it: .split("pattern")
		String s8 = "Digvijay Bhagwan Patil";
		String s9[] = s8.split(" ");               //split s8 string based on space and captured into string array
		for(String i:s9)  						   //printed all strings in array
		{
			System.out.println(i);
		}
		
	}

}
