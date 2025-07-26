package org.example.day1;

import java.util.Scanner;

public class DatatypeInput {
    public static void main(String[ ] args){
        Scanner scan = new Scanner(System.in);
        int var1 = scan.nextInt();
        float var2 = scan.nextFloat();
        double var3 = scan.nextDouble();
        String var4 = scan.next();
        scan.nextLine();
        String var5 = scan.nextLine();
        boolean var6 = true;
        byte var7 = scan.nextByte();
        char var8 = 'A';
        long var9 = scan.nextLong();

        scan.close();

        System.out.println(" This is Integer val : " + var1);
        System.out.println(" This is float val : " + var2);
        System.out.println(" This is double val : " + var3);
        System.out.println(" This is String val : " + var4);
        System.out.println(" This is Sentence in String : " + var5);
        System.out.println(" This is Boolean val : " + var6);
        System.out.println(" This is Byte val : " + var7);
        System.out.println(" This is char val : " + var8);
        System.out.println(" This is long int val : " + var9);
    }
}

//The real problem is: scan.next() + scan.nextLine() combo

//  🟡 What scan.next() does:
//      It reads only one word (until space or Enter).
//      It does not consume the newline character (\n) left after pressing Enter.
//
//  🟡 What scan.nextLine() does:
//      It reads the rest of the line, including spaces and up to Enter.


// cause
//      next() leaves a newline (\n) behind, which nextLine() accidentally consumes as an
//      empty string

// Solution
//  Add scan.nextLine() after scan.next() to skip the newline



/*
Why you should close Scanner:
    Releases system resources (like memory and file descriptors).
    Prevents resource leaks.
    Shows you're following clean and professional coding practices.
 */

/*
//println - after printing , the cursor will go the new line
//print   - after printint , the cursor is in the same line
 */