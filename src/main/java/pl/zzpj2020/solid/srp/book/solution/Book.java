package pl.zzpj2020.solid.srp.book.solution;

import java.util.HashMap;
import java.util.Map;

public class Book {
    private Map<Integer, String> pages = new HashMap<>();
    private String title;
    private String author;
    BookLocation bookLocation;


    public String getSpecificPageContents(int pageNumber) {
        return pages.get(pageNumber);
    }

    public Map<Integer, String> getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public BookLocation getBookLocation() {
        return bookLocation;
    }
}
