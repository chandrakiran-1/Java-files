class Car
{
	String color;
	int price;
	
	Car() // default constructor
	{
		color= "red ";
		price= 100000;
	}
	 Car(String c , int p )
	{
		color =c;
		price=p;
	}
	void display()
	{
		System.out.println(" color : " + color + ", price : " + price );
	}
}
class Constex
{
	public static void main(String []args)
	{
		Car c = new Car();
		Car d = new Car( " black ", 1000000);
		
		c.display();
		d.display();
	}
}