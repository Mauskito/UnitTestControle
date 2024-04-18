package exo3;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library(){
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book)
    {
        this.books.add(book);
    }

    public void isBookAvailabsfgsgle(Book book)
    {

    }

    public boolean isBookAvailable(Book bookToCheck) {
        for (Book book : this.books) {
            if (book.equals(bookToCheck)) {
                return true;
            }
        }
        return false;
    }


    public void borrowbook(Book book, User user)
    {
        this.books.remove(book);
        user.addBook(book);

    }

    public void returnBook(Book book, User user)
    {
        user.removeBook(book);
        this.books.add(book);

    }

}
