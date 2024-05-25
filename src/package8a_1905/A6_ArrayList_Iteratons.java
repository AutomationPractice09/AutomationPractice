package package8a_1905;

import java.util.ArrayList;
import java.util.Iterator;

public class A6_ArrayList_Iteratons {

	public static void main(String[] args) 
	{
	
		ArrayList<Integer> a1 = new ArrayList<Integer>();           //this is Integer type ArrayList
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(15);
		a1.add(10);
		
		
		//Iteration of ArrayList using for loop
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		
		
		System.out.println();
		
		//Iteration of ArrayList using for each loop
		for(Integer i:a1)
		{
			System.out.println(i);
		}
		
		
		System.out.println();
		
		//Iteration of ArrayList using iterator method (iterator() is from Iterator interface who is parent of collection interface)
		Iterator<Integer> ir1 = a1.iterator();
		
		while(ir1.hasNext())                         //always need to use while method to iterate with iterator()
		{
			System.out.println(ir1.next());          //next() method print the element and increase the counter 
		}
		
		
	}

}
