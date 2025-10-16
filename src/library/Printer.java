package library;

public class Printer {
    public void print(InterfacePrintable content) {
        if (content == null) throw new IllegalArgumentException("content cannot be null");
        System.out.println(content.returnText());
    }
}
