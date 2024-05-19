package package7_1805;

/*
 * B) Multi-level inheritance:
 *    below class D extends class C and class E extends class D
 *    D -> C  and E -> D
 *    object of class D can access all methods of class D as well as parent class C
 *    object of class E can access all methods of class E, Class D as well as parent class C
 *    but object of class D can access all methods of class D as well as parent class C and not access methods of its child class E
 *    but object of class C can access all methods of class C only and not access methods of its child class D and class E
 */

class C
{
	public void m1()
	{
		System.out.println("M1 is calling");
	}
}

class D extends C                  
{
	public void m2()
	{
		System.out.println("M2 is calling");
	}
}

class E extends D                       //this is multi level inheritnce 
{
	public void m3()
	{
		System.out.println("M3 is calling");
	}
}



public class A2_Inheritance_a {

	public static void main(String[] args) 
	{
		
		C ref1 = new C();
		ref1.m1();              //able to access only class C methods but not child class D and E | here m1() is individual method
		
		D ref2 = new D();
		ref2.m1();              //able to access methods of class D and parent class C but not child class E methods
		ref2.m2();              //here m1() is inherited method and m2() is individual method
		
		E ref3 = new E();
		ref3.m1();              //able to access methods of class E, parent class D and class C also
		ref3.m2();				//here m1() and m2() are inherited methods and m3() is individual method
		ref3.m3();
		
		/*
		 * If reference of class A call its own class methods then they are individual method
		 * If reference of class B call methods of its inherited class then these called as inherited methods
		 */
		
	}

}
