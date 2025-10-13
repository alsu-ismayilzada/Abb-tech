package lesson_two;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        var reversedNumber = 0;


        while (number != 0) {
            int utils = number % 10;
            reversedNumber = reversedNumber * 10 + utils;
            number = number / 10;
        }

        boolean isPalindrome = (originalNumber == reversedNumber);

        boolean increasing = true;
        boolean decreasing = true;

        var utils = originalNumber % 10;
        originalNumber /= 10;

        while (originalNumber != 0) {
            int currentUtils = originalNumber % 10;
            originalNumber /= 10;
            if(currentUtils > utils){
                increasing = false;
            }
            if(currentUtils < utils){
                decreasing = false;
            }

            utils = currentUtils;
        }

        if(isPalindrome){
            System.out.println("The number is palindrome.");
        }else if(increasing){
            System.out.println("The number is increasing.");
        }else if(decreasing){
            System.out.println("The number is decreasing.");
        }else {
            System.out.println("The digits are neither in increasing nor decreasing order, nor are they palindrome.");
        }

    }
}
