/**Class: Book.java
* @author Anh Thu Nguyen
* @version 1.0
* Course : ITEC 2140-05 Fall 2021
* Written: Sep 30, 2021
*
* This class – now describe what the class does
*/

public class Book
{
	private String title;
	private String author;
	private int numOfPages;
	//private static final int ourConstant = 2; this was just to show a concept, not part of book
	
	public Book(String newTitle, String newAuthor)
	{
		title = newTitle;
		author = newAuthor;
		numOfPages = 200;
	}
	
	public Book(String newTitle, String newAuthor, int newNumOfPages)
	{
		title = newTitle;
		author = newAuthor;
		numOfPages = newNumOfPages;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public int getnumOfPages()
	{
		return numOfPages;
	}
	
	public void setAuthor(String changedAuthor)
	{
		author = changedAuthor;
	}
	
	public void setTitle(String changedTitle)
	{
		title = changedTitle;
	}
	
	public void setNumOfPages(int changedNumOfPages)
	{
		numOfPages = changedNumOfPages;
	}
	
	public boolean isGoodBook()
	{
		if (numOfPages > 300 && title.toLowerCase().contains("the"))
			return true;
		return false;
	}
	
	public boolean isGreatBook()
	{
		return (numOfPages < 250 && title.toUpperCase().startsWith("THE"));
	}
	
	public String formatAuthor()
	{
		return author.substring(0,2).toUpperCase() + author.substring(2);
	}
	
	public String toString()
	{
		return "\nTitle: " + title + " Author: " + author + " # Pages: "+ numOfPages + 
				"\nGood Book: " + isGoodBook() + " Great Book: " + isGreatBook() +
				" Formatted Author: " + formatAuthor();
	}
}
