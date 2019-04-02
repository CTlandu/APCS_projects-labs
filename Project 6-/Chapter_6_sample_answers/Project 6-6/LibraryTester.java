// Project 6-6: Tester program for Book and Patron classes
public class LibraryTester{
	public static void main(String [] args){
		Patron p1, p2;
		p1 = new Patron("Mike");
		p2 = new Patron("Brittany");
		System.out.print(p1);
		
		if (!p1.isBorrowed("Hamlet"))		// 1st test for 0 books added
			System.out.println("\n\"Hamlet\" hasn't been issued to " + p1.getPatron());
		
		if (p1.borrowBook("Hamlet", "William Shakespeare"));
			System.out.println("\"Hamlet\" has now been issued to " + p1.getPatron());
		if (p1.borrowBook("Middlemarch", "George Eliot"));
			System.out.println("\"Middlemarch\" has now been issued to " + p1.getPatron());		
		
		// another way to do this is to use isBorrowed to test 
		p1.borrowBook("The BFG", "Roald Dahl");
		if (p1.isBorrowed("The BFG"))
			System.out.println("\"The BFG\" has now been issued to " + p1.getPatron());
		
		System.out.print(p1);
		
		// Now that 3 books have been added, we should try adding another book
		if(!p1.borrowBook("The Cat in the Hat", "Dr Seuss"))
			System.out.println("\nSorry, " + p1.getPatron() + " already has 3 books issued");
		System.out.println(p1);
		
		// Then try returning a few books then displaying the results
		p2.borrowBook("The Cat in the Hat", "Dr Seuss");
		p2.borrowBook("Crime and Punishment", "Dostoyevsky");
		p2.borrowBook("Oliver Twist", "Charles Dickens");
		if(p1.returnBook("Middlemarch"))
			System.out.println(p1);
		p2.returnBook("The Cat in the Hat");
		if(p2.returnBook("Oliver Twist"))
			System.out.println(p2);
	}
}