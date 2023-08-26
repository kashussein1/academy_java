package com.bptn.course.week1;
import java.util.Scanner;

public class Calculator {

    public static void displayMenu (){

        System.out.println("/................Calculator Menu................/");



        System.out.println("Press 1 for addition\nPress 2 for subtraction\nPress 3 for multiplication\nPress 4 for division\nPress 5 to square a number\nPress 6 to find a square root\nPress 7 to find the reciprocal");




    }

    public static String add (double input1, double input2){
        double firstNumber;
        double secondNumber;
        double sum;
        firstNumber = input1;

        secondNumber = input2;

        sum = firstNumber + secondNumber;
        return "The sum of the numbers " + firstNumber + " and " +  secondNumber +  " is = "  + sum;

    }

    public static String subtract(double input1, double input2){
        double firstNumber;
        double secondNumber;
        double difference;

        firstNumber = input1;
        secondNumber = input2;

        difference = firstNumber - secondNumber;
        return "The difference of the numbers " + firstNumber + " and " +  secondNumber +  " is = "  + difference;

    }

    public static String multiply(double input1, double input2){
        double firstNumber, secondNumber, product;
        firstNumber = input1 ;
        secondNumber = input2;

        product = firstNumber * secondNumber;

        return ("The product of the numbers " + firstNumber + " and " +  secondNumber +  " is = "  + product  );
    }

    public static String divide(double input1, double input2){
        double firstNumber;
        double secondNumber;
        double quotient;
        double remainder;


        firstNumber = input1;

        secondNumber = input2;

        quotient = firstNumber / secondNumber;
        remainder = firstNumber % secondNumber;
        return  "Dividing " + firstNumber  + " by " + secondNumber + " the quotient is " + quotient +"\n" + "The remainder is " + remainder ;
    }

    public static String square (double input){
        double firstNumber;
        double square;

        firstNumber = input;
        square = firstNumber * firstNumber;
        return "The Square of the number " + firstNumber + " is = " + square ;

    }

    public static String squareRoot (double input){
        double firstNumber;
        double squareRoot;
        System.out.print("Enter the number to find the square root: ");
        firstNumber = input;
        squareRoot = Math.sqrt(firstNumber);
        return "The Square root of the number " + firstNumber + " is = " + squareRoot  ;

    }

    public static String reciprocal (double input){
        double firstNumber;
        double reciprocal;


        firstNumber = input;
        reciprocal = 1/ firstNumber;
        return "The Reciprocal root of the number " + firstNumber + " is = " + reciprocal;

    }

    public static void main(String[] args) {
        //write your code below:

        int input;
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;

        while(isTrue){


            displayMenu();
            input = scanner.nextInt();

            if (input == 1){
                double firstNumber, secondNumber;
                String output;
                System.out.print("Enter the first number: ");
                firstNumber =scanner.nextDouble();
                System.out.print("Enter the second number: ");
                secondNumber =scanner.nextDouble();

                output = add(firstNumber, secondNumber);
                System.out.println(output);
                System.out.println("To continue calculation Press 1, else press any other number to exit");
                input = scanner.nextInt();
                if (input != 1){
                    isTrue = false;
                }
            } else if (input == 2) {
                double firstNumber, secondNumber;
                String output;
                System.out.print("Enter the first number: ");
                firstNumber =scanner.nextDouble();
                System.out.print("Enter the second number: ");
                secondNumber =scanner.nextDouble();

                output = subtract(firstNumber, secondNumber);
                System.out.println(output);
                System.out.println("To continue calculation Press 1, else press any other number to exit");
                input = scanner.nextInt();
                if (input != 1){
                    isTrue = false;
                }
            } else if (input == 3) {
                double firstNumber, secondNumber;
                String output;
                System.out.print("Enter the first number: ");
                firstNumber =scanner.nextDouble();
                System.out.print("Enter the second number: ");
                secondNumber =scanner.nextDouble();
                output = multiply(firstNumber, secondNumber);
                System.out.println(output);
                System.out.println("To continue calculation Press 1, else press any other number to exit");
                input = scanner.nextInt();
                if (input !=1 ){
                    isTrue = false;
                }


            } else if (input == 4) {
                double firstNumber, secondNumber;
                String output;
                firstNumber =scanner.nextDouble();
                secondNumber =scanner.nextDouble();
                output = divide(firstNumber, secondNumber);
                System.out.println(output);
                System.out.println("To continue calculation Press 1, else press any other number to exit");
                input = scanner.nextInt();
                if (input != 1){
                    isTrue = false;
                }

            } else if (input ==5) {
                double firstNumber;
                System.out.println("Enter the number to find Square: ");
                firstNumber = scanner.nextDouble();
                String output;
                output = square(firstNumber);
                System.out.println(output);
                System.out.println("To continue calculation Press 1, else press any other number to exit");
                input = scanner.nextInt();
                if (input != 1){
                    isTrue = false;
                }


            }else if(input == 6){
                double firstNumber;
                String output;
                System.out.print("Enter the number to find the square root: ");
                firstNumber = scanner.nextDouble();
                output =squareRoot(firstNumber);
                System.out.println(output);
                System.out.println("To continue calculation Press 1, else press any other number to exit");
                input = scanner.nextInt();
                if (input != 1 ){
                    isTrue = false;
                }
            } else if (input == 7) {
                double firstNumber;
                String output;
                System.out.print("Enter the number to find Reciprocal: ");
                firstNumber = scanner.nextDouble();
                output = reciprocal(firstNumber);
                System.out.println(output);
                System.out.println("To continue calculation Press 1, else press any other number to exit");
                input = scanner.nextInt();
                if (input != 1){
                    isTrue = false;
                }

            }else{
                System.out.println("Invalid choice");
                System.out.println("To continue calculation Press 1, else press any other number to exit");
                input = scanner.nextInt();
                if (input != 1 ){
                    isTrue = false;
                }


            }


        }
        scanner.close();


    }
}