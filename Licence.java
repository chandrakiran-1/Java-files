class Licence
{
	public void CheckAge(int age)
	{
		if(age < 20)
			throw new ArithmeticException("Not eligible to the Driving licence ");
		else
			System.out.println("Approved");
	}
public static void main(String []args)
{
	Licence l = new Licence();
	try{
		l.CheckAge(20);
	 }catch(ArithmeticException x ){
		System.out.println(x.getMessage());
	}
	finally{
		System.out.println("Program is ended ");
	}
}
}
	 