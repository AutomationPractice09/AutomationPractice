package package6a_1205;

public class A3_Polymorphism_a {

	//constructor overloading
	
	int id;
	String name;
	long account;
	
	
	public A3_Polymorphism_a()                            //this is default constructor
	{
		System.out.println("This is default constructor");
	}
	
	public A3_Polymorphism_a(int num, String s)           //this is same name constructor with 2 parameter
	{
		this.id = num;
		this.name = s;
		
		System.out.println("This is Employee with id: "+id+" and name: "+name);
	}
	
	public A3_Polymorphism_a(int num, String s, long l)   //this is same name constructor with 3 parameter
	{
		this.id = num;
		this.name = s;
		this.account = l;
		
		System.out.println("This is Employee with id: "+id+", name: "+name+" and account number: "+account);
	}
	
	
	public static void main(String[] args) 
	{
	
		A3_Polymorphism_a r1 = new A3_Polymorphism_a();                //calling default constructor
		
		A3_Polymorphism_a r2 = new A3_Polymorphism_a(7821,"Mahesh");   //calling 2 parameter constructor
		
		A3_Polymorphism_a r3 = new A3_Polymorphism_a(8954,"Prateek",93310076988612L);    //calling 3 parameter constructor
		
	}

}
