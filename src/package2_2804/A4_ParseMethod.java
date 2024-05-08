package package2_2804;

public class A4_ParseMethod {

	public static void main(String[] args) 
	{
		
        // String to primitive
		
		String s1 = "100";
		System.out.println("addition of 2 number is: "+(s1+100));   //before string convert to int
        int i1 = Integer.parseInt(s1);
        System.out.println("addition of 2 number is: "+(i1+100));  //after string convert to int using parseInt method
   
        
/*        String s2 = "100ACDB";
        int i2 = Integer.parseInt(s2);   //system throw NumberFormatException as s2 string is not suitable to convert as int data type
        System.out.println("addition of 2 number is: "+(i2+100)); 
*/
           
        String s3 = "4565.5464";
        double d1 = Double.parseDouble(s3);   //parsing string into double
        System.out.println("addition of 2 number is: "+(d1+1000));
        
        
        // as string is collection of character so to get any character from string we dont need to use parseChar method
        String s4 = "Hello";
        char c1 = s4.charAt(2);   // we simply use the CharAt(index) to get character at index 
        System.out.println("Character at 2nd index of string s4 is: "+c1);
        
        
//----------------------------------------------------------------------------------------------------------------------
        
       
        //primitive to String
        
        int x1 = 100;
        String y1 = String.valueOf(x1);   //this is conversion from int primitive type to String object type
        System.out.println("conversion of primitive to string: "+(y1+200));
        
        double x2 = 234.423;
        String y2 = String.valueOf(x2);   //this is conversion from double primitive type to String object type
        System.out.println("conversion of primitive to string: "+(y2+567));
        
	}

}
