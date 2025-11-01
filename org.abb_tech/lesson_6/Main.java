package lesson_6;

public class Main {

    public static void main(String[] args) {

        Library<Library.Section> library = new Library<>();

        Library.Section fiction = new Library.Section("Fiction");
        Library.Section science = new Library.Section("Science");

        Library<Library.Section>.Book book1 = library.new Book("The Martian","Andy Weir",2011);
        Library<Library.Section>.Book book2 = library.new Book("Project Hail Mary","Andy Weir",2021);
        Library<Library.Section>.Book book3 = library.new Book("A Brief History of Time","Stephen Hawking",1998);


        fiction.addBook(book1);
        fiction.addBook(book2);
        science.addBook(book3);

        library.addSection(fiction);
        library.addSection(science);

        library.displaySections();

        library.filterBooks(new BookFilter() {

            @Override
            public boolean filter(Library<?>.Book book) {
                return book.getYear() >2015;
            }
        });
    }
}
