/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.util.ArrayList;

/**
 *
 * @author 5610613209
 */
public class Theatre {

    public Theatre(String name, int id) {
        this.name = name;
        this.id = id;
    }
    private String name;
    private int id;
    private ArrayList<Seat> seatList;
    private ArrayList<Schedule> scheduleList;

    public String getDetailTable() {
        return ""; // TODO
    }

    @Override
    public String toString() {
        return name + id + getDetailTable();
    }
}
