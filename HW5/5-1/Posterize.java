import images.Pixel;
import java.util.Scanner;
import images.APImage;
public class Posterize{
	public static void main(String [] args){
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter the file name: ");
		String file = reader.nextLine();
		APImage picture = new APImage(file);

		int red, green, blue = 0;
		red = (int)(Math.random() * 255);
		green = (int)(Math.random() * 255);
		blue = (int)(Math.random() * 255);
		Pixel one = new Pixel(red, green, blue);
		red = (int)(Math.random() * 255);
		green = (int)(Math.random() * 255);
		blue = (int)(Math.random() * 255);
		Pixel two = new Pixel(red, green, blue);

		int width, height = 0;
		width = picture.getWidth();
		height = picture.getHeight();

		for(int i = 0; i < width; i ++){
			for(int k = 0; k < height; k ++){
				Pixel point = picture.getPixel(i,k);
				int ave = (point.getRed() + point.getGreen() + point.getBlue())/3;
				if(ave > 128)
					picture.setPixel(i,k,one);
				else
					picture.setPixel(i,k,two);
			}
		}
		picture.draw();
	}
}