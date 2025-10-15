class Calculator 
{
	static int add(int a  , int b)
	{
		return a + b;
	}
}
public class TestStaticx
{
	public static void main(String []args)
	{
		int sum = Calculator.add(10,20);
		System.out.println( " the sum is : " + sum );
	}
}