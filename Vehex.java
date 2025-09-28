class Vehicle
{
	void start()
	{
		System.out.println(" Vehicle is Starting ");
	}
}
class Bike extends Vehicle
{
	void start()
	{
		System.out.println( " bike is Starting with keys ");
	}
}
class Vehex
{
	public static void main(String[]args)
	{
		Vehicle v = new Bike();
		v.start();
		
		Bike b = (Bike)v;
		b.start();
	}
}