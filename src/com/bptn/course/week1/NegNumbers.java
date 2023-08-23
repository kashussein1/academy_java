package com.bptn.course.week1;
import java.util.Scanner;
public class NegNumbers {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        input = scanner.nextInt();

        if(input > 0){
            System.out.println("The number is positive!");
        }else if(input < 0) {
            System.out.println("The number is negative!");
        }else {
            System.out.println("The number is zero!");
        }

        scanner.close();
    }
}
