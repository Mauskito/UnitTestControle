package exo1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void salaireJunior1an() {
        Employee emp = new Employee(
                "Fournier",
                "Charli",
                1,
                "Junior"
        );
        double salaireAttendue = 20000 * 1.05;

        double salaire = EmployeeManager.calculateSalary(emp);
        double multiplier = EmployeeManager.calculateExperienceMultiplier(emp.getExp());

        double salaireModif =  salaire * multiplier ;

        assertEquals(salaireAttendue, salaireModif);
    }

    @Test
    public void salaireInter5ans() {
        Employee emp = new Employee(
                "Fournier",
                "Charli",
                5,
                "Intermédiaire"
        );
        double salaireAttendue = 40000 * 1.25;

        double salaire = EmployeeManager.calculateSalary(emp);
        double multiplier = EmployeeManager.calculateExperienceMultiplier(emp.getExp());

        double salaireModif =  salaire * multiplier ;

        assertEquals(salaireAttendue, salaireModif);
    }

    @Test
    public void salaireSenior10ans() {
        Employee emp = new Employee(
                "Fournier",
                "Charli",
                10,
                "Sénior"
        );
        double salaireAttendue = 60000 * 1.50;

        double salaire = EmployeeManager.calculateSalary(emp);
        double multiplier = EmployeeManager.calculateExperienceMultiplier(emp.getExp());

        double salaireModif =  salaire * multiplier ;

        assertEquals(salaireAttendue, salaireModif);
    }

    @Test
    public void salaireSenior20ans() {
        Employee emp = new Employee(
                "Fournier",
                "Charli",
                20,
                "Sénior"
        );
        double salaireAttendue = 60000 * 2;

        double salaire = EmployeeManager.calculateSalary(emp);
        double multiplier = EmployeeManager.calculateExperienceMultiplier(emp.getExp());

        double salaireModif =  salaire * multiplier ;

        assertEquals(salaireAttendue, salaireModif);
    }

    @Test
    public void salaireJunior30ans() {
        Employee emp = new Employee(
                "Fournier",
                "Charli",
                30,
                "Junior"
        );
        double salaireAttendue = 20000 * 2.5;

        double salaire = EmployeeManager.calculateSalary(emp);
        double multiplier = EmployeeManager.calculateExperienceMultiplier(emp.getExp());

        double salaireModif =  salaire * multiplier ;

        assertEquals(salaireAttendue, salaireModif);
    }



}
