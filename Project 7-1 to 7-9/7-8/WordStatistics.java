import java.util.Scanner;

public class WordStatistics{
	public static void main(String [] args){
		Scanner reader = new Scanner(System.in);
		String input;
		String input_with_nospaces;
		int words_num;
		double aver_length;
		int sentenceLength;

		System.out.println("Please enter the sentence: ");
		input = reader.nextLine();
		input_with_nospaces = input.trim();

		sentenceLength = input.length(); //count for sentence length.
		
		
		int i = 0; //count for the number of words.
		int count1 = 0;
		int lengthChange = sentenceLength;
		String str = input_with_nospaces;
		
		for (i = 0; i != -1; count1 ++){
			i = str.indexOf(' ');
			if (i == -1)
				break;
			else
				str = str.substring(i + 1, lengthChange);
				lengthChange = str.length();
		}
		words_num = count1 + 1;

		

		int count2 = 0;
		for (int a = 0; a <= (sentenceLength - 1); a ++){ //count for average word length
			if (input_with_nospaces.charAt(a) == ' '
				|| input_with_nospaces.charAt(a) == '!'
				|| input_with_nospaces.charAt(a) == ','
				|| input_with_nospaces.charAt(a) == '.'
				|| input_with_nospaces.charAt(a) == '?'
				|| input_with_nospaces.charAt(a) == ':'
				|| input_with_nospaces.charAt(a) == ';')
				count2 ++;
		}
		double nonChar = count2;
		double totalCharNum = sentenceLength - nonChar;
		aver_length = totalCharNum / words_num;
			


		System.out.println("The number of words is: " + words_num);
		System.out.println("The average word length is: " + aver_length);
		System.out.println("The length of the sentence is: " + sentenceLength);
	}
}