class Cal {
	int add (int a, int b)
	{
	return a+b;
     }
        double add( double a , double b)
	{
		return a+b;
	}
}
class Testpoly
{
	public static void main(String[]args)
	{
		Cal c = new Cal();
		System.out.println(c.add(12,23));
		System.out.println(c.add(2.3,3.4));
	}
}
	