package org.example.day2;

public class enumDemo {
    public static void main(String[] args){
        //enum defines a fixed set of constants, improves readability, type safety, and
        // works well with switch-case.

        enum Day {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
        }
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);

        switch (today) {
            case MONDAY:
                System.out.println("Start of week!");
                break;
            case FRIDAY:
                System.out.println("Almost weekend!");
                break;
        }


    }
}
