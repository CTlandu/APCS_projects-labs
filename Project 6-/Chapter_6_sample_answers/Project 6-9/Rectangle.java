// Rectangle.java: Represents a rectangle
import java.awt.*;

public class Rectangle{
	private int topLeftX, topLeftY, width, height;
	private Color color;
	
	public Rectangle(int tlx, int tly, int w, int h, Color c){
		topLeftX = tlx;
		topLeftY = tly;
		width = w;
		height = h;
		color = c;
	}
	
	public void draw(Graphics g){
		Color oldColor = g.getColor();
		g.setColor(color);
		// Translate's circles center to rectangle's origin for drawing
		g.drawRect(topLeftX, topLeftY, width, height);
		g.setColor(oldColor);
	}
	
	public void fill(Graphics g){
		Color oldColor = g.getColor();
		g.setColor(color);
		// Translate's circles center to rectangle's origin for drawing
		g.fillRect(topLeftX, topLeftY, width, height);
		g.setColor(oldColor);
	}
	
	public boolean containsPoint(int x, int y){
		if (x < topLeftX || x > topLeftX + width)
			return false;
		else if (y < topLeftY || y > topLeftY + height)
			return false;
		else	
			return true;
	}
	
	
	public void move(int xAmount, int yAmount){
		topLeftX += xAmount;
		topLeftY += yAmount;
	}
}