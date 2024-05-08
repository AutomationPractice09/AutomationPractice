package package2_2804;

public class A2_TypeCastingPrimitive {
	
// converting one data type to another is called type casting
	
	public static void main(String[] args) 
	{
	
		/*primitive to primitive
	      1) Implicit casting (Automatic conversion)
	         small size to large size
	         byte --> char --> short --> int --> long --> float --> double
	    */

		byte b1 = 127;
		int i1 = b1;
		System.out.println("byte to int conversion: "+i1);
		
		int i2 = 189;
		float f1 = i2;
		System.out.println("int to float conversion: "+f1);
		
		char c1 = 'Z';
		int i3 = c1;
		System.out.println("char to int conversion: "+i3);
		
//------------------------------------------------------------------------------------------------------------
		/*primitive to primitive
	      2) Explicit casting (manual conversion with casting operator)
	         Large size to small size
	         double --> float --> long --> int --> short --> char --> byte
	    */
		
		long l1 = 7709876512L;
		int i4 = (int) l1;
		System.out.println("long to int conversion: "+i4);
		
		double b2 = 8767.987;
		int i5 = (int)b2;
		System.out.println("double to int conversio: "+i5);
	}

}
