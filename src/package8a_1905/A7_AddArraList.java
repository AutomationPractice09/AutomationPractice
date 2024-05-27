package package8a_1905;

import java.util.ArrayList;
import java.util.List;

public class A7_AddArraList {

	public static void main(String[] args) 
	{
	
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(20);
		
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(50);
		l2.add(60);
		l2.add(65);
		l2.add(70);
		l2.add(60);
		
		//User can add ArrayList by 2 ways
		
		//Way - 1
		List<List<Integer>> finalList = new ArrayList<>();     //remember that no need to mention <Integer> in constructor
		finalList.add(l1);
		finalList.add(l2);
		System.out.println(finalList);
		
		//Way - 2
		List<Integer> fList = new ArrayList<Integer>();        //remember that need to mention <Integer> in constructor
		fList.addAll(l1);
		fList.addAll(l2);
		System.out.println(fList);
	}

}
