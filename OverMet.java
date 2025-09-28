class Calculator
{
	int pow(int x, int y)
	{
		return (int)Math.pow(x,y);
	}
	
	int add( int x, int y)
	{
		return x+y;
	}
	 double sub(double x, double y)
	{
		return x-y;
	}
}
class OverMet
{
	public static void main(String[]args)
	{
		Calculator c = new Calculator();
		
	System.out.println(c.pow(2,3));
	System.out.println(c.add(1,9));
	System.out.println(c.sub(10,10));
	}
}