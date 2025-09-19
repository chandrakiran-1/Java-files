class Student {

		String name; 
		String rollnumber;
		int marks;
	

	Student(String n, String r, int m)
	{
		name=n;
		rollnumber=r;
		marks=m;
	}
}
	
class Marks
{
	public static void main(String[]args)
	{
		Student x=new Student("chandu","11", 90);

			
		System.out.println(x.name);
		System.out.println(x.rollnumber);
		System.out.println(x.marks);
	}
}
		