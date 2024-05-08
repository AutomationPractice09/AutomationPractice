package package2_2804;

public class A5_AccessModifier1 {
	
	int id = 101;    				     //this is default variable type (access into class and same package)
	public String student = "Patil";     //this is public variable  (access is everywhere class, same package, different package)
	private long phone = 9896757858L;    // this is private variable (access within class only)

	public static void main(String[] args) 
	{
		A5_AccessModifier1 obj1 = new A5_AccessModifier1();
		System.out.println(obj1.id);        //able to access default id in same class
		System.out.println(obj1.student);   //able to access public student in same class
		System.out.println(obj1.phone);     //able to access private phone in same class
	}

}
