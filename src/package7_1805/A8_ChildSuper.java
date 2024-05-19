package package7_1805;

public class A8_ChildSuper extends A7_ParentSuper {
	
	int cid = 201;
	
	
	public void childIncome()
	{
		System.out.println("Id of Parent is: "+super.pid);       //here we used super keyword to call variable "pid" from parent class 
		super.parentIncome();                                    //here we used super keyword to call method "parentIncome" from parent class
		
		System.out.println("Id of Child is "+cid);
		System.out.println("Income of child is $90,000");
	}
	
	
	public A8_ChildSuper()
	{
		super();                                                //here we used super() constructor only to call immidiate parent class constructor
		System.out.println("This is child class constructor");
	}

	
	public static void main(String[] args) 
	{
		A8_ChildSuper ref1 = new A8_ChildSuper();
		ref1.childIncome();
	}

}
