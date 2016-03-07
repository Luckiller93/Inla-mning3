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

import java.sql.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import static javax.swing.JOptionPane.showInputDialog;
public class InUpg {
    static Connection c;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = showInputDialog("Skriv in sökvägen till databasen");
        c = KollaDatabas.getConnection(input);
        Meny rutan = new Meny(c);
        rutan.setVisible(true);
        KollaDatabas.driveTest();
        
        
        
        //Metoder.sokMedlem("Johnsson");
        //KollaDatabas.hittaDB();
        // TODO code application logic here
    }
    
}
