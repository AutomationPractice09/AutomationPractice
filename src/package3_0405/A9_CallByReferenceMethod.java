package package3_0405;

import package1_2704.A2_StudentObject;

public class A9_CallByReferenceMethod {

	public void callByRef (A2_StudentObject s1)
	{
		System.out.println("Call by reference for StudentData class");
		s1.id = 201;
		s1.name = "Digvijay";
		s1.display();
	}
	
	public static void main(String[] args) 
	{
        
		//any method called by passing reference (object) to it then it is called callbyreference
		
		A9_CallByReferenceMethod ref1 = new A9_CallByReferenceMethod();
		
		A2_StudentObject s1 = new A2_StudentObject();
		ref1.callByRef(s1);
		
	}

}
