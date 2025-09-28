class Animal
{
	void eat()
	{
		System.out.println(" Animal is eating ");
	}
} 
class Dog extends Animal
{
	void bark()
	{
	
	System.out.println(" the dog is barking");
	}
}
class Singleinh
{
	public static void main(String[]args)
	{
		Animal a = new Dog();
		a.eat();
		((Dog a).bark();
	}
}
				