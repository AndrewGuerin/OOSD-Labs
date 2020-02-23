package Lab10Databases;

import java.sql.Connection;import java.sql.Statement;
import java.sql.DriverManager;import java.sql.ResultSet;
import java.sql.ResultSetMetaData;import java.sql.SQLException;
import javax.swing.JFrame;import javax.swing.JTable;
import javax.swing.JScrollPane;import java.awt.FlowLayout;
import java.awt.Dimension; import javax.swing.JTextField;


public class AuthorJTable extends JFrame{

   // JDBC driver name and database URL                              
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";        
   static final String DATABASE_URL = "jdbc:mysql://localhost/books";
 
   private FlowLayout layout; // layout object
   private JTextField txtName;
   String[] columnNames = {"Author ID","First Name","LastName"};
   Object[][] data;   
	// constructor
   public AuthorJTable(){
super("Authors Table of Books Database:");
setLayout( new FlowLayout() );
getData();
txtName = new JTextField("Enter Search Criteria Here");
add(txtName);
   }
   public void getData() {
      Connection connection = null; // manages connection
      Statement statement = null; // query statement
      // connect to database books and query database
      try {
         // establish connection to database
         connection = DriverManager.getConnection( DATABASE_URL, "root", "password" );
         // create Statement for querying database
         statement = connection.createStatement();         
         // query database
         ResultSet resultSet = statement.executeQuery("SELECT authorID, firstName, lastName FROM authors");
         // process query results
         ResultSetMetaData metaData = resultSet.getMetaData();
         int numberOfColumns = metaData.getColumnCount(); 
        data = new Object[10][numberOfColumns];
         int j=0,k=0;
         while ( resultSet.next() ) {
    for ( int i = 1;i <=numberOfColumns; i++){
    	data[j][k] = resultSet.getObject( i );
    	k++;
    }
    k=0; j++;
         } // end while

JTable table = new JTable(data, columnNames );
table.setPreferredScrollableViewportSize(new Dimension(500, 70));
JScrollPane scrollPane = new JScrollPane(table);
add(scrollPane); 
      }  // end try
      catch ( SQLException sqlException )  {
         sqlException.printStackTrace();
         System.exit( 1 );
      } // end catch
      finally // ensure statement and connection are closed properly
      {                                                             
         try {                                                          
            statement.close();                                      
            connection.close();                                     
         } // end try                                               
         catch ( Exception exception ) {                                                          
            exception.printStackTrace();                                     
            System.exit( 1 );                                       
         } // end catch                                             
      } // end finally                  
   }//end getData
}// end class