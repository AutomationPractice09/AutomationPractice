package package9_2505;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class A6_InterviewQue2 
{
	
	//Q) Sort a Set and print it.

	public static void main(String[] args) 
	{
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(30);
		hs.add(20);
		hs.add(10);
		hs.add(55);
		hs.add(23);
		hs.add(55);
		
		System.out.println("Original set is: "+hs);
		
		//convert set to list
		ArrayList<Integer> ls = new ArrayList<Integer>(hs);       //we converted Set to list
		System.out.println("Set after coverting to list "+ls);    //this list is as it as set (not sorted)
		
		Collections.sort(ls);       //we used collections class to use sort()
		System.out.println("The sorted set is: "+ls);             //this will print sorted set/list

	}

}
