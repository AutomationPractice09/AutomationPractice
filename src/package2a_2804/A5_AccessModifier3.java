package package2a_2804;

import package2_2804.A5_AccessModifier1;     //since object of class from another package is imported so this import line populate here

public class A5_AccessModifier3 {

	public static void main(String[] args) {
		A5_AccessModifier1 obj1 = new A5_AccessModifier1();  //created object of different class from another package and its possible due to public class
//		obj1.id;        					//not able to access default id in different class and different package
		System.out.println(obj1.student);   //able to access public student in same class
//      obj1.phone;					        //not able to access private phone in different class and different package
	}

}
