interface Car
{
	void start();
}
class Benz implements Car
{
	public void start()
	{
		System.out.println(" the Benz is started ");
	}
}
class Audi implements Car
{
	public void start()
	{
		System.out.println(" the Audi is Started");
	}
}
class Test
{
	public static void main(String[]args)
	{
		Car c = new Benz();
		Car d = new Audi();
		
		c.start();
		d.start();
	}
}