package exo3;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Book> borrowedBooks;

    public User(String name)
    {
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBook(Book book)
    {
        this.borrowedBooks.add(book);
    }

    public void removeBook(Book book)
    {
        this.borrowedBooks.remove(book);

    }
}
