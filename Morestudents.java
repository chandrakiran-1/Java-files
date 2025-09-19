class Student
{
	String name;
	String branch;
	int rollno;
	int year;

Student(String name, String branch, int rollno, int year)
{
	this.name=name;
	this.branch=branch;
	this.rollno=rollno;
	this.year=year;
	}
void display() 
{
	System.out.println("name :"+name);
	System.out.println("branch :"+branch);
	System.out.println("rollno :"+ rollno);
	System.out.println("year :"+year);
	System.out.println("----------------------------------");
}}
class Morestudents
{
	public  static void main(String[]args)
	{
		Student s1= new Student("chandu","bsc-cs",11,2023);
		Student s2=new Student("harsha","bca-ds",13,2023);
		

		s1.display();

		s2.display();		

	}

}
