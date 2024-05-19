package package2_2804;

public class A5_AccessModifier2 {

	public static void main(String[] args)
	{
		A5_AccessModifier1 obj1 = new A5_AccessModifier1();      //we have created object of another class in another class but in same package
		System.out.println(obj1.id);        //able to access default id in different class but same package
		System.out.println(obj1.student);   //able to access public student in different class but same class
//      obj1.phone                          //not able to access private phone in different class but same package
		System.out.println(obj1.acno);      //able to access protected variable in class in same package
	}

}
