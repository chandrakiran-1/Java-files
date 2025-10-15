interface Car
{
	void sound();
}
class Benz implements Car
{
	public void sound()
	{
		System.out.println(" ru tu tu tutuuu ");
	}
}
 public class CarTest
{
	public static void main(String [] args)
	{
		Car c = new Benz();
		c.sound();
	}
}