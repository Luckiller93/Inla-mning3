package inupg;


import java.sql.*;
import java.util.*;

/**
 *
 * @author Jonas Lennesten
 * @author Christian Hansson
 */
public class Metoder {
    static Statement stmt;
    static ResultSet rs = null;
    
    public static ResultSet sokMedlem(String inData, Connection c){
    
    String query = "select * from medlem natural join funktion natural left outer join lag where familyName='"+inData+"'";
  
    try {    
        stmt = c.createStatement();              
  
      rs = stmt.executeQuery(query);    

      return rs;
    } 
    
        catch(SQLException ex) {
            System.err.print("SQLException: ");
            System.err.println(ex.getMessage());
            return rs;
    } 
    
    }
    
    public static ResultSet sokLedare(String inData, Connection c){
    
        String query = "select * from medlem where id in(select id from funktion where role=1 and id in(select id from lag where lagbeteckning = '"+inData+"'))";
  
    try {    
        stmt = c.createStatement();              
  
        rs = stmt.executeQuery(query);    

      return rs;
    } 
    
        catch(SQLException ex) {
            System.err.print("SQLException: ");
            System.err.println(ex.getMessage());
            return rs;
    } 
    
    }

     public static ResultSet sortMedlem(Connection c){
    
    String query = "select * from medlem order by givenName";

    try {    
         stmt = c.createStatement();              
         rs = stmt.executeQuery(query);    
         return rs;
        } 

    catch(SQLException ex) {
                System.err.print("SQLException: ");
                System.err.println(ex.getMessage());
                return rs;
    } 

    }
     public static ResultSet sortId(Connection c){
    
    String query = "select * from medlem order by id";

    try {    
         stmt = c.createStatement();              
         rs = stmt.executeQuery(query);    
         return rs;
        } 

    catch(SQLException ex) {
                System.err.print("SQLException: ");
                System.err.println(ex.getMessage());
                return rs;
    } 

    }
          
     public static ResultSet lagSpelare(Connection c){
    
    String query = "select distinct lagbeteckning, count(distinct lag.id) as Antal from lag natural left outer join funktion where role = 0 GROUP BY lagbeteckning";
    //Statement stmt;
    //ResultSet rs = null;
    try {    
         stmt = c.createStatement();              
         rs = stmt.executeQuery(query);    
             return rs;
        } 

    catch(SQLException ex) {
                System.err.print("SQLException: ");
                System.err.println(ex.getMessage());
                return rs;
    } 

    }
     
     public static ResultSet lagUtanSpelare(Connection c){
    
    String query = "select distinct lagbeteckning from lag except select distinct lagbeteckning from lag natural left outer join funktion where role = 0 GROUP BY lagbeteckning;";
    //Statement stmt;
    //ResultSet rs = null;
    try {    
         stmt = c.createStatement();              
         rs = stmt.executeQuery(query);    
             return rs;
        } 

    catch(SQLException ex) {
                System.err.print("SQLException: ");
                System.err.println(ex.getMessage());
                return rs;
    } 

    }
     
public static void deleteMedlem(String inData, Connection c){
    //Om tid finns, gör check för att ID skall finnas.    
    String query = "Delete from medlem where id='"+inData+"';delete from funktion where id='"+inData+"';delete from lag where id='"+inData+"'";
    //Statement stmt;
    //ResultSet rs = null;
    try {    
         stmt = c.createStatement();              
         stmt.executeUpdate(query);    
             
        } 

    catch(SQLException ex) {
                System.err.print("SQLException: ");
                System.err.println(ex.getMessage());
                
    } 
}
public static void avaktiveraMedlem(String inData, Connection c){
        
    String query = "update medlem set active=0 where id='"+inData+"'";
    //Statement stmt;
    //ResultSet rs = null;
  
    try {    
        stmt = c.createStatement();              
        stmt.executeUpdate(query);    
    } 
    
        catch(SQLException ex) {
            System.err.print("SQLException: ");
            System.err.println(ex.getMessage());
        }
    }
public static void aktiveraMedlem(String inData, Connection c){
        
    String query = "update medlem set active=1 where id='"+inData+"'";
    //Statement stmt;
    //ResultSet rs = null;
  
    try {    
        stmt = c.createStatement();              
        stmt.executeUpdate(query);    
    } 
    
        catch(SQLException ex) {
            System.err.print("SQLException: ");
            System.err.println(ex.getMessage());
        }
    }

public static void laggTillMedlem(String id, String givenName,String familyName, String gender, String birth, String memSince,String lag,ArrayList<Integer> listan, Connection c){
    
    String active = "1";
       //ResultSet rs =stmt.executeQuery("INSERT INTO medlem VALUES ('" + id + "','" + givenName + "','" + familyName + "','" + gender + "','" + birth + "','" + memSince + "','" + active + "')");
     
    try {    
        stmt = c.createStatement();
        stmt.executeUpdate("INSERT INTO medlem VALUES ('" + id + "','" + givenName + "','" + familyName + "','" + gender + "','" + birth + "','" + memSince + "','" + active + "')");
        
        for(int i=0; i<listan.size();i++){
            stmt.executeUpdate("INSERT INTO funktion VALUES ('"+id+"','"+listan.get(i)+"')");
        }    
            stmt.executeUpdate("INSERT INTO lag VALUES ('"+id+"','"+lag+"')");
    } 
    
        catch(SQLException ex) {
            System.err.print("SQLException: ");
            System.err.println(ex.getMessage());
        } 

    }

public static boolean checkId(String inData, Connection c){
    boolean id = false;
    String query = "select id from medlem where id='"+inData+"'";
  
    try {    
        stmt = c.createStatement();              
  
      rs = stmt.executeQuery(query); 
            
      if(rs.next()){   
        id = true;
      }
      return id;
      //return rs;
    } 
    
        catch(SQLException ex) {
            
            System.err.print("SQLException: ");
            System.err.println(ex.getMessage());
            return id;
            
        } 
    
    }
public static void andraMedlem(String inData,ArrayList<Integer> listan, Connection c){
       
     String x = "delete from funktion where id='"+inData+"'";
    try {    
        stmt = c.createStatement();
        stmt.executeUpdate(x);
        
        
        for(int i=0; i<listan.size();i++){
        //String s = "UPDATE funktion SET role='" +listan.get(i)+ "' WHERE id='" + inData + "')";
            stmt.executeUpdate("INSERT INTO funktion VALUES ('"+inData+"','"+listan.get(i)+"')");
        }       
        
    } 
    
        catch(SQLException ex) {
            System.err.print("SQLException: ");
            System.err.println(ex.getMessage());
        } 

    }

}


