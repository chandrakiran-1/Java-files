class Student {
	private String name;
	private int marks;
	
	public String getName()
	{
	return name;
	}
	
	public int getMarks()
	{
	return marks;
	}
	
	public void setName(String n)
	{
		name=n;
	}
	
	public void setMarks(int m)
	{
		if(m >0)
		{
			marks=m;
		}
		else
		{
			System.out.println("Invalid Age ");
		}
	}
}

class Std {
	public static void main (String[]args)
		{
			Student s= new Student();
			s.setName("chandu");
			s.setMarks(97);
			

			System.out.println(s.getName());
			System.out.println(s.getMarks());;
}}