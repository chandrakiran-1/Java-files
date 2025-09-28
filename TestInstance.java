class Vehicle{}
class Bike extends Vehicle{}
 
class TestInstance
{
	public static void main(String []args)
	{
		Vehicle v = new Bike();
	
	System.out.println(v instanceof Vehicle);
	System.out.println( v instanceof Vehicle);
	}
}