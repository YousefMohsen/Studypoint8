/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbaccess;

import entity.Player;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yousinho
 */
public class DBFacade {

    public ArrayList<Player> getPlayerList() throws SQLException {
        ArrayList<Player> playerList = new ArrayList();

        ResultSet rs = DB.getConnection().prepareStatement("SELECT * FROM playerList").executeQuery();
        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String club = rs.getString(3);
            int shirtNumber = rs.getInt(4);
            playerList.add(new Player(id, name, club, shirtNumber));

        }
        //  users.add(new User(id, username, password));}

        // System.out.println(users.size());
        return playerList;

    }

    public void addPlayer(Player p) throws SQLException {
        String sqlString = "insert into playerList (name, club,shirtNumber) values (?,?,?);";
        try (Connection con = DB.getConnection();
                PreparedStatement stmt = con.prepareStatement(sqlString)) {
            stmt.setString(1, p.getName());
            stmt.setString(2, p.getClub());
            stmt.setInt(3, p.getShirtNumber());
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Element inserted");
            } else {
                System.out.println("No change");
            }

        }
    }

    public void deletePlayer(int index) throws SQLException {
        String sqlString = "delete from playerList where id=?;";
        try (Connection con = DB.getConnection();
                PreparedStatement stmt = con.prepareStatement(sqlString)) {
            stmt.setInt(1, index);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Element inserted");
            } else {
                System.out.println("No change");
            }

        }

    }
}
