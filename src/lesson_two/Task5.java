package lesson_two;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(age < 18){
            System.out.println("Access denied");
        } else {
            System.out.println("Enter your gender: ");
            String gender = sc.next();

            if (gender.equals("M")){
                System.out.println("Male access granted");
            }else if (gender.equals("F")) {
                System.out.println("Female access granted");
            }else {
                System.out.println("Invalid gender entered");
            }
        }
    }
}
