package package9_2505;

import java.util.Iterator;
import java.util.LinkedList;

public class A2_LinkedList 
{
	/*
	 * LinkedList is class which implements List interface
	 * Underline data structure is doubly linked list
	 * Frequent operation are: Insertion and Deletion
	 * Non Synchronized
	 * Order maintained and duplicate elements are allowed
	 * Node consist: Data + Address of next element
	 */

	public static void main(String[] args) 
	{
		LinkedList<Integer> ls = new LinkedList<Integer>(); 
		
		System.out.println("Before addition is LinkedList empty: "+ls.isEmpty());
		
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(25);
		ls.add(20);
		
		System.out.println("Before addition is LinkedList empty: "+ls.isEmpty());
		
		System.out.println("Total element in linkedlist is: "+ls.size());
		
		System.out.println("LinkedList is: "+ls);
		
		System.out.println("Is list contains 100: "+ls.contains(100));
		System.out.println("Is list contains 25: "+ls.contains(25));
		
		
		ls.add(2, 55);
		ls.addFirst(1010);    //this is new method in linkedlist to add element at first
		ls.addLast(2020);     //this is new method in linkedlist to add element at last
		
		System.out.println("Print first element of linkedlist: "+ls.getFirst());    //this is new method to print first element of linkedlist
		System.out.println("Print last element of linkedlist: "+ls.getLast());      //this is new method to print last element of linkedlist
		
		
		System.out.println("New LinkedList is: "+ls);
		
		
		//iterate using for loop
		System.out.println("Iterate using for loop");
		for(int i = 0;i<ls.size();i++)
		{
			System.out.println(ls.get(i));
		}
		
		
		//iterate using for each loop
		System.out.println("Iterate using for each loop");
		for(Integer i:ls)
		{
			System.out.println(i);
		}
		
		
		//iterate using iterator()
		System.out.println("Iterate using iterator method");
		Iterator<Integer> ir = ls.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}	
	}

}
