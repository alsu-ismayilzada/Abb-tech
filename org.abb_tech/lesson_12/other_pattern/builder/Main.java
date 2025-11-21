package lesson_12.other_pattern.builder;

public class Main {

    public static void main() {

        Book book = Book.builder()
                .title("Book 1")
                .isbn("ISBN 1")
                .author("Author 1")
                .publisher("Publisher 1")
                .build();

        System.out.println(book);
    }
}
