package com.bptn.course.week1;
public class VariableOperations {
    public static void main(String[] args){
        int numOne = 10;
        int numTwo = 50;

        System.out.println("Num One =" + numOne);
        System.out.println( "Num Two =" + numTwo);

        numOne += 23;
        System.out.println("Num One =" + numOne);
        numOne /= 2;
        System.out.println("Num One =" + numOne);
        numOne -= 1;
        System.out.println("Num One =" + numOne);
        numOne *= 20;
        System.out.println("Num One =" + numOne);

        numTwo += 80;
        System.out.println( "Num Two =" + numTwo);
        numTwo -= 20;
        System.out.println( "Num Two =" + numTwo);
        numTwo /= 2;
        System.out.println( "Num Two =" + numTwo);
        numTwo *= 6;
        System.out.println( "Num Two =" + numTwo);

        numOne =41;
        numTwo = 77;
        System.out.println("Num One =" + numOne);
        System.out.println( "Num Two =" + numTwo);

        char gender = 'M';
        String name = "Kassim";

        System.out.println("My name is: " + name + " and my gender is: " + gender);
    }
}