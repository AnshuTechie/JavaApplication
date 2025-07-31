package org.example.day3;

public class ConstructorEmp {

    private int empId;
    private String empName;
    private int empSal;

    public ConstructorEmp(){
        System.out.println("Default Constructor");
    }

    public ConstructorEmp(int empId){
        this.empId = empId;
        System.out.println(" Constrictor with 1 values");
    }

    public ConstructorEmp(int empId, String empName){
        this.empId = empId;
        this.empName  = empName;
        System.out.println(" Constructor with 2 values");
    }

    public ConstructorEmp(int empId, String empName, int empSal){
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
        System.out.println(" Constructor with 3 values");
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpSal() {
        return empSal;
    }

    public void setEmpSal(int empSal) {
        this.empSal = empSal;
    }

    @Override
    public String toString() {
        return "ConstructorEmp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSal=" + empSal +
                '}';
    }

    public void displayDetails(){
        System.out.println(empId + "    " + empName + "    " + empSal+ "     " );
    }
}
