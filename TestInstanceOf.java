class Animal
{}
class Dog extends Animal
{}
class Puppy extends Animal
{}
public class TestInstanceOf
{
	public static void main(String []args)
	{
		Animal a1= new Animal();
		Animal a2 = new Dog();
		Animal a3= new Puppy();
	System.out.println(a1 instanceof Animal);
	System.out.println(a1 instanceof Dog);
	System.out.println(a2 instanceof Dog);
	System.out.println(a2 instanceof Puppy);
	System.out.println(a3 instanceof Puppy);
	System.out.println(a3 instanceof Animal);
	System.out.println(a3 instanceof Dog);
	}
}
	