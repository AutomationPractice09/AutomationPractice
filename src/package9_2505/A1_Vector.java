package package9_2505;

import java.util.Vector;

public class A1_Vector {

	//vector class implements the List interface
	
	public static void main(String[] args) 
	{
		
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		
		System.out.println("Is list empty: "+v1.isEmpty());
		System.out.println("Total size of element is: "+v1.size());
		System.out.println("V1 contains 100?: "+v1.contains(100));
		System.out.println("All Elements in vector is: "+v1);
		v1.add(1, 35);
		System.out.println(v1);
	}

}
