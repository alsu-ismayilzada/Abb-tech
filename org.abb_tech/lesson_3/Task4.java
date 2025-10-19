package lesson_3;

public class Task4 {

    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 11;
        array[1] = 2;
        array[2] = -34;
        array[3] = 74;
        array[4] = 25;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    var temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("\n" + "Array-in tərsdən çapı");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }


    }
}
