package package5_1105;

public class A1_Array1D {

	public static void main(String[] args) {
		
		int arr[] = new int[5];     //here we initialize array with new keyword
		arr[0] = 10;
		arr[1] = 34;
		arr[2] = 21;
		arr[4] = 99;               //here we skip arr[3] so system automatically take arr[3]=0 by default for int type
		
		System.out.println(arr[1]);    //print 1 element from array
		
		
		for (int i=0;i<arr.length;i++)      //here we take for loop as we know elements in array
		{
			System.out.println(arr[i]);
		}
		
		
		int sum = 0;
		for (int i=0;i<arr.length;i++)        //use of simple for loop to find sum of all numbers in array
		{
		 	sum = sum + arr[i];
		}
		System.out.println("The sum of all array elements is: "+sum);
		
		
		for(int i : arr)                     //use of for each loop
		{
			System.out.println(i);
		}
		
		
//----------------------------------------------------------------------------------------------------------
		
		
		String names[] = new String[4];        //here we initialize array with new keyword
		names[0]="Digvijay";
		names[1]="Bhagwan";
		names[3]="Patil";                      //here we skip arr[2] so system automatically take names[2]=null by default for String type
		
		System.out.println(names[1]);          //print 1 element from array
		
		
		for(int i=0;i<names.length;i++)       //use of for loop to print all strings in array
		{
			System.out.println(names[i]);
		}
		
		
		for(String i : names)                //use of for each loop
		{
			System.out.println(i);
		}

	}

}
