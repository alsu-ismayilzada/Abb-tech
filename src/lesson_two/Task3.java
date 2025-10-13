package lesson_two;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number = sc.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " is odd");
            }
        }
    }
}
