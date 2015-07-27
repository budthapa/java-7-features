package com.budthapa.features;

import java.util.Scanner;

/**
 *
 * @author Buddhi Bal Thapa, budthapa@gmail.com
 */
public class StringInSwitch {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Please enter day of week. Type 'quit' to terminate program.");
            Scanner in = new Scanner(System.in);
            String dayOfWeek = in.next();
            int exitCode = enterDayOfWeek(dayOfWeek);
            if (exitCode == 0) {
                System.out.println("Terminating program");
                break;
            }
        }
    }

    /**
     * Java 7 features
     * Switch statements now accepts string
     * @param day
     * @return 
     */
    static int enterDayOfWeek(String day) {
        switch (day.toLowerCase()) {
            case "sunday":
                System.out.println("Sunday");
                break;
            case "monday":
                System.out.println("monday");
                break;
            case "tuesday":
                System.out.println("tuesday");
                break;
            case "wednesday":
                System.out.println("wednesday");
                break;
            case "thursday":
                System.out.println("thursday");
                break;
            case "friday":
                System.out.println("friday");
                break;
            case "saturday":
                System.out.println("saturday");
                break;
            case "quit":
                return 0;
            default:
                System.out.println("Not a valid day");
                break;
        }
        return 1;
    }
}
