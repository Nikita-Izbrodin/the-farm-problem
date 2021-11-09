package com.company;

import java.util.*;

public class Main {

    public static int chickTot = 0; // stores total of chickens
    public static int cowTot = 0; // stores total of cows
    public static int pigTot = 0; // stores total of pigs


    public static void chick() { // gets amount of chickens from user
        System.out.print("Please enter number of chickens: ");
        chickTot = new Scanner(System.in).nextInt();
    }

    public static void cow() { // gets amount of cows from user
        System.out.print("Please enter number of cows: ");
        cowTot = new Scanner(System.in).nextInt();
    }

    public static void pig() { // gets amount of pigs from user
        System.out.print("Please enter number of pigs: ");
        pigTot = new Scanner(System.in).nextInt();
    }

    public static void calcTotLegs() { // displays total legs of each animal individually, and then a total of all animals
        System.out.println("Total chicken legs: " + chickTot*2);
        System.out.println("Total cow legs: " + cowTot*4);
        System.out.println("Total pig legs: " + pigTot*4);
        System.out.println("Total legs: " + ((chickTot*2)+(cowTot*4)+(pigTot*4)));
    }

    public static void main(String[] argv) {
        chick();
        cow();
        pig();
        calcTotLegs();
    }

}
