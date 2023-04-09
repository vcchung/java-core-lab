package vc.java.inner_class.anonymous_event_handler;

public class Main {
    public static void main(String[] args){
        EventHandler eventHandler=new EventHandler() {
            @Override
            public void handle(Event event) {
                System.out.println("handling "+event);
            }
        };
        eventHandler.handle(new Event("hello!"));
    }
}

interface EventHandler{
    void handle(Event event);
}

class Event{
    private String message;

    Event(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Event{" +
                "message='" + message + '\'' +
                '}';
    }
}