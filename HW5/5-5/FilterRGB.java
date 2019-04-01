import java.util.Scanner;
import images.APImage;
import images.Pixel;

public class FilterRGB{
	public static void main(String [] args){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the file name: ");
		String filename = reader.nextLine();
		System.out.println("Enter the filtered RED value " +
			"(integers): ");
		int filRed = reader.nextInt();
		System.out.println("Enter the filtered GREEN value " +
			"(integers): ");
		int filGreen = reader.nextInt();
		System.out.println("Enter the filtered BLUE value " +
			"(integers): ");
		int filBlue = reader.nextInt();

		APImage picture = new APImage(filename);
		picture.draw();  //display the original image first.
		
		int width = picture.getWidth();
		int height = picture.getHeight();
		
		for(int i = 0; i < width; i++){
			for(int k = 0; k < height; k++){
				Pixel point = picture.getPixel(i,k);
				int red = Math.max(Math.min((point.getRed() + filRed), 255),0);
				int blue = Math.max(Math.min((point.getBlue() + filBlue), 255),0);
				int green = Math.max(Math.min((point.getGreen() + filGreen), 255),0);
				point.setRed(red);
				point.setGreen(blue);
				point.setBlue(green);
			}
		}
		picture.draw();
	}
}