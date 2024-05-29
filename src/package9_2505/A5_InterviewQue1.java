package package9_2505;

import java.util.ArrayList;
import java.util.HashSet;

public class A5_InterviewQue1 {
	
	//Q) Print a list having duplicate values with unique values
	
	public static void main (String[] args)
	{
		
		//create an ArrayList with duplicate number
		ArrayList<Integer> ls = new ArrayList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(20);
		ls.add(10);
		ls.add(50);
		ls.add(50);
		
		System.out.println("Original List is: "+ls);
		
		
		//convert List to Set
		HashSet<Integer> hs = new HashSet<Integer>(ls);            //we converted list to set to get unique values
		System.out.println("List after convert to Set: "+hs);
		
	}

}
