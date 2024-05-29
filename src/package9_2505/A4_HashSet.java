package package9_2505;

import java.util.HashSet;
import java.util.Iterator;

public class A4_HashSet 
{

	public static void main(String[] args) 
	{
	
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(50);
		hs.add(35);
		hs.add(20);
		hs.add(null);
		
		System.out.println(hs);     //
		
		//contains()
		System.out.println("is HashMap contains 15: "+hs.contains(15));
		System.out.println("is HashMap contains 50: "+hs.contains(50));
		
		
		//remove
		hs.remove(null);
		System.out.println(hs);
		
		
		//since HashMap is not based on indexing do we cannot iterate it using for loop
		
		
		//iterate using for each loop
		for(Integer i:hs)
		{
			System.out.println(i);
		}
		
		
		//iterate using iterator() method
		Iterator<Integer> ir = hs.iterator();	
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
	}

}
