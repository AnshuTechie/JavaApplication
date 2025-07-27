package org.example.day2;

import java.util.Scanner;

public class switchDemo {
    public static void main(String[] args){
        //switch-case in Java can be used with int, char, enum, and from
        // Java 7 onwards, with String and some wrapper classes (like Integer, Character).

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        switch (num){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOURTH");
                break;
            default:
                System.out.println("----DEFAULT HAI BHAII-----");
                break;
        }

        char ch = scan.next().charAt(0);
        switch (ch){
            case 'A':
                System.out.println("This is letter A");
                break;
            case 'B':
                System.out.println("This is letter B");
                break;
            case 'C':
                System.out.println("This is letter C");
                break;
            default:
                System.out.println("This is default section");
                break;
        }

    }
}
