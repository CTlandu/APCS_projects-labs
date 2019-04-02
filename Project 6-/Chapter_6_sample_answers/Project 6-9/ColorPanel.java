// A color panel whose background is a color provided by the client
// Each panel initially draws a white Rectange, but then responds to a mouseclick
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorPanel extends JPanel{
	private Rectangle r1, r2, selectedRectangle;
	private int x, y;	// used to track mouse events
	boolean mousePressedOnce;
	
	// Client provides color only for the Constructor
	public ColorPanel(Color backColor){ 
		setBackground(backColor);		
		r1 = new Rectangle(0, 0, 75, 75, Color.black);
		Random generator = new Random();
		int red = generator.nextInt(256);
		int green = generator.nextInt(256);
		int blue = generator.nextInt(256); 	
		Color fillColor = new Color(red, green, blue); 	// set r1 to a random color here 
		r2 = new Rectangle(1, 1, 73, 73, fillColor); 
		selectedRectangle = null;
		addMouseListener(new PanelListener());
		// addMouseMotionListener(new PanelMotionListener());
	}
	
	public void paintComponent(Graphics g){
		 super.paintComponent(g);
		 r1.draw(g);
		 if (mousePressedOnce)
			r2.fill(g);
	 }
	
	// Just as with Example 6.5 on pp.222-223, we need to use 2 private classes
	// Client Provides color and preferred width and height

	private class PanelListener extends MouseAdapter{
		
		public void mousePressed(MouseEvent e){
			x = e.getX();
			y = e.getY();
			if(r1.containsPoint(x,y)) {
				mousePressedOnce = true;
				repaint();
			}
		}
	}	

}
