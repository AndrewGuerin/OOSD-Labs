package Lab12;

import javax.swing.JFrame;

public class AlignFrameDemo {
	
	public static void main(String args []) {
		
		AlignFrame alignframe = new AlignFrame();
		alignframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		alignframe.setSize(300, 140);
		alignframe.setVisible(true);
		alignframe.setLocation(200, 200);
	}

}