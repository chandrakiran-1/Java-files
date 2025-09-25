class SocialMedia
{
	String notification()
	{
		return " NewNotification ";
	}
}
class WhatsApp extends SocialMedia
{
	@Override
		String notification()
		{
			return " hello from jack, Whatsapp ";
		}
}
class Instagram extends SocialMedia
{
	@Override
		String notification()
		{
			return " heyy ! from daniles , Instagram ";
		}
}
class OnlineMedia
{
	public static void main(String []args)
	{
		SocialMedia s = new WhatsApp();
		SocialMedia q= new Instagram();
	System.out.println(" one message from WhatsApp : " + s.notification());
	System.out.println(" one message form Instagram : " + q.notification());
	}
}