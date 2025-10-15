

final class Vehicle
{
	final int wheels= 4;
	
	final void showDetails()
	{
		System.out.println
(" the vehicles has " + wheels + " wheels.");
	}
}
public class Testfinal{
	public static void main(String[]args)
	{
		Vehicle v = new Vehicle();
		v.showDetails();
	}
}