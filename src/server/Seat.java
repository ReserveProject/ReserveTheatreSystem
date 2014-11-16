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
public class Seat {
    
    //field
    protected String name;
    protected int row;
    protected int column;
    private String[][] nSeat;

    // constructor
    public Seat(String name, int row, int column) {
        this.name = name;
        this.row = row;
        this.column = column;
        this.nSeat = new String[row][column];
        this.setSeat();
    }

    //medthod
    public void setSeat() {
        char r = 'A';
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                nSeat[i][j] = (char) (r + i) + Integer.toString(j + 1);
            }
        }
    }
       
    public int sumSeat() {
    return row * column;
    }

    public void printSeat() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(nSeat[i][j]);
                if (j < column - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
