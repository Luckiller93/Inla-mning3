/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inupg;

/**
 *
 * @author Jonas Lennesten
 * @author Christian Hansson
 */
import java.util.*;
import static javax.swing.JOptionPane.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class KollaDatabas {
	public static void driveTest() {

		try {
			Class.forName("org.sqlite.JDBC");
		}
		catch(ClassNotFoundException cnfe) {
			showMessageDialog(null,"Could't find driver class");
			System.exit(0);
		}
		
	} 

	public static Connection getConnection(String sokvag)  {
		Connection c = null;
		try {
			c = DriverManager.getConnection("jdbc:sqlite:"+sokvag);
                       
		}

		catch (SQLException se) {
			showMessageDialog(null, "Couldn't connect to database.");
			System.exit(0);
		}


		return c;
	}


	public static Statement createStatement(Connection c) {

		Statement s = null;

		try {
			s = c.createStatement();
			
		}

		catch(SQLException se) {
		showMessageDialog(null, "We got an exception while creating a statement. That probably means we're no longer connected");
		}

		return s;
	}	
/*    public static void hittaDB() { 
        try { 
            
            Class.forName("org.sqlite.JDBC");
        } 
        catch (ClassNotFoundException cnfe) { 
            System.err.println("Couldn't find driver class:"); 
            cnfe.printStackTrace(); 
            System.exit(1); 
        } 
            System.out.println("Allt OK"); 
            Connection c = null; 
 
    try {
        
        c = DriverManager.getConnection("jdbc:sqlite:Members"); 

//c = DriverManager.getConnection("jdbc:sqlite:test.db"); Sqlite 
    } 
    catch (SQLException se) { 
    System.out.println("Couldn't connect: print out a stack trace and exit.");
    se.printStackTrace(); 
    System.exit(1); 
 } 
 
    if (c != null) 
        System.out.println("Hooray! We connected to the database!"); 
    else 
        System.out.println("We should never get here."); 
    }*/
}