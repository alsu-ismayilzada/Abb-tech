package lesson_3;

public class Task7 {

    public static void main(String[] args) {

        String text = "Java is awesome";
        boolean[] countedChars = new boolean[text.length()];

        for (int i = 0; i < text.length(); i++) {
            if (countedChars[i]) {
                continue;
            }
            char ch = text.charAt(i);
            if (ch == ' ' || !String.valueOf(ch).matches("[a-zA-Z]")) {
                continue;
            }
            var count = 1;
            for (int j = i + 1; j < text.length(); j++) {
                if (ch == text.charAt(j)) {
                    count++;
                    countedChars[j] = true;
                }
            }
            System.out.println(ch + ": " + count);
        }
    }
}
