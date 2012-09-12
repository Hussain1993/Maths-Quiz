/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Project;
// import statements
 import java.sql.*;
 import java.io.*;
 import java.util.*;
/**
 *
 * @author Hussain Miah
 */
public class DatabaseConnect {
    /*
     * static varibales used to hold the url, username and password for the
     * database.
     */
    private static String url;
    private static String username;
    private static String password;

    //function to initilize the database.
    public static void init() throws ClassNotFoundException
    {
        //initilize varibales.
        url = "jdbc:derby://localhost:1527/quiz";
        username = "nbuser";
        password = "nbuser";
        //Links to the driver for the Java DB (JDBC)
        Class.forName("org.apache.derby.jdbc.ClientDriver");
    }//END FUNCTION INIT
    //This function links to the database
  public  static Connection getConnection () throws SQLException
  {
      return DriverManager.getConnection(url,username,password);
  }//END FUNCTION CONNECTION
}//END CLASS
