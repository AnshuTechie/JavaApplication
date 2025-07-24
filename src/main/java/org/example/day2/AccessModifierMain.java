package org.example.day2;

public class AccessModifierMain {
    public static void main(String[] args){
        AccessModifier am = new AccessModifier();
        am.packVar = 100;
        am.pubVar = 200;

        am.packDisplay();
        am.publicDisplay();

    }
}
