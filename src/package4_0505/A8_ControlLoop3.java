package package4_0505;

public class A8_ControlLoop3 {

	/*do-while loop: it is exist control as we check the condition at end
	                 it is useful when user need to execute code at least once without taking condition 
	                 break or increment/decrement is required.
	*/
	
	public static void main(String[] args) 
	{

		int j = 5;                  //initialization
		
		do {
			System.out.println(j);
		} while(j>=10);               //here condition is not satisfy still it run once
		
		
		
		int i = 5;                  //initialization
		
		do {
			System.out.println(i);
			i++;                    //here we put increment otherwise it execute for infinite time
		} while(i<=10);
		
	}

}
