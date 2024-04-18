package exo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryIntegrationTest {

    @Test
    public void testBorrowBook()
    {
        // on crée des livres
        Book book1 = new Book("Livre 1", "Charli");
        Book book2 = new Book("Livre 2", "Charli");
        Book book3 = new Book("Livre 3", "Charli");

        // On crée une librairie et on ajoute les livres
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // On crée un utilisateur et on lui ajoute le livre (le livre doit disparaitre de la librairie
        User user = new User("Romain");
        library.borrowbook(book1, user);

        // AssertFalse doit Success car le livre n'est plus dans la librairie
        assertFalse(library.isBookAvailable(book1));
    }

}

