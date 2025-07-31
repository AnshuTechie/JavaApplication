package org.example.day3;

public class Inheritance1 {
    public static void main(String[] args){
        Inher1Calculator cal = new Inher1Calculator(100,10);
       System.out.println("sum of 2 numbers is : "+ cal.add());
        System.out.println("Multiplication of 2 numbers is : " + cal.multiply());


        Inher1ScienCalculator sc = new Inher1ScienCalculator(100,10,10);

        //either do set values like below or pass values in class like above

//        sc.setOperand1(100);
//        sc.setOperand2(10);
//        sc.setOperand3(10);

        System.out.println("------Yes i am here calculating sqrt ----- " + sc.sqrt(25));
        System.out.println("------Yes i am here calculating add by inheritance ----- " + sc.add());





    }
}
