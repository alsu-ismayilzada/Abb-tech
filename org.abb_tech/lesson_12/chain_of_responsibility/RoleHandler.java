package lesson_12.chain_of_responsibility;

public class RoleHandler extends Handler {

    @Override
    public boolean process(String request) {
        if(request.equals("admin")) {
            System.out.println("Role is right");
            return true;
        }
        return false;
    }
}
