package package8_1905;

public class A6_NobelHospital implements A4_IMA, A5_USMA    //need to implement all the non-implemented methods from implemented interface and the extended interface
{
	
	public void xrayTest()
	{
		System.out.println("This is Xray Test");
	}
	
	public void mriTest()
	{
		System.out.println("This is MRI Test");
	}

	
	
	public static void main(String[] args) 
	{
	 
		//scenario 1: Child class reference and Child class object
		A6_NobelHospital ref1 = new A6_NobelHospital();
		ref1.covidTest();          //inherited abstract methods
		ref1.oxyTest();			   //inherited abstract methods
		ref1.dialysis();           //inherited abstract methods
		ref1.hypertension();       //inherited abstract methods
		ref1.psychometric();       //inherited abstract methods
		ref1.weightTest();         //inherited abstract methods
		ref1.xrayTest();           //individual methods
		ref1.mriTest();            //individual methods
		
		
		//scenario 2: parent class reference and parent class object
//        this is invalid scenario as we cannot create instance of interface class
		
		
		//scenario 3: parent class reference and child class object
		A4_IMA ref2 = new A6_NobelHospital();      //we can access methods from A3_WHO and A4_IMA interface
		ref2.covidTest();
		ref2.oxyTest();
		ref2.dialysis();
		ref2.hypertension();
		
		
		//scenario 4: parent class reference and child class object
		A5_USMA ref3 = new A6_NobelHospital();     //we can access methods from A3_WHO and A5_USMA interface
		ref3.covidTest();
		ref3.oxyTest();
		ref3.weightTest();
		ref3.psychometric();
		
	}
	
	

	@Override
	public void covidTest()                        //this is non-implemented methods from interface WHO
	{
		System.out.println("Covid Test");
		
	}

	@Override										//this is non-implemented methods from interface WHO
	public void oxyTest() 
	{
		System.out.println("Oxygen Test");
		
	}

	@Override										//this is non-implemented methods from interface IMA
	public void dialysis() 
	{
		System.out.println("Dialysis");
		
	}

	@Override
	public void hypertension() 						//this is non-implemented methods from interface IMA
	{
		System.out.println("Hypertension");
		
	}

	@Override
	public void psychometric() 						//this is non-implemented methods from interface USMA
	{
		System.out.println("Psychometry Test");
		
	}

	@Override
	public void weightTest() 						//this is non-implemented methods from interface USMA
	{
		System.out.println("Weight Test");
		
	}

}
