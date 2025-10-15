abstract class Animal
{
	abstract void sound();
	void sleep() {
			System.out.println(" sleeping ");
	}

}
class Dog extends Animal
{
	void sound()
	{
		System.out.println(" bark - bark ");
	
	}
}
class Cat extends Animal
{
	void sound()
	{
		System.out.println(" meowww ");
	}
}
class TestAbsclass
{
	public static void main(String[]args)
	{
		Animal a = new Dog();
		Animal b = new Cat();
		a.sleep();
		a.sound();
		b.sound();
	}
}