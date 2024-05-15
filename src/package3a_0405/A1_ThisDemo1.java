package package3a_0405;

public class A1_ThisDemo1 {
	
	
	//this keyword can be used to refer current class instance variable.

	int id;
	String name;
	
	public A1_ThisDemo1(int id, String name)
	{
//		id = id;            //this id and name is not going to work as local is assigned to local variable only due to same name
//		name = name;
		
		this.id = id;       //here we used this.id to assign local id and name value to instance id and name variable
		this.name = name;   //this word refer current class instance variable
	}
	
	public void show()
	{
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
	}
	
	
	public static void main(String[] args) 
	{

		A1_ThisDemo1 ref1 = new A1_ThisDemo1(77,"Manaswinee");
		ref1.show();

	}

}
