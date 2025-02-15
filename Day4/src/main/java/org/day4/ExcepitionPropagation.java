package org.day4;

public class ExcepitionPropagation {
    // Method that causes exception
    public static void calculateDivision(int arg1, int arg2){
        int divison = arg1 / arg2;
        System.out.println("The division is " + divison);
    }
    public static void testMethod() {
        calculateDivision(10, 0);
    }

    public static void main(String[] args) {
        try {
            testMethod();
        }
        catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
