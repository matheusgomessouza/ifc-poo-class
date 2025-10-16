package library;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main() {
        Printer printer = new Printer();

        Message msg = new Message("Hello, this is a test message.");
        printer.print(msg);

        List<List<String>> pages = Arrays.asList(
                Arrays.asList("Paragraph 1 of page 1.", "Paragraph 2 of page 1."),
                List.of("Paragraph 1 of page 2.")
        );

        Book book = new Book("Learning Java", "Matheus Souza", pages);
        printer.print(book);
    }
}

