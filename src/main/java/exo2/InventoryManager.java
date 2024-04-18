package exo2;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, Integer> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

    /**
     * Ajoute un produit avec une quantité donnée à l'inventaire.
     *
     * @param produit le nom du produit à ajouter.
     * @param quantite la quantité du produit à ajouter.
     */
    public void ajouterProduit(String produit, int quantite) {
        inventory.put(produit, inventory.getOrDefault(produit, 0) + quantite);
    }

    /**
     * Retire un produit avec une quantité donnée de l'inventaire.
     *
     * @param produit le nom du produit à retirer.
     * @param quantite la quantité du produit à retirer.
     * @throws IllegalArgumentException si le produit n'est pas présent dans l'inventaire
     *                                  ou si la quantité à retirer est supérieure à la quantité disponible.
     */
    public void retirerProduit(String produit, int quantite) {
        if (!inventory.containsKey(produit)) {
            throw new IllegalArgumentException("Le produit '" + produit + "' n'est pas présent dans l'inventaire.");
        }

        int stockDisponible = inventory.get(produit);
        if (quantite > stockDisponible) {
            throw new IllegalArgumentException("Quantité à retirer trop grande pour le produit '" + produit + "'.");
        }

        inventory.put(produit, stockDisponible - quantite);
    }

    /**
     * Récupère le stock disponible dans l'inventaire pour un produit donné.
     *
     * @param produit le nom du produit dont on souhaite connaître le stock.
     * @return le stock disponible pour le produit, ou 0 s'il n'est pas présent dans l'inventaire.
     */
    public int getStock(String produit) {
        return inventory.getOrDefault(produit, 0);
    }
}
