class Calculator
{
	int add(int a, int b)
	{
		return a+b;
	}
	
	double sub(double a, double b)
	{
		return a-b;
	}
	double mul (double a, double b)
	{
		return a*b;
	}

}
class Calculate
{
	public static void main(String[]args)
	{
		Calculator c= new Calculator();
		System.out.println(c.add(3,4));
		System.out.println(c.sub(9.5,8.9));
		System.out.println(c.mul(2.4,3.4));
	}
}