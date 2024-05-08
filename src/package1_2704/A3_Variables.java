package package1_2704;

public class A3_Variables {

	static String clg = "Bharati Vidyapeeth's COE";   // this is static variable since consist static word
	
		
	int pincode;   //this is an instance variable since doesn't consist static word
	
	
	public void show()
	{
		int marks = 90;    //local variable since declared under method/function
		System.out.println("Mark from show() is "+marks);
		System.out.println("Pincode from show() is "+pincode);
	}
	
    public void display()
    {
    	int marks = 100;  //local variable since declared under method/function (user can use same name under different methods since scope of that variable is limited to method only)
    	System.out.println("Marks from display() is "+marks);
    }
	
    
    
    
    
	public static void main(String[] args) 
	{
		A3_Variables s1 = new A3_Variables();
		s1.show();
		s1.display();
		
		System.out.println(clg);     //printing static variable no need of object reference
		
		}

}
