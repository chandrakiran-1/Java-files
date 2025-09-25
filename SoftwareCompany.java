class Employee
{
	double salary()
	{	
		return 25000;
	}
	
}
class Manager extends Employee
{
	@Override
		double salary()
		{
			return 30000;
		}
}
class Developer extends Employee
{
	@Override
		double salary()
		{
			return 40000;
		}
}
class SoftwareCompany
{
	public static void main(String[]args)
	{
		Employee x= new Manager();
		Employee y= new Developer();
		System.out.println("Manager salary : " + x.salary());
		System.out.println(" Developer salary : " + y.salary());
	}
}	