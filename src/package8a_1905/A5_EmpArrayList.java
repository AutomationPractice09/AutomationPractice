package package8a_1905;

import java.util.ArrayList;

public class A5_EmpArrayList {

	public static void main(String[] args) 
	{
		
		A4_EmployeeClass e1 = new A4_EmployeeClass(101,"Digvijay");      //we created multiple objects for employee class constructor with different employee id and name
		A4_EmployeeClass e2 = new A4_EmployeeClass(102,"Prateek");
		A4_EmployeeClass e3 = new A4_EmployeeClass(103,"Vipin");
		A4_EmployeeClass e4 = new A4_EmployeeClass(104,"Gajendra");
		A4_EmployeeClass e5 = new A4_EmployeeClass(105,"Kajal");
		
		
		ArrayList<A4_EmployeeClass> a1 = new ArrayList<A4_EmployeeClass>();   //here we created ArrayList of type object A4_Employee
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		a1.add(e4);
		a1.add(e5);
		
		
		for(A4_EmployeeClass i:a1)        //iterate using for each loop to print all details in a1 ArrayList
		{
			System.out.println(i.eid+" : "+i.ename);
		}
		
		
		
		
	}

}
