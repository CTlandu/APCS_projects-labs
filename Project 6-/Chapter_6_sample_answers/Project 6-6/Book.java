// Project 6-6: a Book class for a library

public class Book{
	private String title;
	private String author;
	
	public Book(String bookTitle, String bookAuthor){
		title = bookTitle;
		author = bookAuthor;
	}
	
	// accessor methods
	public String getTitle(){
		return title;
	}
	
	// actually we don't really need to use this
	public String getAuthor(){
		return author;
	}
	
	public String toString(){
		return 	"Title:\t" + title +
			    "\n\tAuthor:\t" + this.getAuthor();
	}
}