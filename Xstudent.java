class Student{
	static String school=" ABC school ";
	String name;	
	
Student ( String n )
	{
		this.name= n;
	}
	 
void show (){
		System.out.println(name + " studies in " + school);
	}
}
public class Xstudent
{
	public static void main(String []args)
	{
		Student s1= new Student("ram");
		Student s2 = new Student(" Sri ");
		s1.show();
		s2.show();
	
	System.out.println(Student.school);
	}
}
		
