class Employee
{
	String name;
	String branch;
	int salary;
	
Employee(String n, String b, int s){
		this.name=n;
		this.branch=b;
		this.salary=s;
	}
void display(){
		System.out.println(" Employee name : " + this.name);
		System.out.println(" Employee branch : " + this.branch);
		System.out.println("Employee salary : " + this.salary);
	}}
public class f
{
	public static void main(String[]args)
	{
		Employee e = new Employee(" Chandrakiran", "It", 900000);
	e.display();
	}
} 