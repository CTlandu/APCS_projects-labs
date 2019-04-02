/* 	Project 6-2: a validateData method has been added to Student.java
	Manage a student's name and three text scores
*/
public class Student{
	// Each student has a name and three test scores
	private String name;
	private int test1;
	private int test2;
	private int test3;
		
	// Constructor methods
	
	// Default Constructor
	public Student(){
		// Initialize a new student's name to the empty string
		// and the test scores to zero
	/*	name = "";
		test1 = 0;
		test2 = 0;
		test3 = 0;
	*/
		this("", 0, 0, 0);	// the code above has been replaced (and commented out)
	}
	
	// Additional Constructor -- initialize the name and test scores
	// to the values provided (by the Client)
	public Student(String nm, int t1, int t2, int t3) {
		name = nm;
		test1 = t1;
		test2 = t2;
		test3 = t3;
	}

	// Additional Constructor -- initialize the name and test scores
	// to match those in the parameter s (s is another Student object)
	public Student(Student s){
	/*	name = s.name;
		test1 = s.test1;
		test2 = s.test2;
		test3 = s.test3;
	*/
		this(s.name, s.test1, s.test2, s.test3); // code above replaced and commented out
	}
	
	// Other methods
	public void setName(String nm){
		// Set a student's new
		name = nm;
	}
		
	public String getName(){
		// Get a student's name
		return name;
	}
		
	public void setScore(int i, int score){
		// Set test i to score
		if (i == 1) 
			test1 = score;
		else if (i == 2)
			test2 = score;
		else
			test3 = score;
	}
		
	public int getScore(int i){
		// Retrieve score i
		if (i == 1)
			return test1;
		else if (i == 2)
			return test2;
		else	
			return test3;
	}
		
	public int getAverage(){
		// Compute and return the average
		int average;
		average = (int) Math.round((test1 + test2 + test3) / 3.0);
		return average;
	}
		
	public int getHighScore() {
		// Determine and return the highest score
		int highScore;
		highScore = test1;
		if (test2 > highScore)
			highScore = test2;
		if (test3 > highScore)
			highScore = test3;
		return highScore;
	}
		
	public String toString() {
		// Construct and return a string representation of a student
		String str;
		str = "Name:    " + name + "\n" +	// "\n" denotes a newline
			  "Test 1:  " + test1 + "\n" +
			  "Test 2:  " + test2 + "\n" +
			  "Test 3:  " + test3 + "\n" +
			  "Average: " + getAverage();
		return str;	  
	}
	
	public String validateData(){
		if(name.equals(""))
			return "SORRY: name required";
		else if (test1 < 0 || test1 > 100)
			return "SORRY: Test 1 must have 0 <= test score <= 100";
		else if (test2 < 0 || test2 > 100)
			return "SORRY: Test 2 must have 0 <= test score <= 100";
		else if (test3 < 0 || test3 > 100)
			return "SORRY: Test 3 must have 0 <= test score <= 100";
		else
			return null;
	}
}