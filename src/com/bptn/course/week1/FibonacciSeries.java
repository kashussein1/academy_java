package com.bptn.course.week1;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        // Initialize the Scanner Object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");

        // Fetch the input from the user and store in the variable called n
        int n = scanner.nextInt();

        int first = 0; // First element of Fibonacci series
        int second = 1; // Second element of Fibonacci series

        System.out.print("Fibonacci Series up to " + n + " elements: ");

        // Print the first n elements of Fibonacci series
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            // Fill in the missing piece of code below to print the elelments
            int third = first + second;
            first =second;
            second = third;
        }

        scanner.close();
    }
}
