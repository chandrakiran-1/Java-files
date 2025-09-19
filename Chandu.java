class Car
{
	String brand;
	int speed;
	
	void start()
		{
			System.out.println("the car is started");
		}
}

class Chandu
{
	public static void main(String[]args)
	{
	
	Car c = new Car();
	c.brand="benz";
	c.speed=200;
	c.start();
		

	System.out.println(c.brand);
	System.out.println(c.speed);
	}
}