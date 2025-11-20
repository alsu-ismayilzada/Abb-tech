package lesson_12.chain_of_responsibility;

public abstract class Handler {

    private Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public void handle(String request) {
        if ( process(request) && next != null ) {
            next.handle(request);
        }
    }

    public abstract boolean process(String request);
}
