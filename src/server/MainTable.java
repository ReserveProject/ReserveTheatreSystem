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
public class MainTable {

    private ArrayList<Theatre> theatreList
            = new ArrayList<>();
    private ArrayList<Movie> movieList;

    public void addTheatre(Theatre t) {
        theatreList.add(t);
    }

    public void listTheatre() {
        for (Theatre theatre : theatreList) {
            System.out.println(theatre);
        }
    }
}
