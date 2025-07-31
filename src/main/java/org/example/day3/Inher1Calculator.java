package org.example.day3;

public class Inher1Calculator {
    private int operand1;
    private int operand2;

    public Inher1Calculator(){
        // default
    }

    public Inher1Calculator(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }


    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public int add(){
        int sum = operand1 + operand2;
       return sum;
    }
    public int multiply(){
        return  operand1*operand2;
    }
}
