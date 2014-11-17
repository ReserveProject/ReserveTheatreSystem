/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 5610613209
 */
public class TheatreBooking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        ArrayList<Movie> movie = new ArrayList<Movie>();
        ArrayList<Seat> seat = new ArrayList<Seat>();
        Scanner scan = new Scanner(System.in);
        FileReader reader = new FileReader("input.txt");
        BufferedReader in = new BufferedReader(reader);
        String inputLine;
        
        while (true) {
            inputLine = in.readLine();
            if (inputLine == null) {
                break;
            }
            String[] data = inputLine.split(":");
            movie.add(new Movie(data[0], Integer.parseInt(data[1]), data[2]));
            System.out.print("Do you want to continue? Y(yes) or N(no) : ");
            String check = scan.next();
            if ("n".equals(check) || "N".equals(check)) {
                break;
            }
        }

        // input details
        while (true) {
            System.out.print("Enter title name : ");
            String name = scan.next();
            System.out.print("Enter column : ");
            int column = scan.nextInt();
            System.out.print("Enter row : ");
            int row = scan.nextInt();
            seat.add(new Seat(name, column, row));
            System.out.print("Do you want to continue? Y(yes) or N(no) : ");
            String check = scan.next();
            if ("n".equals(check) || "N".equals(check)) {
                break;
            }
        }

    }
}
