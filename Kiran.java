class Car
{
	String brand;
	String model;
	int speed;

	Car(String b, String m, int s)
		{
			brand=b;
			model=m;
			speed=s;
		}


	void start()

		{
			System.out.println("the " + brand + " is started ");
		}
}
		

class Kiran
{
	public static void main(String[]args)
		{ 
			Car x = new Car("Benz", "Merc",200);
			x.start();

	System.out.println(x.brand);
	System.out.println(x.model);
	System.out.println(x.speed);

	}

}
			
	