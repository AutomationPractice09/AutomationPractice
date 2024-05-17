package package6_1205;

public class A3_StringBuffer {
	
	/*
	 * String Buffer-thread safe and StringBuilder-not thread safe are mutable
	 * It doesn't support literal way so need to initiate with new only
	 */

	public static void main(String[] args) 
	{
		
		StringBuffer s1 = new StringBuffer("Hello");         //stringbuffer initiate with new keyword
		System.out.println(s1);
		
		
		//append the string: .append("abc")
		s1.append(" All");                                  //here we can append so s1 is change to new string means mutable
		System.out.println(s1);

		
		//reverse the string: .reverse();                  //reverse the string usin method
		System.out.println(s1.reverse());

	}

}
