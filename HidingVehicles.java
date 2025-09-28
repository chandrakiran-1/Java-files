abstract class Vehicle
{
	abstract void start();
		void fuel()
		{
			System.out.println("the Vehicle is fueling ");
		}
}
class Bike extends Vehicle
{
	void start()
	{
		System.out.println("The bike is Started with key ");
		System.out.println(" ---------------------------------------------------------------------- ");
	

	}
}
class Car extends Vehicle
{
	void start()
	{
	System.out.println("The car is Started with start button ");
	System.out.println(" ---------------------------------------------------------------------- ");
	
	}
}
class Truck extends Vehicle
{
	void start()
	{
		System.out.println("The truck is started with clutch ");
		System.out.println(" ---------------------------------------------------------------------- ");
	

	}
}
class HidingVehicles
{
	public static void main(String []args)
	{
		Vehicle  v = new Bike();
		Vehicle  x= new Car();
		Vehicle  y= new Truck();
	v.fuel(); v.start();
	x.fuel(); x.start();
	y.fuel(); y.start();
	}
}
