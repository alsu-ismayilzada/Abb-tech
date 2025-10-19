package lesson4;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("Effective Java","Joshua Bloch ","2017956176");

        book.printInfo();
        book.borrowBook();
        book.returnBook();
        Book.libraryRules();
        book.bookType();
    }
}
