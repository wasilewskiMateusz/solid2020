package pl.zzpj2020.solid.srp.book.solution;

import java.util.Map;

public class BookPrinter implements Printable {

    private Book book;

    public BookPrinter(Book book) {
        this.book=book;
    }

    @Override
    public void printAllPages(Book book) {
        for(int i=1; i<book.getPages().size(); i++){
            printSpecificPage(i);
        }
    }

    public void printSpecificPage(int pageNumber) {
        System.out.println(book.getSpecificPageContents(pageNumber));
    }
}
