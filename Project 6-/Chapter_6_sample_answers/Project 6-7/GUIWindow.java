// Project 6-7: Displays several images from a file (NOT QUITE FINISHED!)
// The specifications for this program have been modified slightly
// For the final program the user would enter each of the filenames  
// one by one using an Input Dialog box (1, 2 or 4 of them)
// However it's far quicker to test the rest of the code this way

import javax.swing.*;
import java.awt.*;

public class GUIWindow {
		public static void main(String[] args) {
			
			// First the user inputs the correct number of images to display
			boolean inputValid = false;
			int numberOfImages = 0;
			String inputStr;
			while(!inputValid) {
				
				inputStr = JOptionPane.showInputDialog("Enter the number of images (1, 2 or 4)", "1");
				if (inputStr == null)
					return;	// Note: this code doesn't adequately work for faulty input
				numberOfImages = Integer.parseInt(inputStr);
				if (numberOfImages == 1)
					inputValid = true;
				else if (numberOfImages == 2)
					inputValid = true;
				else if (numberOfImages == 4)
					inputValid = true;
				else
					JOptionPane.showMessageDialog(null, "INVALID INPUT! You can only enter 1, 2 or 4. Try again... ");
			}
			
			JFrame theGUI = new JFrame();
			theGUI.setTitle("Display images in Panels");
			
			if (numberOfImages == 1) {
				theGUI.setSize(300, 300);
				theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
				ImageIcon image = new ImageIcon("smokey.jpg");
				ColorPanel panel = new ColorPanel(Color.black, image);
				Container pane = theGUI.getContentPane();
				pane.add(panel);
			}
			else if (numberOfImages == 2) {
				theGUI.setSize(300 * 2, 300);					
				theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ImageIcon image1 = new ImageIcon("smokey.jpg");
				ImageIcon image2 = new ImageIcon("smokey2.jpg");
				Container pane = theGUI.getContentPane();
				pane.setLayout(new GridLayout(1,2));
				ColorPanel panel_1 = new ColorPanel(Color.black, image1);
				pane.add(panel_1);
				ColorPanel panel_2 = new ColorPanel(Color.black, image2);
				pane.add(panel_2);
			}
			else {
				theGUI.setSize(300 * 2, 300 * 2);
				theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
				ImageIcon image1 = new ImageIcon("smokey.jpg");
				ImageIcon image2 = new ImageIcon("smokey2.jpg");
				ImageIcon image3 = new ImageIcon("smokey3.jpg");
				ImageIcon image4 = new ImageIcon("smokey4.jpg");
				Container pane = theGUI.getContentPane();
				pane.setLayout(new GridLayout(2,2));
				ColorPanel panel_1 = new ColorPanel(Color.black, image1);
				pane.add(panel_1);
				ColorPanel panel_2 = new ColorPanel(Color.black, image2);
				pane.add(panel_2);
				ColorPanel panel_3 = new ColorPanel(Color.black, image3);
				pane.add(panel_3);
				ColorPanel panel_4 = new ColorPanel(Color.black, image4);
				pane.add(panel_4);

			}
			theGUI.setVisible(true);
		}
}