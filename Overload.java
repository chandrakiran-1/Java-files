// overload constructor

class Construct
{
	String name;
	int age;
	String branch;
	
Construct( String n, int a)
	{
		this.name=n;
		this.age=a;
	}
Construct(String n, int a, String b)
	{
		this.name=n;
		this.age=a;
		this.branch=b;
	}
void display()
	{
		System.out.println(" name : " + name + ", age : " + age + ", branch : " + branch);
	
	}
}
class Overload
{
	public static void main(String[]args)
	{
		Construct x= new Construct("chandu",20);
		Construct y=new Construct("harsha",20,"bsc");
	
	x.display();
	y.display();
}
}
		