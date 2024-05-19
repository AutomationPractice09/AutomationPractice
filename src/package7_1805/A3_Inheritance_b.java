package package7_1805;

/*
 * C) Hierarchical Inheritance:
 *       below class G extends class F and class H extends class F
 *       G -> F  and H -> F   (2 or more than 2 class extends to same class)
 *       object of class G can access all methods of class G as well as parent class F
 *       object of class H can access all methods of class H as well as parent class F
 *       object of class F can access all methods of class F only and not any child class methods
 *       object of class G and object H also cannot access each others methods
 */


class F
{
	public void m1()
	{
		System.out.println("M1 is calling");
	}
}

class G extends F
{
	public void m2()
	{
		System.out.println("M2 is calling");
	}
}

class H extends F
{
	public void m3()
	{
		System.out.println("M3 is calling");
	}
}



public class A3_Inheritance_b {

	public static void main(String[] args) 
	{
	
		F ref1 = new F();		//access only own class method and not child class methods |
		ref1.m1();              //m1() is individual method
		
		G ref2 = new G();      //access its own class method and parent class F but cannot access methods of class H
		ref2.m1();             //m1() is  inherited method
		ref2.m2();			   //m2() is individual method
		
		H ref3 = new H();     //access its own class method and parent class F but cannot access methods of class G
		ref3.m1();            //m1() is  inherited method
		ref3.m3();            //m3() is individual method
		
	}

}
