import java.util.Scanner;
import images.APImage;
import images.Pixel;
public class InvertGray{
	public static void main(String [] args){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the file name: ");
		String filename = reader.nextLine();
		APImage picture = new APImage(filename);

		int width = picture.getWidth();
		int height = picture.getHeight();

		picture.draw();
		System.out.println("Enter 'return' to continue.");
		String words = reader.nextLine();
		if (words.trim().equals("return")){
			for(int i = 0; i < width; i++){
				for(int k = 0; k < height; k++){
					Pixel point = picture.getPixel(i,k);
					int green = 255 - (int)Math.round((point.getGreen()) * 0.587);
					int red = 255 - (int)Math.round((point.getRed()) * 0.299);
					int blue = 255 - (int)Math.round((point.getBlue()) * 0.114);
					int gray = green+blue+red;
					point.setRed(gray);
					point.setGreen(gray);
					point.setBlue(gray);
				}
			}
		picture.draw();	
		}
	}
}