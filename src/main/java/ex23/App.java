/*
 *  UCF COP3330 Summer 2021 Assignment 23 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex23;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner start = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? ");
        String startS = start.nextLine();
        if(startS.equals("y")){
            Scanner start3 = new Scanner(System.in);
            System.out.print("Are the battery terminals corroded? ");
            String start3S = start3.nextLine();
            if(start3S.equals("y")){
                System.out.print("Clean terminals and try starting again.");
                System.exit(0);
            } else {
                System.out.print("Replace cables and try again.");
                System.exit(0);
            }
        } else {
            Scanner start11 = new Scanner(System.in);
            System.out.print("Does the car make a slicking noise? ");
            String start11S = start11.nextLine();
            if(start11S.equals("y")){
                System.out.print("Replace the battery.");
                System.exit(0);
            } else {
                Scanner start19 = new Scanner(System.in);
                System.out.print("Does the engine start and then die? ");
                String start19S = start19.nextLine();
                if(start19S.equals("y")){
                    Scanner start20 = new Scanner(System.in);
                    System.out.print("Does you car have fuel injection? ");
                    String start20S = start20.nextLine();
                    if(start20S.equals("y")){
                        System.out.print("Get it in for service.");
                        System.exit(0);
                    } else {
                        System.out.print("Check to ensure the choke is opening and closing.");
                        System.exit(0);
                    }
                } else {
                    System.out.print("This should not be possible.");
                    System.exit(0);
                }
            }
        }
    }
}