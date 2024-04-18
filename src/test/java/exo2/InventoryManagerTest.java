package exo2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class InventoryManagerTest {
    private InventoryManager inventoryManager;

    @BeforeEach
    public void setUp() {
        inventoryManager = new InventoryManager();
    }

    // Teste l'ajout de produit avec différents jeux de données
    @ParameterizedTest
    @MethodSource("jeuxDeDonnees")
    public void test(String article, int qte) {
        this.inventoryManager.ajouterProduit(article, qte);
        assertTrue(6 <= this.inventoryManager.getStock("ArticleA"));
    }

    // Teste la récupération du stock avec différents jeux de données
    @ParameterizedTest
    @MethodSource("jeuxDeDonnees")
    public void testGetStock(String article, int qte) {
        this.inventoryManager.ajouterProduit(article, qte);
        // Vérifie que le stock récupéré correspond à la quantité ajoutée
        assertEquals(qte , this.inventoryManager.getStock(article));
    }

    // Teste la suppression de produit avec différents jeux de données
    @ParameterizedTest
    @MethodSource("jeuxDeDonnees")
    public void testSupprProduit(String article, int qte) {
        this.inventoryManager.ajouterProduit(article, qte);

        // Supprime une quantité de 1 pour l'article donné
        this.inventoryManager.retirerProduit(article, 1);
        // Vérifie que la quantité de stock est réduite de 1 après la suppression
        assertEquals( qte - 1 , this.inventoryManager.getStock(article));
    }

    // Méthode fournissant les jeux de données de test
    private static Stream<Arguments> jeuxDeDonnees() {
        return Stream.of(
                Arguments.of("ArticleA", 100),
                Arguments.of("ArticleA", 5),
                Arguments.of("ArticleA", 0),
                Arguments.of("ArticleB", 100)
        );
    }

}
