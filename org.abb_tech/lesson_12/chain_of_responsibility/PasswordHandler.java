package lesson_12.chain_of_responsibility;

public class PasswordHandler extends Handler {

    @Override
    public boolean process(String request) {

        if(request.equals("admin")) {
            System.out.println("Password is right");
            return true;
        }
        return false;
    }
}
