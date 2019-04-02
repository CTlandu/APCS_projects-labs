// Project 6-9: Displays an 8x8 checkerboard with all white squares
import javax.swing.*;
import java.awt.*;

public class GUIWindow{
	public static void main(String[] args) {
		JFrame theGUI = new JFrame();
		theGUI.setTitle("8x8 grid of Panels Example");
		final int ROWS = 8;
		final int COLS = 8;
		theGUI.setSize(COLS * 75, ROWS * 75);
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container pane = theGUI.getContentPane();
		pane.setLayout(new GridLayout(ROWS, COLS));
		for (int i = 1; i <= ROWS; i++)
			for(int j = 1; j <= COLS; j++) {
				//Color backColor = new Color(255, 255, 255); 	// another way to set to white
				ColorPanel panel = new ColorPanel(Color.white);
				pane.add(panel);
			}	
		theGUI.setResizable(false); // We don't want to resize the window
		theGUI.setVisible(true);
	}
}
