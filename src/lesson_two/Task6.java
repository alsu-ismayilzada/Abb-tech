package lesson_two;

import java.util.Scanner;

public class Task6 {

    public static void main() {

        Scanner sc = new Scanner(System.in);
        int number ;

        do {
            System.out.println("Enter a number: ");
            number = sc.nextInt();
            if(number <= 0){
                System.out.println("Please enter a valid number");
            }
        }while (number <= 0);

        int i = 0, j=1;
        int count = 0;

        while (count < number) {
            System.out.println(i);

            var next = i+j;
            i = j;
            j = next;
            count++;
        }
    }
}
