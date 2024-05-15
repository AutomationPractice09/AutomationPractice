package package5_1105;

public class A3_Array1D {

	public static void main(String[] args) 
	{
		
		Object empData[] = {"Sarang","Pune",28,'M',8765124312L};    //if user want to make a array with different data type then start with Object {array name} [] = {different data type values};
		
		
		System.out.println(empData[1]);
		
		
		for(int i=0;i<empData.length;i++)
		{
			System.out.println(empData[i]);
		}
		
		
		for(Object i:empData)
		{
			System.out.println(i);
		}
		
	}

}
