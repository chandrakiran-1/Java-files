class Calculator
{
	int add(int a, int b)
	{
		return a+b;
	}
	int add(int a, int b, int c)
	{
		return a+b+c;
	}
	double add(double a, double b)
	{
		return a+b;
	}
}
class Chandmain
{
	public void main(String[]args)
	{
		Calculator x = new Calculator ();
		
	System.out.println(x.add(10,20));
	System.out.println(x.add(10,20,30));
	System.out.println(x.add(2.9,3.4));
	}
}