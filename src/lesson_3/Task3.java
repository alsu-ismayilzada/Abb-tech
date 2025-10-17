package lesson_3;

public class Task3 {

    public static void main(String[] args) {

        int[][][] array = {
                {
                        {1, 3, 6, 8},
                        {2, 6, 7}
                },
                {
                        {2, 3, 9, 45, 32},
                        {-2, -34, 4, 8}
                },
                {
                        {7, 54, 2, 1},
                        {3, 9}
                }
        };

        for (int[][] arr : array) {
            for (int[] row : arr) {
                for (int element : row) {
                    if (element > 6) {
                        System.out.println(element);
                    }
                }
            }
        }
    }
}
