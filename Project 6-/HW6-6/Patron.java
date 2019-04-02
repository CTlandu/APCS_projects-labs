public class Patron{
	private String patron_name;
	private Book book1;
	private Book book2;
	private Book book3;

	public Patron(String nm){
		patron_name = nm;
		book1 = null;
		book2 = null;
		book3 = null;
	}

	public void searchBook(String title){
		if((book1.getTitle()).equals(title)||(book2.getTitle()).equals(title)||(book3.getTitle()).equals(title)){
			System.out.println("Yes, Patron " + patron_name + " has borrowed this book.");
		}
		else
			System.out.println("Sorry, Patron " + patron_name + " hasn't borrowed this book.");
		
	}
	
	public void borrowBook(Book n){
		if(book1 == null){
			book1 = n;
		}
		else if(book2 == null){
			book2 = n;
		}
		else if(book3 == null){
			book3 = n;
		}
		else
			System.out.println("Sorry, one person can only borrow 3 books at the same time.");
	}
	public void returnBook(String title){
		if((book1.getTitle()).equals(title)){ 
			book1 = null; 
		}
		else if((book2.getTitle()).equals(title)){
			book2 = null;
		}
		else if((book3.getTitle()).equals(title)){
			book3 = null;
		}
	}

	public String toString(){
		String str;
		str = "Patron's name:	" + patron_name + "\n"
		+ "books remaining:	 \n" + "book1:	\n" + book1 + "\n"
		+ "book2:	\n" + book2 + "\n" + "book3:	\n" + book3 + "\n";
		return str;
	}
}







