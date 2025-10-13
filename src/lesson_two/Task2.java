package lesson_two;

import java.util.Scanner;

public class Task2 {

    public static void main() {

        Scanner sc = new Scanner(System.in);
        int day;

        do {
            System.out.println("Enter a number between 1 and 7:");
            day = sc.nextInt();
            if (day < 1 || day > 7) {
                System.out.println("Invalid number! Try again.");
            }
        } while (day < 1 || day > 7);


        switch (day) {
            case 1:
                System.out.println("Day is Monday");
                break;
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;
            case 5:
                System.out.println("Day is Friday");
                break;
            case 6:
                System.out.println("Day is Saturday");
                break;
            default:
                System.out.println("Day is Sunday");
                break;
        }

    }
}
