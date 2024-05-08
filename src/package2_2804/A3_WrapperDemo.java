package package2_2804;

public class A3_WrapperDemo {

	public static void main(String[] args) 
	{
		
		//Object to Primitive also called as unboxing
		Integer i1 = 4567;               //this is object as Integer is wrapper class
		int num1 = i1.intValue();        //here we convert object to primitive i,e Integer wrapper class to int primitive type
		System.out.println("conversion of object to primitive: "+num1);
		
		Long l1 = 770912345612L;
	    double num4 = l1.doubleValue();
	    System.out.println("conversion of object to primitive: "+num4);
		
		
		
		//primitive to object type also called as autoboxing
		int num2 = 2343;                    	//this is primitive type 
		Integer i2 = Integer.valueOf(num2); 	//here we convert primitive to object 
		System.out.println("conversion of primitive to object: "+i2);
		
		double d1 = 34534.454;
		Double num3 = Double.valueOf(d1);
		System.out.println("conversion of primitive to object: "+num3);
		
	}

}
