package lesson_12.other_pattern.builder;

public class Book {

    private String title;
    private String author;
    private String publisher;
    private String isbn;

    private Book(BookBuilder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.publisher = builder.publisher;
        this.isbn = builder.isbn;
    }

    public static BookBuilder builder(){
        return new BookBuilder();
    }

    public static class BookBuilder {
        private String title;
        private String author;
        private String publisher;
        private String isbn;


        public BookBuilder(){
        }

        public Book build() {
            return new Book(this);
        }

        public BookBuilder title(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder author(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public BookBuilder isbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
