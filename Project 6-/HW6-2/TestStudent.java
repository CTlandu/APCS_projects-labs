public class TestStudent{
	public static void main(String [] args){
		Student s1,s2,s3;

		s1 = new Student();

		s2 = new Student("Colin",-1,120,10000);

		s3 = new Student("Jack",90,100,95);
		
		System.out.println("Now validate s1: "); // we expect the error of name
		String result = s1.validateData();
		if (result == null){
			System.out.println("This student data can be used.");
		}
		else
			System.out.println(result);
		
		
		System.out.println("Now validate s2: "); // we expect the error of score
		result = s2.validateData(); //notice that here no need to restate the data type of "result" or will get error.
		if (result == null){
			System.out.println("This student data can be used.");
		}
		else
			System.out.println(result);

		System.out.println("Now validate s3: "); // we expect no errors!
		result = s3.validateData();
		if (result == null){
			System.out.println("This student data can be used.");
		}
		else
			System.out.println(result);
	}
}