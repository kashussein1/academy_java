package com.bptn.course.week1;
/*-----------------------------------------------------------------------------------

  Scanner, Variables, and Data Types
  To Showcase these important topics, let's have some fun and build a basic tax calculator

 -----------------------------------------------------------------------------------*/

// Step 1. we have to import the scanner class in order to get user input

import java.util.Scanner;

public class TeachBackWeeKOneFinal {
    public static void main(String[] args) {
        //Step 2. Let's declare our Primitive Data Types
        double price;
        double taxRate;
        double priceAfterTax;

        //Step 3. Let's declare and Initialize our Reference Data Types
        Scanner scanner = new Scanner(System.in);
        String currency;

        //Step 4. Let's Initialize our Primitive Data Types
        priceAfterTax = 0.0;
        System.out.println("Please enter the price before tax: ");

        //Step 5. Get user input
        price = scanner.nextDouble();
        System.out.println("Please enter the tax rate: ");
        taxRate = scanner.nextDouble();
        System.out.println("Please enter the currency: ");
        scanner.nextLine();
        currency = scanner.nextLine();


        //Step 6. Performing variable operations
        taxRate /=100;
        priceAfterTax = price * taxRate + price;

        //Step 7. Outputting the final result
        System.out.println("The price before tax is $" + price +  " " + currency + " and the price after tax at a tax rate of " + taxRate *100 + "% is $" + priceAfterTax + " " + currency);

        // Step 8. Close your Scanner to prevent memory leaks
        scanner.close();






    }
}
