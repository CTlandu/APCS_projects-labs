// Displays an image centered in the panel
import javax.swing.*;
import java.awt.*;

public class ColorPanel extends JPanel{
	
	private ImageIcon image;
	
	// Client provides color
	// Preferred width and height are 0, 0 by default
	public ColorPanel(Color backColor, ImageIcon i){ 
		setBackground(backColor);		// Constructor
		image = i;
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int x = (getWidth() - image.getIconWidth()) / 2;
		int y = (getHeight() - image.getIconHeight()) / 2;
		image.paintIcon(this, g, x, y);
	}

}
