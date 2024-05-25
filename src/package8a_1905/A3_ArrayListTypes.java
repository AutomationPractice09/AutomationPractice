package package8a_1905;

import java.util.ArrayList;

public class A3_ArrayListTypes {

	public static void main(String[] args) 
	{
	
		ArrayList<Integer> a1 = new ArrayList<Integer>();           //this is Integer type ArrayList
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(15);
		a1.add(10);
		
		System.out.println("Total Element in ArrayList is: "+a1.size());
		System.out.println(a1);
		System.out.println();
		
		
//--------------------------------------------------------------------------------------------------------
		
		
		ArrayList<String> a2 = new ArrayList<String>();            //this is String type ArrayList
		
		a2.add("Digvijay");
		a2.add("Prateek");
		a2.add("Vipin");
		a2.add("Gajendra");
		a2.add("Kajal");
		
		System.out.println("Total Element in ArrayList is: "+a2.size());
		System.out.println(a2);
		System.out.println();

//---------------------------------------------------------------------------------------------------------
		
		
		ArrayList<Double> a3 = new ArrayList<Double>();           //this is Double type ArrayList
		a3.add(12.21);
		a3.add(32.21);
		a3.add(40.23);
		a3.add(54.12);
		a3.add(10.324);
		a3.add(12.21);
		
		System.out.println("Total Element in ArrayList is: "+a3.size());
		System.out.println(a3);
		System.out.println();
		
//---------------------------------------------------------------------------------------------------------
		
		
		ArrayList<Object> a4 = new ArrayList<Object>();         //this is Object type ArrayList
		a4.add("Digvijay");
		a4.add(2700);
		a4.add(23.32);
		a4.add('T');
		a4.add(true);
		
		System.out.println("Total Element in ArrayList is: "+a4.size());
		System.out.println(a4);
	
	}

}
