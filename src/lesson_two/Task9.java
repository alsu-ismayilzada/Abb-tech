package lesson_two;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;

        int countOfNumber = 0;
        while (temp > 0) {
            countOfNumber++;
            temp /= 10;
        }
        temp = number;
        var totalSum = 0;


        while (temp > 0){
            var digits = temp % 10;
            temp /= 10;
            var result = 1;
            for(int i = 1; i <= countOfNumber; i++){
                result *= digits;
            }
            totalSum += result;
        }

        System.out.println("Total sum: " + totalSum);
        System.out.println(totalSum == number);

    }
}
