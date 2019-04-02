// Project 6-1: Test Program for the Student class
public class TestStudent{
	public static void main(String[] args){
		Student s1, s2 ,s3;
		
		s1 = new Student();
		// initially s1 has name "" and scores 0, 0 , 0
		System.out.println("\nHere is student s1\n" + s1);
		
		s1.setName("Bill");
		s1.setScore(1, 84);
		s1.setScore(2, 86);
		s1.setScore(3, 88);
		System.out.println("\nHere is student s1\n" + s1);
		
		s2 = s1;				// s1 and s2 reference the SAME object (nothing is copied!)
		s2.setName("Mike");
		System.out.println("\nName of s1 is now: " + s1.getName());
		
		s2 = new Student("Lucy", 70, 80, 90);		
		s3 = new Student(s2);
		s2.setName("Ann");
		s2.setScore(1, 75);
		System.out.println("\nName of s2 is now: " + s2.getName() + "\tTest 1 is now: " + s2.getScore(1));
		
		System.out.println("\nHere is student s2\n" + s2);
		System.out.println("\nHere is student s3\n" + s3);
			
	}
}