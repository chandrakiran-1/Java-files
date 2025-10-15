class Person
{
	private int age;
	private String name;

public Person(String name, int age)
{
	this.name=name;
	this.age=age;
}
	
public int getAge(){
	return age;
	}
public void setAge( int age){
	if (age> 0){
		this.age= age;
	}else {
		System.out.println("Invalid age ");
	}
}
public String getName(){
	return name;
	}
public void setName( String name){
	this.name = name;
	}
}
public class Encapsu
{
	public static void main(String[]args)
	{
		Person p = new Person("alexa",20);
		System.out.println("name : " + p.getName());
		System.out.println("age : " + p.getAge());
		p.setAge(30);
		p.setAge(-4);
		p.setName("bobb");
		System.out.println("updated name : " + p.getName());
	}
}
		