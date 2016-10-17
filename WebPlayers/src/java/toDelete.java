
import dbaccess.DB;
import dbaccess.DBFacade;
import entity.Player;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yousinho
 */
public class toDelete {
    
 public static void main(String [] args) throws SQLException{
  DBFacade dbf = new DBFacade();
  
 // dbf.addPlayer(new Player ("Ter Stegen","FC Barcelona",1));
    

     for (Player Pp : dbf.getPlayerList()) {
         System.out.println(Pp.toString());
     }

 }
    
}
