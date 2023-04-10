/**Class: BookTester.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Sep 30, 2021
*
* This class – now describe what the class does
*/

public class BookTester
{
	public static void main(String[] args)
	{
		Book b0 = new Book("The Notebook", "Sparks");
		Book b1 = new Book("The Hobbit", "Tolkien", 850);
		Book b2 = new Book("Harry Potter", "Rowling", 400);
		Book b3 = new Book("Harry tHe Potter", "Rowling", 400);
		Book b4 = new Book("Harry the Potter", "Rowling", 100);
		
		System.out.println(b0);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}
}
