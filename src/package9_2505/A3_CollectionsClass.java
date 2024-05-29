package package9_2505;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A3_CollectionsClass 
{

	public static void main(String[] args) 
	{
	
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(10);
		ls.add(45);
		ls.add(20);
		ls.add(12);
		ls.add(76);
		ls.add(56);
		
		System.out.println("List before sort: "+ls);
		
		
		//Sort the list
		Collections.sort(ls);
		System.out.println("List after sorting: "+ls);
		
		//Print max element in list
		System.out.println("Print max element in list: "+Collections.max(ls));
		
		//Print min element in list
		System.out.println("Print min element in list: "+Collections.min(ls));
	
	}

}
