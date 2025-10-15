import java.util.*;
class Testlinkedlist
{
	public static void main(String[]args)
	{
		LinkedList<String> l = new LinkedList<>();
		l.add("A");
		l.add("B");
		l.addFirst("START");
		l.addLast("STOP");
		System.out.println(l);
	}
}
//  linkedlist contain the addfrist , add last methods 