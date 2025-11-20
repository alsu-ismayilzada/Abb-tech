package lesson_12.chain_of_responsibility;

public class Main {

    public static void main(String[] args) {

        Handler handler = new PasswordHandler();
        handler.setNext(new RoleHandler());

        handler.handle("admin");
    }
}
