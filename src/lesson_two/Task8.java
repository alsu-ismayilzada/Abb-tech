package lesson_two;

import java.util.Scanner;

public class Task8 {
    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int totalFactorial = 0;

        while (temp > 0) {
            int units = temp % 10;

            int factorial = 1;
            for (int i = 1; i <= units; i++) {
                factorial *= i;
            }

            totalFactorial += factorial;
            temp /= 10;
        }

        System.out.println("Total factorial: " + totalFactorial);

        if (number == totalFactorial) {
            System.out.println(number + " is a Strong Number");
        } else {
            System.out.println(number + " is NOT a Strong Number");
        }

    }
}
