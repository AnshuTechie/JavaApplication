package org.example.day1;

public class typeCasting {
    public static void main(String[] args) {

        //Implicit small --> large

        int num = 10;    // 4bytes
        float f = num;   // 4 = 4bytes
        double d = num;  // 8 = 4bytes
        char ch = 'A';      //2bytes
        num = ch;           //4 = 2bytes that is integer value of A=65

        System.out.println(d);
        System.out.println(num);


        //Explicit large --> small

        double d2 = 10.53;
        int val = (int) d2;     // 4 = 8
        System.out.println(val);

        byte n1 = 100;      //1byte
        int bVal = (int) n1;    // 4 = 1
        byte n2 = (byte) num;   // 1 = 4
        System.out.println(n2);
        System.out.println(bVal);

        byte n3 = 7;
        byte n4 = 3;
       // byte n5 = n3 + n4; why it don't work
        byte n5 = (byte) (n3 + n4);
        System.out.println(n5);


        //single line comment
        /*

        Multi line comment


         */
    }
}
