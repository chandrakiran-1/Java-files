class Bank
{
	double getInterestRate()
	{
		return 5.0;
	}
}

class SBI extends Bank
{
	@Override
	double getInterestRate()
	{
		return 6.0;
	}
}
class HDFC extends Bank
{ 
	@Override
	double getInterestRate()
	{
		return 7.0;
	}
}
class Banking
{
	public static void main(String[]args)
	{
		Bank x= new SBI();
		System.out.println("SBI Interest rate : " + x.getInterestRate());
		
		Bank y= new HDFC();
		System.out.println("HDFC Interest rate : " + y.getInterestRate());
	}
}