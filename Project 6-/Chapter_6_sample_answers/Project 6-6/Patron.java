// Project 6-6, a Patron class for a library (of books)
public class Patron{
	private String pName;
	private Book b1, b2, b3;
	
	public Patron(String patronName) {
		pName = patronName;
		// all 3 books are initially set to null
		b1 = null;
		b2 = null;
		b3 = null;
	}
	
	// Accessor method for Patron class
	// Not asked for, but it's good to have one anyway
	public String getPatron(){
		return pName;
	}
	
	
	public boolean isBorrowed(String title){
		if (b1 != null) {
			if (b1.getTitle().equals(title)) return true;
		}
		if (b2 != null) {
			if (b2.getTitle().equals(title)) return true;
		}
		if(b3 != null) {
			if (b3.getTitle().equals(title)) return true;
		}
		return false; // book title not borrowed (by this patron)
	}
	
	
	public boolean borrowBook(String title, String author){
		if(isBorrowed(title))
			return false;		//ensures the same book isn't borrowed 2x
		// We can only add a book if b1, b2 or b3 are null 
		if (b1 == null) {		
			b1 = new Book(title, author);
			return true;
		}
		if (b2 == null){
			b2 = new Book(title, author);
			return true;
		}
		if (b3 == null) {
			b3 = new Book(title, author);
			return true;
		}
		return false; // otherwise book can't be added
	}
	
	
	public boolean returnBook(String title){
		if(!isBorrowed(title))
			return false;		// we can't remove a book unless it's borrrowed
		if (b1 != null && b1.getTitle().equals(title))
			b1 = null;
		else if (b2 != null && b2.getTitle().equals(title))
			b2 = null;
		else
			b3 = null; 		// by default b3.getTitle().equals(title) and != null
		return true;
	}
	
	
	// We implicitly use Book's toString() method
	public String toString(){
		String str = "\nPatron Name: 	" + pName;
		if (b1 != null)
			str += "\nBook #1 " + b1;
		else
			str += "\nBook #1:\tNot currently issued";
		if (b2 != null)
			str += "\nBook #2 " + b2;
		else
			str += "\nBook #2:\tNot currently issued";
		if (b3 != null)
			str += "\nBook #3 " + b3;
		else
			str += "\nBook #3:\tNot currently issued";
		return str + "\n";
	}
}