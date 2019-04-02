// Project 6-8: Displays a rectangle and a filled rectangle

import javax.swing.*;
import java.awt.*;

public class ColorPanel extends JPanel{
	private Rectangle r1, r2;
	
	 public ColorPanel(Color backColor){
		 setBackground(backColor);
		 r1 = new Rectangle(200, 60, 40, 20, Color.red);
		 r2 = new Rectangle(100, 50, 50, 25, Color.blue);
	 }
	 
	 public void paintComponent(Graphics g){
		 super.paintComponent(g);
		 r1.fill(g);
		 r2.draw(g);
	 }
}

