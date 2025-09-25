//method overloading= compile time polymorphism.

class Area
{
	int area (int x)
	{
		return x*x;
	}
	int area(int x, int y)
	{
		return x*y;
	}
	double area(double x)
	{
		return 3.14*x*x;
	}
}
class Areaof
{
	public static void main(String[]args)
	{
		Area a= new Area();
		System.out.println("Ar of Square : " + a.area(2));
		System.out.println("Ar of Rectangle : " + a.area(2,3));
		System.out.println("Ar of circle  : " + a.area(2));
	}
}
		