package com.bptn.course.week1;

import java.util.Scanner;
public class StringOperations {
    public static void displayMenu (){




        System.out.println("/................String Menu................/");



        System.out.println("Press 1 for Palindrome Check\nPress 2 for reverse a String \nPress 3 for Concatenate two Strings\nPress 4 for String Comparison\nPress 5 to Calculate the Length of String");



    }
    public static String palindromeCheck(String word){
        String input = word;
        String reverseInput = "";
        String output;
        char[] stringArray = input.toCharArray();

        for(int i = stringArray.length -1; i>=0; i-- ){
            reverseInput = reverseInput + stringArray[i];
        }

        boolean isPalindrome = input.equalsIgnoreCase(reverseInput);
        if (isPalindrome) {
            output = "is a palindrome";
        } else {
            output = "is not a palindrome";
        }

        return output;
    }

    public static String reverseString(String word){
        String input = word;
        String reverse = "";

        char[] stringArray = input.toCharArray();

        for(int i = stringArray.length -1; i>=0; i-- ){
            reverse = reverse + stringArray[i];
        }



        return reverse ;
    }
    public static void main(String[] args) {
        boolean isTrue = true;
        int input;
        Scanner scanner = new Scanner(System.in);





        while (isTrue) {
            displayMenu();
            input =scanner.nextInt();
            switch (input) {
                case 1:
                    String word;
                    String result;
                    System.out.println("Palindrome Check");
                    System.out.print("Enter a String:");
                    scanner.nextLine();
                    word = scanner.nextLine();
                    result = palindromeCheck(word);
                    System.out.print(result);

                    break;

                case 2:
                    String word2;
                    String result2;
                    System.out.print("Enter a String: ");
                    scanner.nextLine();
                    word2 = scanner.nextLine();
                    result2 = reverseString(word2);
                    System.out.println(result2);

                    break;

                case 3:
                    String concatOne;
                    String concatTwo;
                    String resultThree;
                    System.out.print("Enter First String: ");
                    scanner.nextLine();
                    concatOne = scanner.nextLine();
                    System.out.print("Enter Second String: ");
                    concatTwo = scanner.nextLine();
                    resultThree = concatOne + concatTwo;
                    System.out.println(resultThree);

                    break;
                case 4:
                    String compareOne;
                    String compareTwo;

                    System.out.println("String Comparison\n");
                    System.out.print("Enter First String: ");
                    scanner.nextLine();
                    compareOne = scanner.nextLine();
                    System.out.print("Enter Second String: ");
                    compareTwo = scanner.nextLine();
                    String s = (compareOne.equals(compareTwo)) ? "strings are equal" : "strings are not equal";
                    System.out.println(s);


                    break;

                case 5:
                    String lengthCheck;
                    int length;
                    System.out.println("Length of a string");
                    System.out.print("Enter a string: ");
                    lengthCheck = scanner.nextLine();
                    length = lengthCheck.length();
                    System.out.println("The length of the entered string is: " + length);


                    break;
                default:
                    System.out.println("Invalid choice! Please make a valid choice.");
                    isTrue = false;


            }
        }

        scanner.close();
    }
}
