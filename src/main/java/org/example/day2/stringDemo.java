package org.example.day2;

import java.util.Scanner;

public class stringDemo {
    public static void main(String[] args){
//        String msg ="Welcomee";
//        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        //only one word. delimiter is blankspace or enter key
		System.out.println("Enter name ---------");
		String name = scan.next();
		System.out.println(name);
        scan.nextLine();

        System.out.println("Enter a Message -----------");
        //get more than one word - delimiter enter key
        String msg1 = scan.nextLine();
        System.out.println(msg1);
    }
}
