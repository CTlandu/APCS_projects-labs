import java.util.Scanner;
import images.APImage;
import images.Pixel;
public class Sepia{
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
					int green = (int)Math.round((point.getGreen()) * 0.587);
					int red = (int)Math.round((point.getRed()) * 0.299);
					int blue = (int)Math.round((point.getBlue()) * 0.114);
					
					int gray = green + red + blue;
					red = green = blue = gray;
					
					if (red < 63){
						red = (int)(red * 1.1);
						blue = (int)(blue * 0.9);
					}
					else if (red < 192){
						red = (int)(red * 1.15);
						blue = (int)(blue * 0.85);
					}
					else{
						int reddish = (int)(red * 1.08);
						red = Math.min(reddish,255);
						blue = (int)(blue * 0.93);
					}
					point.setRed(red);
					point.setGreen(green);
					point.setBlue(blue);
				}
			}
		picture.draw();	
		}
	}
}