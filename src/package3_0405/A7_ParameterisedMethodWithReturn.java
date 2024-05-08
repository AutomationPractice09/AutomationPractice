package package3_0405;

public class A7_ParameterisedMethodWithReturn {
	
	public int mul(int a, int b)    //this 2 parameterized method with return type
	{
		return a*b;
	}

	public static void main(String[] args) 
	{

		A7_ParameterisedMethodWithReturn ref1 = new A7_ParameterisedMethodWithReturn();
		int sal = ref1.mul(12,3);
		System.out.println(sal);
	}

}
