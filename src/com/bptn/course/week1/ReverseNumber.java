package com.bptn.course.week1;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please a Input number");
        int num = scanner.nextInt();
        int reverseNum = 0;
        int temp = num;
        if (num > 0) {
            for (int i = num; i > 0; i /= 10) {
                reverseNum += temp % 10;
                reverseNum *= 10;
                temp /= 10;
            }
            reverseNum /= 10;
            System.out.println(reverseNum);
        }else if(num < 0 ) {

            for (int i = num * -1; i > 0; i /= 10) {
                reverseNum += temp % 10;
                reverseNum *= 10;
                temp /= 10;
            }
            reverseNum = reverseNum * -1;
            reverseNum /= -10;
            System.out.println(reverseNum);

        }else{
            System.out.println(reverseNum);
        }
        scanner.close();
    }
}
