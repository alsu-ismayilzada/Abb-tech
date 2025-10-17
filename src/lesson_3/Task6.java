package lesson_3;

public class Task6 {

    public static void main(String[] args) {

        String text = "Madam";

        StringBuilder builder = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            builder.append(text.charAt(i));
        }
        var newText = builder.toString();

        if (newText.equalsIgnoreCase(text)) {
            System.out.println("The text is palindrome");
        } else {
            System.out.println("The text is not palindrome");
        }
    }
}
