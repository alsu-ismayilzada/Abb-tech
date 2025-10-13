package lesson_two;

import java.util.Scanner;

public class Task7 {

    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if(number < 0){
            System.out.println("Factorial does not exist for negative numbers");
        }

        var factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }
}
