package package3a_0405;

public class A2_ThisDemo2 {

	public void m1()
	{
		System.out.println("M1() is callng");
	}
	
	public void m2()
	{
		this.m1();                               //here this word is used to call another method from same class
		System.out.println("M2() is calling");
	}
	
	public void m3()
	{
		System.out.println("M3() is calling");
	}
	
	
	
	public static void main(String[] args) 
	{
		
		A2_ThisDemo2 ref1 = new A2_ThisDemo2();
		ref1.m2();
			
	}

}
