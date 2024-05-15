package package5_1105;

public class A2_Array1D {
	

	public static void main(String[] args)
	{
		
		int arr[] = {23,45,12,67,89,34,45};         //initialize array in literal form
		
		
		System.out.println(arr[3]);                 //print one element of array
		
		
		for(int i=0;i<arr.length;i++)               //use of for loop to iterate all elements of array
		{
			System.out.println(arr[i]);          
		}
		
		for(int i : arr)                            // use of for each loop to iterate all elements in array
		{
			System.out.println(i);
		}
		
//--------------------------------------------------------------------------------------------------------------
		
		
		String names[] = {"Digvijay","Prateek","Vipin","Kajal"};
		
		
		System.out.println(names[0]);               //print one element of array
		
		
		for(int i=0;i<names.length;i++)             //use of for loop to iterate all elements of array
		{
			System.out.println(names[i]);
		}
		
		
		for(String i : names)                      // use of for each loop to iterate all elements in array
		{
			System.out.println(i);
		}
		
		

	}

}
