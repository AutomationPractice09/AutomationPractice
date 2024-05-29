package package9_2505;

import java.util.LinkedHashSet;

public class A7_LinkedHashSet {

	public static void main(String[] args) 
	{
	
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(50);
		lhs.add(30);
		lhs.add(20);
		
		System.out.println("LinkedHashSet is: "+lhs);      //it print in same order and duplicate value is removed
		
	}

}
