package package1_2704;

public class A2_StudentObject {

	public int id;           // initialize data
	public String name;      // initialize data
	
	public void display()       //this is function/ method under class
	{
		System.out.println("Student ID is "+id);
		System.out.println("Student Name is "+name);
	}
	
	public static void main(String[] args) 
	{
	
		A2_StudentObject s1 = new A2_StudentObject();   //creation of object of class to access data and method/function of class
		s1.id = 12;
		s1.name = "Digvijay";
		s1.display();
		
		A2_StudentObject s2 = new A2_StudentObject();
		s2.id=13;
		s2.name="Narendra";
		s2.display();
	
	}

}
