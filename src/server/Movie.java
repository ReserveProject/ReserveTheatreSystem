/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author 5610613209
 */
public class Movie {

    // field
    protected String title;
    protected Double totalTime;
    protected String subtutle;

    // constructor
    Movie(String title, double time, String subtutle) {
        this.title = title;
        this.totalTime = time;
        this.subtutle = subtutle;
    }
}
