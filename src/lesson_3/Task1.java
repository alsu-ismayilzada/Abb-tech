package lesson_3;

public class Task1 {

    public static void main(String[] args) {

        int[] array = {6, 3, 6, 2, -7, 9, 4, 22, 17, 1};

        int max = array[0];
        int min = array[0];

        for (int element : array) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }

        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);
    }
}
