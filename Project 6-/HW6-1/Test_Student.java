public class Test_Student{
	public static void main(String [] args){
		Student s1,s2,s3,s4;

		s1 = new Student("Bill",85,86,88); //test for constructor 1
		
		System.out.println("\nHere is a student s1\n" + s1);

		s2 = s1;
		s2.setName("Ann");
		System.out.println("\nName of s1 is now: " + s1.getName());
		System.out.println("average: "+ s1.getAverage());
		System.out.println("high score: " +s1.getHigh() + "\n" );
		
		s3 = new Student(); //now test for constructor 2
		System.out.println("s3 is now: \n" + s3+ "\n" + " (Because it was just initialized, now we are going to give it specific values.)");
		s3.setName("Devin");
		s3.setScore(1, 95);
		s3.setScore(2, 90);
		s3.setScore(3, 100);
		System.out.println("so now s3 is :\n"+ s3);
		
		s4 = new Student(s3); //now test for constructor 3!
		System.out.println("let's change student 4's name");
		s4.setName("Blitzen");
		System.out.println("now s4 is " + s4);
		
		
		
		System.out.println("finally: s1: " + s1 + " \n s2: " + s2 + "\n s3: " + s3 + "\n s4: " + s4);
		//now our test ends

	}

}