package Lab10Databases;

import javax.swing.JFrame;

public class AuthorJtableDemo extends JFrame {

// launch the application
   public static void main( String args[] )
   {
   
AuthorJTable authorsJTable = new AuthorJTable(); // create ButtonFrame
authorsJTable.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
authorsJTable.setSize( 600, 200 ); // set frame size
authorsJTable.setVisible( true ); // display frame
   } // end main
   
}  // end class DisplayAuthors