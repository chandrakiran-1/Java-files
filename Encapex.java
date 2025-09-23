class Students
{
	private String branch;
	private String name;
	private int age;
	
	public void setBranch(String b)
	{
		branch=b;
	}
	public String getBranch()
	{
		return branch;
	}

	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	public void setAge( int a)
	{
		if( a>0)
		{
			age=a;
		}
		else
		{
			System.out.println("Invalid age");
		}
	
	}
	public int getAge()
	{
		return age;
	}
}
class Encapex
{
	public static void main(String[]args)
	{
		Students s= new Students();
		s.setBranch("BSC");
		s.setName("chandu");
		s.setAge(20);
	
	System.out.println("branch : " +s.getBranch());
	System.out.println("name : "+s.getName());
	System.out.println("age : "+ s.getAge());
}}
