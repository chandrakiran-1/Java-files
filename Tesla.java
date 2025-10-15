interface Car{
	
       void sound();
   }
interface GPS{
	
      void showlocation();
  }
class Tesla implements Car, GPS
{
	public void sound()
	{
		System.out.println(" silent electric sound ");
	}
	public void showlocation()
	{
		System.out.println(" showing current gps location ");
	}
}
class Tesla
{
	public static void main(String[] args)
	{
		Car c = new Tesla();
		c.sound();
		
		GPS g = new Tesla();
		g.showlocation();
		
		Tesla t = new Tesla();
		t.sound();
		t.showlocation();
        }
}
	