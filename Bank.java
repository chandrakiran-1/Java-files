class Atm
{
	private int pin;
	private double bal= 100000;
	
	public void setPin(int p)
	{
		pin =p;
		System.out.println("Pin set Sucessfully");
	}
	
	public double getBal( int enteredPin)
	{
		if(enteredPin==pin)
		{
			return bal;
		}
		else
		{
			System.out.println("Invalid Pin");

		return 0;
		}
	}
	
}
class Bank
{
	public static void main(String[]args)
	{
		Atm a=new Atm();
		a.setPin(1234);
		System.out.println("Your balance is : "+ a.getBal(1234));
		System.out.println("Your balance is : "+a.getBal(1111));
	}
}