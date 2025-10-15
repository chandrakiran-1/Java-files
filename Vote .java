class Vote 
{
	public void CheckAge(int age)
	{
		if (age<18)		
		    throw new ArithmeticException(" Not eligible to vote ");
		else      
			System.out.println("Eligible to vote ");
	}
public static void main(String[]args)
{
	Vote v = new Vote();
	try{
		v.CheckAge(16);
	}catch( ArithmeticException a )
	{
		System.out.println(a.getMessage());
	}
	finally{
			System.out.println(" Program is ended ");
	}
}