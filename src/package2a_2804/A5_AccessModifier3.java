package package2a_2804;

import package2_2804.A5_AccessModifier1;     //since object of class from another package is imported so this import line populate here

public class A5_AccessModifier3 extends A5_AccessModifier1 {

	public static void main(String[] args) {
		A5_AccessModifier1 obj1 = new A5_AccessModifier1();  //created object of different class from another package and its possible due to public class
//		obj1.id;        					//not able to access default id in different class and different package
		System.out.println(obj1.student);   //able to access public student in same class
//      obj1.phone;					        //not able to access private phone in different class and different package2_2804
//      obj1.acno;                          //not able to access protected acno in different class and different package with sub class
		
		A5_AccessModifier3 obj2 = new A5_AccessModifier3();
		System.out.println(obj2.acno);      //able to access protected acno using child class reference and object 
											//we also need to make this current class a child class from variable value need to access 
		
	}

}
