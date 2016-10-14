/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;


import dbaccess.DBFacade;
import entity.Player;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Yousinho
 */
public class DomainFacade {
  DBFacade dbf = new DBFacade();


    public List<Player> getPlayers() throws SQLException {
        
        return dbf.getPlayerList();
    }

public void addPlayer(Player p) throws SQLException{
dbf.addPlayer(p);
}

}