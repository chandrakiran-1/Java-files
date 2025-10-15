import java.util.*;
class Monocept7
{
	public static void main(String[]args)
	{
		Scanner x= new Scanner(System.in);
		System.out.println(" enter a word : ");
		String word= x.nextLine();
		x.close();
		StringBuilder sb= new StringBuilder(word);
		System.out.println(sb.reverse().toString());
		System.out.println("----------------");
	}
}
