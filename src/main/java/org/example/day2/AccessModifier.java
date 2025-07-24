package org.example.day2;

public class AccessModifier {
    private int priVar;
    int packVar;
    public int pubVar;

    /*

    Different access modifiers are
    private
    default
    protected
    public

    what is instance variable -


     */

    public void publicDisplay(){
        System.out.println(" private variable : " + priVar);
        System.out.println(" public variable : " + pubVar);
        System.out.println(" package level : " + packVar);
    }

    public void packDisplay(){
        System.out.println(" private variable : " + priVar);
        System.out.println(" public variable : " + pubVar);
        System.out.println(" package level : " + packVar);

    }

}
