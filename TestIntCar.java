interface Engine
{
	void startEngine();
}
interface MusicSystem
{
	void startMusic();
}
class TestIntCar implements Engine, MusicSystem
{
	 void StartEngine()
	{
		System.out.println(" Engine started ");
	}
	 
	 void StartMusic()
	{
		System.out.println(" playing music ");
	}
}
public class Main
{
	public static void main(String[]args)
	{
		TestIntCar car = new TestIntCar();
		car.StartEngine();
		car.StartMusic();
	}
}