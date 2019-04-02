public class Book{
	private String author;
	private String title;

	public Book(String t, String a){
		author = a;
		title = t;
	}

	public String getAuthor(){
		return author;
	}

	public String getTitle(){
		return title;
	}

	public String toString(){
		String str;
		str = "The book's title is:	" + title + "\n"
		+ "The book's author is:	" + author;
		return str; 
	}
}