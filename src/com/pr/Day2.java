package com.pr;

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        // 1-------------- leap year -------
        // System.out.print("Please enter Year: ");
        Scanner inp = new Scanner(System.in);
        // short year = inp.nextShort();
        // if (year > 1562) {
        // if (year % 4 == 0) {
        // System.out.println("Leap Year.");
        // } else {
        // System.out.println("Not a leap year.");
        // }
        // } else {
        // System.out.println("Georgian calender was not formed");
        // }

        // 2 ---------------- fibonacci series ---------------
        byte a = 0;
        byte b = 1;
        byte n = inp.nextByte();
        for (byte i = 1; i < n + 1; i++) {
            int temp = a;
            System.out.println(a);
            a = b;
            b = (byte) (temp + b);
        }

        String s = "";
        s = 9 + "";
        System.out.println(s);

        inp.close();

    }
}
