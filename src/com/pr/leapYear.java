package com.pr;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        System.out.print("Please enter Year: ");
        Scanner inp = new Scanner(System.in);
        short year = inp.nextShort();
        if (year > 1562) {
            if (year % 4 == 0) {
                System.out.println("Leap Year.");
            } else {
                System.out.println("Not a leap year.");
            }
        } else {
            System.out.println("Georgian calender was not formed");
        }

    }
}
