import java.util.Scanner;
class TestSca
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("enter a number : ");
			int n = sc.nextInt();
			int s = n*n;
			System.out.println("the square of num : " + s);
			}
		catch( Exception e){
				System.out.println(" Invalid input ! enter a number ");
		       } 
		 finally{
			System.out.println("program ends here ");
		}
	}
}