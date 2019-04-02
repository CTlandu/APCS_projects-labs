public class Test_Patron{
	public static void main(String [] args){
		Patron colin;
		Book aesop_fable, intro_to_java, barrons, princeton;

		//Test class Patron's constructor
		colin = new Patron("Colin"); 
		//Test class Book's constructor
		aesop_fable = new Book("Aesop's Fable", "Aesop"); 
		intro_to_java = new Book("Introduction to Java", "Kenneth");
		barrons = new Book("Barron's", "unknown");
		princeton = new Book("Princeton", "unknown");

		
		System.out.println("Colin is going to borrow Aesop's, Barron's and Princeton.");
		//Test borrowBook(Book i)
		colin.borrowBook(aesop_fable);
		colin.borrowBook(barrons);
		colin.borrowBook(princeton);

		//Test toString()
		System.out.println("Now:	\n" + colin);
		
		//Further test for borrowBook(Book i) 
		System.out.println("Colin wants to borrow another book which is Introduction to Java.");
		colin.borrowBook(intro_to_java);
		System.out.println("*****   Obviously, he fails!   ****");

		
		//Test seachBook(title)
		System.out.println("Seach for Barron's: ");
		colin.searchBook("Barron's");
		//Further test searchBook()
		System.out.println("Seach for Introduction to Java: ");
		colin.searchBook("Introduction to Java");

		//Test returnBook(title)
		System.out.println("Now Colin is going to return Princeton.");
		colin.returnBook("Princeton");


		System.out.println("Finally: " + "\n" + colin);



	}
}