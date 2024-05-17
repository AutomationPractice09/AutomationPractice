package assignments;

public class Assignment16 {
	
	public void payment(String address)
	{
		System.out.println("This is cash on delivery payment method with address: "+address);
	}
	
	public void payment(int number)
	{
		System.out.println("This is debit card payment method with card number: "+number);
	}
	
	public void payment(long number1)
	{
		System.out.println("This is credit card payment method with card number: "+number1);
	}
	
	public void payment(String upicode, long mobile)
	{
		System.out.println("This is UPI payment method with mobile number: "+mobile);
	}
	
	public void payment(long mobile, String customer)
	{
		System.out.println("This is Amazon pay payment method with customer name: "+customer);
	}
	

	public static void main(String[] args) 
	{
		Assignment16 ref1 = new Assignment16();
		ref1.payment("Kolhapur 416229");
		ref1.payment(564354565);
		ref1.payment(34556634535434L);
		ref1.payment("ASX23423", 8912231224L);
		ref1.payment(7867123456L, "Digvijay Patil");
		
		
		
	}

}
