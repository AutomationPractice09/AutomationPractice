package package9_2505;

import java.util.HashMap;
import java.util.Map;

public class A9_HashMap 
{

	public static void main(String[] args) 
	{

		HashMap<String,Integer> map = new HashMap<String, Integer>();
		map.put("Pune",416229);
		map.put("Kolhapur",416879);
		map.put("Mumbai",416001);
		map.put("Nashik",416589);
		map.put("Nagar",416001);        //duplicate value can be working
		
		System.out.println(map);        //this will not print in order as hashing method applied here 
		
		System.out.println(map.containsKey("Pune"));
		System.out.println(map.containsValue(416879));
		System.out.println(map.containsKey("Nagar"));
		System.out.println(map.containsValue(419223));
		
		System.out.println("Total size of Elements is: "+map.size());
		
		map.put("Mumbai",46007);      //if key is duplicate then it replaced new value for same key
		System.out.println(map);  

		
		
		//Iterate in map using for each 
		for(Map.Entry<String,Integer> i : map.entrySet())
		{
			System.out.println(i.getKey()+" : "+i.getValue());
		}
		
	}

}
