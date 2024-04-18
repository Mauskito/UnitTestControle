package exo1;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee(
            "Fournier",
            "Charli",
            2,
            "Sénior"
        );

        double emp1_salary = EmployeeManager.calculateSalary(emp1);

        System.out.println(emp1_salary);
        System.out.println(EmployeeManager.calculateExperienceMultiplier(emp1.getExp()));
    }
    
}
