package package7_1805;

/*
 *A) single level inheritance:
 *      below class B extends class A 
 *      object of class b can access all methods of class B as well as parent class A
 *      but object of class A is only able to access methods of class A and not a able to access child class methods
 */

class A
{
	public void m1()
	{
		System.out.println("M1 is calling");
	}
}


class B extends A        //here Class A becomes parent of Class B | A is parent and B is child -> Single level inheritance
{
	public void m2()
	{
		System.out.println("M2 is calling");
	}
}



public class A1_Inheritance {
	
	public static void main(String[] args) 
	{
		
		A ref1 = new A();    //Parent class object
		ref1.m1();           //able to access m1() only and not m2()
		
		
		B ref2 = new B();    //child class object
		ref2.m1();           //able to access both parent class A and child class B methods
		ref2.m2();
	

	}

}
