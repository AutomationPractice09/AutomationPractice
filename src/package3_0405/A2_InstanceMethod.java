package package3_0405;

public class A2_InstanceMethod {

	/* Instance Method:
	 * Method without static keyword is instance
	 * To call Instance we need Object as memory will create at the time of object
	 */
	
	public void show()
	{
		System.out.println("This is instance method");
	}
	
	public static void main(String[] args) 
	{
		
//		show();        we cannot call instance method without object
		
		A2_InstanceMethod ref1 = new A2_InstanceMethod();
		ref1.show();   //we can call instance method only with object 

	}

}
