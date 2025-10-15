import java.util.*;
class Monocept9
{
	public static void main(String[]args)
	{
		Scanner c= new Scanner(System.in);
		System.out.println("Enter a year : ");
		int year = c.nextInt();
		if((year%4==0 && year%100 !=0)|| (year%400==0))
		{
			System.out.println(" LEAPYEAR ");
		}
		else{
			System.out.println("NOT A LEAPYEAR");
		}
	}
}