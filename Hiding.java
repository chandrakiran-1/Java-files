abstract class Vehicle
{
	abstract void start();
	void fuel()
	{
		System.out.println("car is filling with fuel ");
	}
}
class Bike extends Vehicle
{
	void start()
	{
		System.out.println(" car is starting with the key ");
	}
}
class Hiding
{
	public static void main(String[]args)
	{
		Vehicle v = new Bike();
		v.fuel();
		v.start();
	}
}