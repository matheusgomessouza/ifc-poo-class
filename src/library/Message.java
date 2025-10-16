package library;

public class Message implements InterfacePrintable {
    private final String message;

    public Message(String message) {
        this.message = message;
    }

    @Override
    public String returnText() {
        return message;
    }
}
