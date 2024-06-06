package com.pr;

import java.util.Scanner;

public class firstP {
    public static void main(String[] args) {

        // System.out.println(8884);
        // Scanner input = new Scanner(System.in);
        // long o = input.nextLong();

        // narrowing or explicit conversion;
        // long x = 999999999999; err
        long x = 999999999999L;

        short o = (short) x;
        System.out.println(o);

        short y=257;
        // byte err=y; //error
        byte out=(byte)y;//byte stores upto 256
        System.out.println(out);//y%256

        //widening or automatic type conversion 

    }
}