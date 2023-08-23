package com.bptn.course.week1;
import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {

        // Fill in the code below

        int factor;
        String str = "Explanation: " ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input = ");
        factor = scanner.nextInt();
        str = str + factor + "! = " + factor;
        for (int i = factor -1; i> 0; i--){
            str = str + " x " + i;
            factor *= i;
        }
        str = str + " = " + factor;
        scanner.close();
        System.out.println("Output = " + factor);
        System.out.println(str);



    }
}
