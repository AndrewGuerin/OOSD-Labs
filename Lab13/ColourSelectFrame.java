package Lab13;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColourSelectFrame extends JFrame {
	
	//declare components
	private JButton ok;
	private JButton cancel;
	private JCheckBox background;
	private JCheckBox foreground;
	private JComboBox colour;
	private JPanel checkpanel;
	private JPanel buttonpanel;
	
	//constructor
	public ColourSelectFrame(){
		super("Colour Select");
		setLayout(new BorderLayout());
		
		//combo box
		colour = new JComboBox();
		colour.addItem("RED");
		add(colour, BorderLayout.NORTH);
		
		//checkboxes
		checkpanel = new JPanel();
		background = new JCheckBox("background");
		foreground = new JCheckBox("foreground");
		checkpanel.add(background);
		checkpanel.add(foreground);
		add(checkpanel, BorderLayout.CENTER);
		
		//buttons
		ok = new JButton("Ok");
		cancel = new JButton("Cancel");
		buttonpanel = new JPanel();
		buttonpanel.add(ok);
		buttonpanel.add(cancel);
		add(buttonpanel, BorderLayout.SOUTH);
		
	}//end constructor
	

}//end class