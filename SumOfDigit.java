package com.interviewPrep;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        // Input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int sum = sumOfDigit(number);
        System.out.println("Sum of digits: " + sum);
    }

    public static int sumOfDigit(int num) {
        int sum = 0;

        // Loop until the number becomes 0
        while (num != 0) {
            int lastDigit = num % 10;  // Extract the last digit
            sum += lastDigit;          // Add it to the sum
            num = num / 10;            // Remove the last digit from the original number
        }

        return sum;
    }
}

/*
  For input 18794:

Extract 4 (last digit), add to sum → sum = 4.
Extract 9 (last digit), add to sum → sum = 4 + 9 = 13.
Extract 7 (last digit), add to sum → sum = 13 + 7 = 20.
Extract 8 (last digit), add to sum → sum = 20 + 8 = 28.
Extract 1 (last digit), add to sum → sum = 28 + 1 = 29.*/
