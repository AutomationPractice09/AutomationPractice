package package8a_1905;

import java.util.ArrayList;

public class A2_ArrayListMethods {
	
	// add(), get(), size(), isEmpty(), contains(), remove(), add(index,value), clear() for ArrayList

	public static void main(String[] args) 
	{

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		
		//isEmpty()
		System.out.println("Is ArrayList Empty before adding element: "+a1.isEmpty());   //to verify if ArrayList is empty or not

		
		//add()
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(25);
		a1.add(75);
		a1.add(10);
		a1.add(20);
		System.out.println("Is ArrayList Empty after adding element: "+a1.isEmpty());    //to verify if ArrayList is empty or not
		
		
		//size()
		System.out.println("Total number of Elements in ArrayList is: "+a1.size());     //to print total count of elements in ArrayList
		
		
		//contains()
		System.out.println("if 50 is available in ArrayList or no: "+a1.contains(50));  //to verify if any perticular element available in ArrayList or not
		System.out.println("if 10 is available in ArrayList or no: "+a1.contains(10));
		
		
		//remove()
		a1.remove(1);                       //to remove specific element based on index
		System.out.println(a1);    
		
		
		//if user want to add element at any specific position
		a1.add(2, 77);
		System.out.println(a1);
		
		
		//clear()
		a1.clear();                        //to remove all elements from ArrayList
		System.out.println(a1);
		
		
		
	}

}
