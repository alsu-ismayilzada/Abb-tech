package lesson_two;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter a number: ");
            number = sc.nextInt();
            if (number <= 0) {
                System.out.println("Please enter a valid number");
            }
        } while (number <= 0);

        int i = 0, j = 1;
        int count = 0;

        while (count < number) {
            if (i == 0) {
                System.out.println(i + " - neither odd nor even");
            } else if (i % 2 == 0) {
                System.out.println(i + " - even");
            } else {
                System.out.println(i + " - odd");
            }

            var next = i + j;
            i = j;
            j = next;
            count++;
        }
    }
}
