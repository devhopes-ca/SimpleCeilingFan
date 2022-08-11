package com.example.simpleceilingfan;

import java.util.Scanner;

public class Fan {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int item = -1;
        boolean end = false;

        CeilingFan ceilingFan = new CeilingFan(0, "Clockwise");

        do {
            System.out.print("\u001B[34m" + "Fan Status: " + '\t' + ceilingFan + '\n'
                    + "\t***\t Select a valid option from the menu below to continue \t***");
            showMenu();

            if (s.hasNextInt()) {
                item = s.nextInt();
            }
            s.nextLine();

            switch (item) {
                case 1 -> {
                    ceilingFan.increaseSpeed();
                    item = -1;
                }
                case 2 -> {
                    ceilingFan.reverseDirection();
                    item = -1;
                }
                case 3 -> {
                    end = true;
                    System.out.println("*** Thank You, Goodbye! ***");
                    // close the scanner
                    s.close();
                }
                default -> System.out.println("\u001B[31m" + "Must enter 1, 2, or 3 as your choice!");
            }
        } while (!end);
    }

    // Main Menu ...
    private static void showMenu() {
        System.out.print("""

                1- Increase Speed
                2- Reverse Fan Direction
                3- Exit Menu
                Selection:\s""");
        System.out.print("""
                """);
    }
}
