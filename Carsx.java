class  Car1{
	String brand;
	String model;
	
Car1(String brand, String model)
{
	this.brand=brand;
	this.model=model;
}}

class Car2{
	String brand;
	String model;
	int speed;


Car2(String brand , String model, int speed)
{
	this.brand=brand;
	this.model=model;
	this.speed=speed;
}}

class Carsx
{
	public static void main(String[]args)
	{
		Car1 x=new Car1("Benz", "300d");
		Car2 y=new Car2("Bmw", "600d",300);

	System.out.println(x.brand);
	System.out.println(x.model);

	System.out.println(y.brand);
	System.out.println(y.model);
	System.out.println(y.speed);
}
}

	
