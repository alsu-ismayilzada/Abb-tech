package lesson_3;

public class Task5 {

    public static void main(String[] args) {

        String text = "Hello world";

        StringBuilder builder = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            builder.append(text.charAt(i));
        }
        System.out.println(builder);
    }
}
