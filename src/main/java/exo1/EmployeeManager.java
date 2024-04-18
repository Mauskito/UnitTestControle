package exo1;

import java.util.Arrays;

/**
 * Cette classe gère les opérations liées aux employés.
 */
public class EmployeeManager {

    /**
     * Constructeur de la classe EmployeeManager.
     */
    public EmployeeManager() {
    }

    /**
     * Calcule le salaire d'un employé en fonction de son niveau.
     *
     * @param employee l'employé pour lequel calculer le salaire.
     * @return le salaire de l'employé.
     * @throws IllegalArgumentException si le niveau de l'employé n'est pas valide.
     */
    public static double calculateSalary(Employee employee) {
        String[] niveaux = {"Junior", "Intermédiaire", "Sénior"};
        if (!Arrays.asList(niveaux).contains(employee.getNiveau())) {
            throw new IllegalArgumentException("Le niveau indiqué n'existe pas");
        }

        return switch (employee.getNiveau()) {
            case "Junior" -> 20000;
            case "Intermédiaire" -> 40000;
            case "Sénior" -> 60000;
            default -> 0;
        };
    }

    /**
     * Calcule le multiplicateur d'expérience en fonction du nombre d'années d'expérience.
     *
     * @param anneesExperience le nombre d'années d'expérience de l'employé.
     * @return le multiplicateur d'expérience.
     */
    public static double calculateExperienceMultiplier(int anneesExperience) {
        return 1 + (double) (anneesExperience * 5) / 100;
    }
}
