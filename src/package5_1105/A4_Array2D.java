package package5_1105;

public class A4_Array2D {
	

	public static void main(String[] args) 
	{

		int arr[][] = new int[2][3];     //2 row and 2 column array initialize with new keyword
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 25;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[1][2] = 45;
		
		System.out.println(arr[1][0]);   //print single element of array
		
		int row_num = arr.length;        //count number of rows in multi dimensional array 
		System.out.println("Number of rows in array is: "+row_num);
		
		int col_num = arr[0].length;     //count number of columns in multi dimensional array 
		System.out.println("Number of columns i array is: "+col_num);
		
		
		
		for(int i=0;i<arr.length;i++)       //use of nested for loop to iterate multi dimensional array
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
		
		for(int i[]:arr)                   //use of for each loop to iterate multi dimensional array. Note: here use int i[] since arr gives array of single dimension
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
	}

}
