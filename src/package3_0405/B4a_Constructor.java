package package3_0405;

public class B4a_Constructor {

	int id;
	String name;
	
	public B4a_Constructor(int i, String s)    //here this parameterized constructor assign value of local variable i.e, i and s to instance variable id and name
	{
		id = i;
		name = s;
	}
	
	public void show()
	{
		System.out.println("ID is: "+id);
		System.out.println("Name is: "+name);
	}
	
	
	public static void main(String[] args) 
	{
	
		B4a_Constructor ref1 = new B4a_Constructor(70,"Adiraj");    //here we called parameterized constructor
		ref1.show();
		
	}

}
