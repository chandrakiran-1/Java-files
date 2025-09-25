class Printer
{	
	void print( int number )
	{	
		System.out.println("printing num :" + number);
	}
	void print(String text)
	{
		System.out.println("printing text :" + text);
	}
	void print(double number)
	{
		System.out.println("printing double num :"+ number);
	}
}
class Printing
{
	public static void main(String[]args)
	{
		Printer z = new Printer();
		z.print(2);
		z.print("chandu");
		z.print(2.34567899999);
	
	}
} 
