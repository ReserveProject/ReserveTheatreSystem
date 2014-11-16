/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import java.util.Scanner;

/**
 *
 * @author 5610613209
 */
public class Customer {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.next();
        System.out.print("Enter tel. number : ");
        String tel = sc.next();
        Clerk clerk = new Clerk(name, tel);
    }
}
