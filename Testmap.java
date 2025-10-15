import java.util.*;
class Testmap
{
	public static void main(String[]args)
	{
		Map<Integer, String> a= new HashMap<>();
		a.put(1,"java");
		a.put(2,"Spring");
		a.put(3,"boot");
		System.out.println(a);
		System.out.println(a.get(2));
	}
}