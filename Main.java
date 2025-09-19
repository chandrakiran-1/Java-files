class Car
{
	String brand;
	int speed;
	
	void start()
		{
			System.out.println("the car is started");
		}
}

class Main
{
	public static void main(String[]args)
	{
	
	Car c = new Car();
	c.brand="benz";
	c.speed=200;
	c.start();
	}
}