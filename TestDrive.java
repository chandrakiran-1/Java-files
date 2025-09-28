class Vehicle
{
	void start()
	{
		System.out.println(" Vehicle Starts ");
	}
}
class Car extends Vehicle
{
	void start()
	{
		System.out.println("The car is started with the key ");
	}
	
	void sound()
	{
		System.out.println(" The music is coming from the car ");
	}
}
class TestDrive
{
	public static void main (String []args)
	{
		Vehicle v  = new Car();
		v.start();
		
		Car c = (Car)v;
		c.start();
		c.sound();
	}
}