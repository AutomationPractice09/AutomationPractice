package package8a_1905;

import java.util.ArrayList;

public class A1_ArrayList {
	
	/*
	 * ArrayList is Class implements List interface
	 * Underline data structure is Dynamic Array
	 * ArrayList internal default capacity is 10 virtual segments
	 * 
	 * ArrayList is ordered collection
	 * ArrayList allowed duplication
	 * ArrayList is not synchronized (at a time we can handle many process)
	 */

	public static void main(String[] args) 
	{
		
		//Ways to declare ArrayList
		// 1. Non-generic Way
		ArrayList a1 = new ArrayList();      //this is non-generic way of ArrayList declaration
		a1.add(101);
		a1.add("Digvijay");
		a1.add('u');
		a1.add(56.87);
		
		System.out.println(a1);         //print all Elements of ArrayList
		
		int num = (int) a1.get(0);          //we need a type casting to store object to primitive data
		String name = (String) a1.get(1);

		System.out.println(num);
		System.out.println(name);
		
//---------------------------------------------------------------------------------------------------------
		
		//2. Generic Way 
		ArrayList<Integer> a2 = new ArrayList<Integer>();     //this is generic way of ArrayList declaration
		a2.add(10);
		a2.add(20);
		a2.add(40);
		a2.add(15);
		a2.add(25);
		
		System.out.println(a2);        //print all elements from ArrayList
		
		int num1 = a2.get(0);          //dont need type casting to fetch element from ArrayList
		int num2 = a2.get(3);
		
		System.out.println(num1);
		System.out.println(num2);
		
		
		
		
	
		
		
	}

}
