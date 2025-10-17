package lesson_3;

public class Task2 {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {7, 8, 9, 5},
                {7, 8, 9, 7}
        };

        int mainDiagonal = 0;
        int otherDiagonal = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    mainDiagonal += matrix[i][j];
                }
            }
            otherDiagonal += matrix[i][matrix.length - 1 - i];
        }

        System.out.println("Main diagonal: " + mainDiagonal);
        System.out.println("Other diagonal: " + otherDiagonal);

    }
}
