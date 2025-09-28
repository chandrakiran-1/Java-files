class Vehicle
{
	void fuel()
	{
		System.out.println(" the Vehicle is fuelling ");
	}
}
class Bike extends Vehicle
{

	void start()
	{
		System.out.println(" the Bike is Started ");
	}
}
class Car extends Vehicle
{
	void start()
	{
		System.out.println(" the Car is Started ");
	}
}
class Exinheritance
{
	public static void main(String []args)
	{
		Bike b = new Bike();
		b.fuel(); b.start();
		
		Car c = new Car();
		c.fuel(); c.start();
	}
}