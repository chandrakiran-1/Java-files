import java.util.*;
class Monocept8
{
	public static void main(String[]args)
	{
		Scanner x= new Scanner(System.in);
		System.out.println("enter number : ");
		int n = x.nextInt();
		if( n<=0)
		{
			System.out.println("FALSE");
			return;
		}
		while( n%4==0)
			{
				n/=4;
			}
	System.out.println(n==1?"TRUE":"FALSE");
	}
}