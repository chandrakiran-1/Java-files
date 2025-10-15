class Animal {
	String name= "animal";	
	}
class Dog extends Animal {
	
	String name= "dog";
	}
void printname()
	{
		System.out.println(name);
		System.out.print(super.name);
	}
}
class TestSuper
{
	public static void main(String[]args)
	{
		Dog d= new Dog();
		d.printname();
	}
}				