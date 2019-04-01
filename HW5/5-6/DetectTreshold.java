import java.util.Scanner;
import images.APImage;
import images.Pixel;
public class DetectTreshold{
	public static void main(String [] args){
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the file name: ");
		String fileName = reader.nextLine();
		System.out.print("Enter the threshold value(int)(positive): ");
		int threshold = reader.nextInt();
		System.out.print("Enter the degree of sharpened part(int): ");
		int sharpness = reader.nextInt();

		APImage theOriginal = new APImage(fileName);
		theOriginal.draw();

		int width = theOriginal.getWidth();
		int height = theOriginal.getHeight();

		APImage theNew = new APImage(width,height);

		//visit all pixels except for the left column and bottom row
		for (int y = 0; y < height - 1; y++){
			for (int x = 1; x < width; x++){
				Pixel oldPixel = theOriginal.getPixel(x, y);
				Pixel leftPixel = theOriginal.getPixel(x - 1, y);
				Pixel bottomPixel = theOriginal.getPixel(x, y + 1);

				int oldAve = ((oldPixel.getRed() + oldPixel.getGreen()
					+ oldPixel.getBlue())) / 3;
				int leftAve = ((leftPixel.getRed() + leftPixel.getGreen()
					+ leftPixel.getBlue())) / 3;
				int bottomAve = ((bottomPixel.getRed() + bottomPixel.getGreen()
					+ bottomPixel.getBlue())) / 3;

				Pixel newPixel = theNew.getPixel(x,y); //create a new Pixel
				
				if (Math.abs(oldAve - leftAve) <= threshold||  //note the Math.abs()
					Math.abs(oldAve - bottomAve) <= threshold)
				{
					int red = Math.max(Math.min((oldPixel.getRed() + sharpness),255),0); //cannot be out-of-bound
					newPixel.setRed(red);
					int green = Math.max(Math.min((oldPixel.getGreen() + sharpness),255),0);
					newPixel.setGreen(green);
					int blue = Math.max(Math.min((oldPixel.getBlue() + sharpness),255),0);
					newPixel.setBlue(blue);
				}
				else{
					newPixel = oldPixel;
				}
			}
		}
		theNew.draw();
	}
}