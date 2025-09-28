class Animal
{
	void sound()
	{
		System.out.println("Some Sound... ");
	}
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Bark !");
	}
	 
	void wagTail()
	{
		System.out.println(" Wagging Tail ");
	}
}
class Inheriex
{
	public static void main (String []args)
	{
		Animal a = new Dog();
		a. sound();
	        Dog d = (Dog)a;
		d.wagTail();
	}
}