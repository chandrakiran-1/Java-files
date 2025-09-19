



























class Xman{
		String name;
		String branch;
		int    rollno;
		int year;

Xman(String name, String branch, int rollno, int year)
{
	this.name=name;
	this.branch=branch;
	this.rollno= rollno;
	this.year=year;
}}

class Yman{
		String name;
		String branch;
		int    rollno;
		int  year;

Yman(String name, String branch ,int rollno, int year)
{
	this.name=name;
	this.branch=branch;
	this.rollno=rollno;
	this.year=year;
}}
class Twostudents
{
	public static void main(String[]args)
	{
		Xman x=new Xman("chandu","bsc cs",11,2023);
		Yman y=new Yman("harsha","bca ds",13,2023);
		
		System.out.println(x.name);
		System.out.println(x.branch);
		System.out.println(x.rollno);
		System.out.println(x.year);
			

	        System.out.println(y.name);
		System.out.println(y.branch);
		System.out.println(y.rollno);
		System.out.println(y.year);
	}
}
			
	






























