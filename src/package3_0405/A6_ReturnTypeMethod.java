package package3_0405;

import package1_2704.A2_StudentObject;

public class A6_ReturnTypeMethod {
	
	/* Return type method
	 * - return keyword is used to return anything from method
	 * - return value will return to the calling method
	 * - when return keyword apply the return type i.e, void should be replace with return type data type  
	 */
	
	
	public int m1()
	{
		return 90;
	}
	
	
	public String m2()
	{
		return "smita";
	}
	
	
	public A2_StudentObject m3()      //here we returning object from another class of another package
	{
		A2_StudentObject s1 = new A2_StudentObject();
		return s1;
	}

	//if we need to return object of this current class then we have 2 way i.e m4() and m5()
	//m4() is conventional and lengthy method
	//m5() is using this keyword
	
	public A6_ReturnTypeMethod m4()     
	{
		A6_ReturnTypeMethod r1 = new A6_ReturnTypeMethod();
		return r1;
	}
	
	public A6_ReturnTypeMethod m5()     
	{
		return this;      // this will return current class reference variable
	}
	
	public static void main(String[] args) 
	{
      
		A6_ReturnTypeMethod ref1 = new A6_ReturnTypeMethod();
		int i1 = ref1.m1();
		System.out.println(i1);
		
		String name = ref1.m2();
		System.out.println(name);
		
		A2_StudentObject obj1 = ref1.m3();
		obj1.id = 1001;
		obj1.name = "Adiraj";
		obj1.display();
		
		A6_ReturnTypeMethod obj2 = ref1.m5();   //here we have created reference for m5() return object and able to access all method from it
		obj2.m1();
		obj2.m2();
		obj2.m3();
		obj2.m4();
		obj2.m5();

	}

}
