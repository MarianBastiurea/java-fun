package org.example.c08abstraction;

import java.util.ArrayList;
import java.util.List;

/*
Player (class)
    -  It has four fields. Two Strings called name and weapon. Two ints called hitPoints and strength.
    -  A constructor that accepts a String (name) and two ints (hitPoints and strength). It initialises name,
     hitPoints and strength with the newly passed in values.
     It initialises weapon with the default weapon "Sword".
    -  And eleven methods:
        -  Getters and setters for all four fields.
        -  write(), same as interface. Return a List of the fields in the order they appear in toString().
        -  read(), same as interface. Store the values in the List, in the order they appear in toString().
        Make sure the List is not null and the size() is greater than 0 before storing the values.
        -  toString(), Players overriding toString() method. It takes no arguments and returns a String in
         the following format:
Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}
 */
public class Player implements  ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon="Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> fields = new ArrayList<>();
            fields.add(0,""+name);
            fields.add(1,""+hitPoints);
            fields.add(2,""+strength);
            fields.add(3,weapon);
            return fields;
    }

    @Override
    public void read(List<String> list) {
        if(list!=null&& !list.isEmpty()){
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
            this.weapon = list.get(3);
        }
    }
}
