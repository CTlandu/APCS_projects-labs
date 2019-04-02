import java.util.Scanner;
import java.io.*;
public class SearchTextWord{
	public static void main(String [] args) throws IOException{
		
		//get all input
		String file, targetWord;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the file name: ");
		file = reader.nextLine() + ".txt";
		
		System.out.println("Enter your target word: ");
		targetWord = reader.nextLine().toLowerCase();

		
		//get into the file
		String str = "";
		Scanner getIntoFile = new Scanner(new File(file));
		
		
		//get its content
		while (getIntoFile.hasNext()){
			 String word = getIntoFile.nextLine();
			 str += word;
		}
		
		//analyse the file content
		str = str.toLowerCase();
		int lengthOfString = str.length();
		int firstPos = str.indexOf(targetWord);

		int lengthOfTarget = targetWord.length();
		int count = 0;
		
		while (str.indexOf(targetWord) != -1){
			int i = str.indexOf(targetWord);
			lengthOfString = str.length(); //remember to update the length of string!!
			str = str.substring(i + lengthOfTarget, lengthOfString);
			count ++;
		}

		//get output
		if (firstPos == -1)
			System.out.println("The target word is not found.");
		
		else if (count == 1){
			System.out.println("The target word appears 1 time.");
			System.out.println("The position of it is " + firstPos + ".");
		}
		
		else {
			System.out.println("The target word appears " + count + " times.");
			System.out.println("The first position of it is " + firstPos + ".");
		}

	}

}