package package5_1105;

public class A5_Array2D {

	public static void main(String[] args) 
	{

		Object data[][] = {{101,"Manaswinee"},{102,"Adiraj"},{103,"Viha"},{104,"Yugendra"}};
		
		System.out.println(data[0][0]);     //print single element from array
		
		int row_num = data.length;          //count number of rows in multi dimensional array 
		System.out.println("Total number of rows is: "+row_num);
		
		int col_num = data[0].length;       //count number of columns in multi dimensional array
		System.out.println("Total number of columns is: "+col_num);
		
		
		for(int i=0;i<data.length;i++)      //use of nested for loop to iterate multi dimensional array
		{
			for(int j=0;j<data[0].length;j++)
			{
				System.out.print(data[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
		for(Object i[]:data)                //use of for each loop to iterate multi dimensional array. Note: here use int i[] since arr gives array of single dimension
		{
			for(Object j:i)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
	}

}
