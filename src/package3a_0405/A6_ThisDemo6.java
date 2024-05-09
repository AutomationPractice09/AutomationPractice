package package3a_0405;

public class A6_ThisDemo6 {

	public A6_ThisDemo6 start()
	{
		System.out.println("This is start the browser");
		return this;                                      //here we used this to return as current class instances thats why start() method able to gave other methods from current class
	}
	
	public A6_ThisDemo6 play()
	{
		System.out.println("This is play the browser");
		return this;
	}
	
	public A6_ThisDemo6 stop()
	{
		System.out.println("This is stop the browser");
		return this;
	}
	
	public static void main(String[] args) 
	{
	
		A6_ThisDemo6 ref1 = new A6_ThisDemo6();
		ref1.start().play().start().stop();        // this is method chaining or building pattern
		
	}

}
