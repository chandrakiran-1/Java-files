class Animal
{
	void eat()
	{
		System.out.println(" Animal eats ");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println(" The Dog is Barking ");
	}
}
class Puppy extends Dog
{
	void play()
	{
		System.out.println(" The puppy is playing ");
	}
} 
public class Mullevelin
{
	public static void main(String [] args)
	{
		Animal a = new Puppy();
		a.eat ();
		
		Dog d = (Dog)a;
		d.bark();
		
		Puppy p = (Puppy)a;
		p.play();
	}
}