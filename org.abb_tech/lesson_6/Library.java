package lesson_6;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Library.Section> {

    private List<T> sections = new ArrayList<>();

    public void filterBooks(BookFilter bookFilter){
        System.out.println("\n" + "Filtered books: ");
        for(T section : sections){
            for(Library<?>.Book book : section.books){
                if(bookFilter.filter(book)){
                    System.out.println(book);
                }
            }
        }
    }

    public void addSection(T section) {
        sections.add(section);
    }

    public void displaySections() {
        for(T section : sections){
            System.out.println(section);
            section.displayBooks();
        }
    }

    public class Book {
        private String title;
        private String author;
        private int year;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getYear() {
            return year;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", year=" + year +
                    '}';
        }
    }

    public static class Section{
        private String name;
        List<Library<?>.Book> books = new ArrayList<>();

        public Section(String name) {
            this.name = name;
        }
        public void addBook(Library<?>.Book book){
            books.add(book);
        }

        public void displayBooks(){
            for(Library<?>.Book book : books){
                System.out.println(book);
            }
        }

        @Override
        public String toString() {
            return "Section{" +
                    "name='" + name + '\'' +
                    '}';
        }

    }
}
