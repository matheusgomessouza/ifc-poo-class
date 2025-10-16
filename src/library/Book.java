package library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class Book implements InterfacePrintable {
    private final String title;
    private final String author;
    private final List<List<String>> pages;

    public Book(String title, String author, List<List<String>> pages) {
        this.title = Objects.requireNonNull(title, "title cannot be null");
        this.author = Objects.requireNonNull(author, "author cannot be null");
        Objects.requireNonNull(pages, "pages cannot be null");

        List<List<String>> copy = new ArrayList<>(pages.size());
        for (List<String> page : pages) {
            if (page == null) throw new IllegalArgumentException("each page cannot be null");
            List<String> pageCopy = new ArrayList<>(page.size());
            for (String paragraph : page) {
                if (paragraph == null) throw new IllegalArgumentException("paragraph cannot be null");
                pageCopy.add(paragraph);
            }
            copy.add(Collections.unmodifiableList(pageCopy));
        }
        this.pages = Collections.unmodifiableList(copy);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public List<List<String>> getPages() {
        return pages;
    }

    @Override
    public String returnText() {
        StringBuilder sb = new StringBuilder();
        sb.append("Title: ").append(title).append(System.lineSeparator());
        sb.append("Author: ").append(author).append(System.lineSeparator()).append(System.lineSeparator());
        for (int i = 0; i < pages.size(); i++) {
            sb.append("Page ").append(i + 1).append(System.lineSeparator());
            List<String> page = pages.get(i);
            for (String para : page) {
                sb.append(para).append(System.lineSeparator()).append(System.lineSeparator());
            }
            sb.append("-----").append(System.lineSeparator()).append(System.lineSeparator());
        }
        return sb.toString();
    }

}

