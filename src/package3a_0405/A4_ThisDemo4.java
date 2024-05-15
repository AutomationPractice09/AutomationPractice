package package3a_0405;

public class A4_ThisDemo4 {
	
	
	//this can be passed as an argument in the method call
	
	
	public void m1(A4_ThisDemo4 ref1)
	{
		System.out.println("This keyword invoke current class object");
	}

	public void m2()
	{
		m1(this);         // this can be used as an argument in the method call | Doubt: if we give A4_ThisDemo4 in argument then t throws error
	}
	
	public static void main(String[] args) 
	{
	
		A4_ThisDemo4 ref2 = new A4_ThisDemo4();
		ref2.m2();
		
	}
}
