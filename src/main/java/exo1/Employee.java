package exo1;

/**
 * Cette classe représente un employé.
 */
public class Employee {

    private String nom; // Le nom de l'employé
    private String prenom; // Le prénom de l'employé
    private int exp; // L'expérience de l'employé en années
    private String niveau; // Le niveau de l'employé

    /**
     * Constructeur de la classe Employee.
     *
     * @param nom le nom de l'employé.
     * @param prenom le prénom de l'employé.
     * @param exp l'expérience de l'employé en années.
     * @param niveau le niveau de l'employé.
     */
    public Employee(String nom, String prenom, int exp, String niveau) {
        this.nom = nom;
        this.prenom = prenom;
        this.exp = exp;
        this.niveau = niveau;
    }

    /**
     * Retourne le nom de l'employé.
     *
     * @return le nom de l'employé.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Modifie le nom de l'employé.
     *
     * @param nom le nouveau nom de l'employé.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne le prénom de l'employé.
     *
     * @return le prénom de l'employé.
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Modifie le prénom de l'employé.
     *
     * @param prenom le nouveau prénom de l'employé.
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Retourne l'expérience de l'employé en années.
     *
     * @return l'expérience de l'employé en années.
     */
    public int getExp() {
        return exp;
    }

    /**
     * Modifie l'expérience de l'employé en années.
     *
     * @param exp la nouvelle expérience de l'employé en années.
     */
    public void setExp(int exp) {
        this.exp = exp;
    }

    /**
     * Retourne le niveau de l'employé.
     *
     * @return le niveau de l'employé.
     */
    public String getNiveau() {
        return niveau;
    }

    /**
     * Modifie le niveau de l'employé.
     *
     * @param niveau le nouveau niveau de l'employé.
     */
    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
}
