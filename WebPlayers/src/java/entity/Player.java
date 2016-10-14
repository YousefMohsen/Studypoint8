/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Yousinho
 */
public class Player {
    private int id;
    private String name;
    private String club;
    private int shirtNumber; 

    public Player(int id, String name, String club, int shirtNumber) {
        this.id = id;
        this.name = name;
        this.club = club;
        this.shirtNumber = shirtNumber;
    }

    public Player(String name, String club, int shirtNumber) {
       this.name = name;
        this.club = club;
        this.shirtNumber = shirtNumber;    }

    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    @Override
    public String toString() {
        return  "id=" + id + ", name=" + name + ", club=" + club + ", shirtNumber=" + shirtNumber ;
    }
   
    
}
