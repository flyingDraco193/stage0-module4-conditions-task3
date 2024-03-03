package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double salaryAfterTaxes;
        if (salary > 0 && salary <= 10000) {
            salaryAfterTaxes = salary - salary * 0.15;
            System.out.println(salaryAfterTaxes);
        } else if (salary >= 10000 && salary <= 20000) {
            salaryAfterTaxes = (int) (salary - salary * 0.18);
            System.out.println(salaryAfterTaxes);
        } else if (salary > 20000) {
            salaryAfterTaxes = (int) (salary - salary * 0.2);
            System.out.println(salaryAfterTaxes);
        } else {
            System.out.println("wrong input!");
        }
    }
}
