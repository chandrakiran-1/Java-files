class Book
{
	String title;
	String author;
	int price;

	void display()
	{
          System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
	}



Book(String t, String a, int p)
{

	title=t;
	author=a;
	price=p;
}
}	


class Books
{
	public static void main(String[]args)
	{
		Book y=new Book("the nightangle","shakesphere",1000);
		y.display();
		
	System.out.println(y.title);
	System.out.println(y.author);
	System.out.println(y.price);
	}
}