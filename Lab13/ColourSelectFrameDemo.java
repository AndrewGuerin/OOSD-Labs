package Lab13;

import javax.swing.JFrame;

public class ColourSelectFrameDemo {
	
	public static void main(String args []){
		ColourSelectFrame colourselectframe = new ColourSelectFrame();
		colourselectframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		colourselectframe.setSize(300, 125);
		colourselectframe.setVisible(true);
	}

}