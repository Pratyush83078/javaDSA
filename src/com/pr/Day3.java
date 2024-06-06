
package com.pr;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // 1
        // int n= inp.nextInt(), mul=1, sum=0;
        // while (n>0){
        // mul *=n%10;
        // sum +=n%10;
        // n /=10;
        // }
        // System.out.println(mul+" "+sum);

        // 2 ---------------Uppercase vs lowercase----------------
        // while (true) {
        // System.out.print("Write a letter : ");
        // String str = inp.nextLine();
        // char ch = str.trim().charAt(0);
        // int charNum = ch;
        // String output;
        // if (ch == 'x') {
        // break;
        // }
        // if (charNum > 90) {
        // output = "Lowercase";
        // } else {
        // output = "Uppercase";
        // }
        // System.out.println(charNum+" ("+output + " ) (Press 'x' to come out of
        // loop)");
        // }

        // 3 ----------inverting number;---------------
        while (true) {
            System.out.print("write some num: (or press between 0 to 9)  :>");
            int n = inp.nextInt(), inverted = n % 10;
            if (n >= 0 && n <= 10) {
                System.out.println("exited successfully: press ctrl+backspace ctrl+backspace to relaunch");
                inverted = 404;
            }
            n = n / 10;
            while (n > 0) {
                inverted = inverted * 10 + (n % 10);
                n /= 10;
            }
            System.out.println(inverted);
        }

    }
}