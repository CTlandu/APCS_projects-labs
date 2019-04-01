import java.util.Scanner;
import images.APImage;
import images.Pixel;
public class Pixilation{
	public static void main(String [] args){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the file name: ");
		String fileName = reader.nextLine();
		APImage origImage = new APImage(fileName);
		origImage.draw();

		int width = origImage.getWidth();
		int height = origImage.getHeight();

		APImage newImage = new APImage(fileName);
		newImage.draw();


		for(int i = 1; i <= (width - 2); i++){
			for(int k = 1; k <= height - 2; k++){
				Pixel theLeft = origImage.getPixel(i - 1, k);
				Pixel theRight = origImage.getPixel(i + 1, k);
				Pixel theAbove = origImage.getPixel(i, k - 1);
				Pixel theBelow = origImage.getPixel(i, k + 1);
				Pixel theCurrent = newImage.getPixel(i,k);

				int red = (theLeft.getRed()+theBelow.getRed()+theAbove.getRed()+theRight.getRed()) / 4;
				int green = (theLeft.getGreen()+theBelow.getGreen()+theAbove.getGreen()+theRight.getGreen()) / 4;
				int blue = (theLeft.getBlue()+theBelow.getBlue()+theAbove.getBlue()+theRight.getBlue()) / 4;

				theCurrent.setRed(red);
				theCurrent.setBlue(blue);
				theCurrent.setGreen(green);
			}
		}
		System.out.println("Press return to show the new Picture: ");
		String next = reader.nextLine();
		newImage.draw();

	}
}