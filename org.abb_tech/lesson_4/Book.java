package lesson_4;

public class Book {

    private String title;
    private String author;
    private String isbn;

    protected int totalCopies;
    protected int availableCopies;

    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.totalCopies = 1;
        this.availableCopies = 1;
    }

    {
        System.out.println("New book created!");
    }

    public void borrowBook(){
        if(this.availableCopies > 0){
            this.availableCopies--;
            System.out.println("Book borrowed successfully");
        }else {
            System.out.println("Sorry, no copies available");
        }
    }

    public void returnBook(){
        if(this.availableCopies < this.totalCopies){
            this.availableCopies++;
            System.out.println("Book returned successfully");
        }else {
            System.out.println("All copies are already in the library.");
        }
    }

    public void printInfo(){
        System.out.println("Title: " + this.title + "\n"
                + "Author: " + this.author + "\n"
                + "ISBN: " + this.isbn + "\n" + "Total copies: "
                + this.totalCopies + "\n"
                + "Available copies: " + this.availableCopies);
    }

    public static void libraryRules(){
        System.out.println("Max 3 books can be borrowed per person");
    }

    public final void bookType(){
        System.out.println("This is a regular book");
    }

}
