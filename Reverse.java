import java.util.*;
class Reverse
{
	public static void main(String[]args)
	{
		Scanner x = new Scanner(System.in);
		System.out.println("enter a sentence ");
		String sentence = x.nextLine();
		String words[]= sentence.split(" ");
	         StringBuilder reverseSentence= new StringBuilder();
	for( String word : words)
	{
		StringBuilder reverseWord= new StringBuilder(word);
		reverseSentence.append(reverseWord.reverse()).append(" ");
	}
		System.out.println(" reversed sentence :");
		System.out.println(reverseSentence.toString().trim());
	
      }
}