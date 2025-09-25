// method overriding = runtime polymorphism.

class Bank
{
	double getInterestRate()
	{
		return 5.0;
	}
	
}
class Sbi extends Bank
{
	double getInterestRate()
	{
		return 6.5;
	}
}
class Hdfc extends Bank
{
	double getInterestRate()
	{
		return 7.0;
	}
}
public class metovr
{
	public static void main(String[]args)
	{
		Bank b1 = new Sbi();
		Bank b2 = new Hdfc();
	System.out.println("Sbi interest : " + b1.getInterestRate());
	System.out.println("Hdfc interest : " + b2.getInterestRate());
	}
}