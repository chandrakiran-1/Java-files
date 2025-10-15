import java.util.Scanner;
class Checkscan
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter Number  a: ");
			int a = sc.nextInt();
			
			System.out.println("Enter Number b: ");
			 
			int b= sc.nextInt();
			
			int result= a/b;
			
			System.out.println("Result is : " + result);
		}
		catch (Exception x)
		{
			System.out.println(" Error : you can't divide by zero " + x);
		}
		finally{
			System.out.println(" Program is ended ");
			}
	}
}
			