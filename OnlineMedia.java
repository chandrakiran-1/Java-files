class SocialMedia
{
	void NewNotification()
	{
		System.out.println("  You have a new notification ");
	}
}
class WhatsApp extends SocialMedia
{
	@Override	
   		void NewNotification()
		{
			System.out.println("WhatsApp : you have a message from Kiran ");
		}
}
class Instagram extends SocialMedia
{
	@Override
		void NewNotification()
		{
			System.out.println("Instagram : you have a message from Ram ");
		}
}
class X extends SocialMedia
{
	@Override
		void NewNotification()
		{
			System.out.println("X : you have a trending topic ");
		}
}
class OnlineMedia
{
	public static void main (String []args)
	{
		SocialMedia s= new WhatsApp();
		SocialMedia a = new Instagram();
		SocialMedia q= new X();
	s.NewNotification();
	a.NewNotification();
	q.NewNotification();
	}
}