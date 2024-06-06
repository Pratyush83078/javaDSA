package com.pr;

import java.util.Scanner;

public class fibanacoo {
    public static void main(String[] args) {
        byte a = 0;
        byte b = 1;
        Scanner inp = new Scanner(System.in);
        byte n = inp.nextByte();
        for (byte i = 1; i < n+1; i++) {
            int temp = a;
            System.out.println(a);
            a = b;
            b = (byte) (temp + b);
        }
        
        String s= "";
        s=9+"";
        System.out.println(s);

    }
}
