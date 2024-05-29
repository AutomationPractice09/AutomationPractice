package package9_2505;

import java.util.TreeSet;

public class A8_TreeSet 
{

	public static void main(String[] args) 
	{
	
		TreeSet<Integer> tr = new TreeSet<Integer>();
		tr.add(2);
		tr.add(9);
		tr.add(4);
		tr.add(7);
		tr.add(5);
		tr.add(11);
		tr.add(9);
		tr.add(15);
		
		System.out.println("TreeSet is: "+tr);     //print the tree set in sorted manner
		System.out.println("SubSet of TreeSet tr: "+tr.subSet(2,9));     //print the subset from 2 to 9
		System.out.println("Tailset of TreeSet tr: "+tr.tailSet(7));     //print the tail set from 7
		System.out.println("Headset of TreeSet tr: "+tr.headSet(5));     //print the head set till 5
		System.out.println("Print in descending order: "+tr.descendingSet());
		
	}

}
