package package3_0405;

public class A8_CallByValueMethod {
	
	public void callByValue(int a)
	{
		System.out.println("Call by value with number: "+a);
	}

	
	public static void main(String[] args) 
	{    
		//if any method called by passing value to it then it is called callbyvalue method
		
		A8_CallByValueMethod ref1 = new A8_CallByValueMethod();
		ref1.callByValue(107);     //here we pass value 107 to method
	}

}
