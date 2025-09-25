class Vehicles
{
	 int speed()
	{
		return 60;
	}
}
class Bike extends Vehicles
{
	@Override
		int speed()
		{
			return 80;
		}
}
class Car extends Vehicles
{
	@Override
		int speed()
		{
			return 120;
		}
}
class Speed
{
	public static void main(String[]args)
	{
		Vehicles x= new Bike();
		Vehicles y= new Car();
	System.out.println(" Bike Speed : " + x.speed());
	System.out.println(" Car Speed : " + y.speed());
	}
}