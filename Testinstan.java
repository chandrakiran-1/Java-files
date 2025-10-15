class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class Testinstan
{
	public static void main(String[]args)
	{
		Animal a = new Dog();
		String result = (a instanceof Dog) ? "it is a dog" : "it is not a dog";
	System.out.println(result);
	}
}