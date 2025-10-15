class Bike
{
	String name;
	int speed;

Bike(String name, int speed )
{
	this.name=name;
	this.speed= speed;
}
void display(){
	System.out.println(name + "  bike drives at  " + speed + "km/hr");
	}
}
public class Basicbike
{
	public static void main(String[]args)
	{
		Bike b1= new Bike("Enifiled ",130);
		b1.display();
		
		Bike b2= new Bike(" Metroer ", 150);
		b2.display();
	}
}