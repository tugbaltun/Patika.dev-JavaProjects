package classes.SalaryCalculator;

import java.math.BigDecimal;
import java.util.Date;

public class EmployeeManagerImpl implements EmployeeManager {
    public EmployeeManagerImpl() {
    }

    @Override
    public BigDecimal tax(BigDecimal salary) {
        BigDecimal percent = new BigDecimal("0.03");
        BigDecimal tax = new BigDecimal("0");
        //If the employee's salary is less than 1000 lira, no tax is paid.
        if(salary.compareTo(BigDecimal.valueOf(1000))<0)
            return tax;
        //If the employee's salary is more than 1000 TL, a tax of 3 percent of her/his salary is paid
        tax = salary.multiply(percent);
        return tax;
    }

    @Override
    public BigDecimal bonus(double workHours) {
        BigDecimal bonus = new BigDecimal("0");
        //40 TL is paid for each working hour over 40 hours
        if(workHours>40){
            bonus = BigDecimal.valueOf((workHours-40)*30);
        }
        return bonus;
    }


    @Override
    public BigDecimal raiseSalary(Date hireYear, BigDecimal salary) {
        //Calculate employee's sum of worked years
        int worked = 2021-(int)hireYear.getYear();
        BigDecimal raise;
        BigDecimal percent;
        //Worked year lower than 10 years raise percent is 0.05
        if(worked<10){
            percent = BigDecimal.valueOf(0.05);
        }//Worked year lower than 20 years raise percent is 0.1
        else if(worked<20){
            percent = BigDecimal.valueOf(0.1);
        }//Worked year lower than 20 years raise percent is 0.15
        else{
            percent = BigDecimal.valueOf(0.15);
        }
        //Calculate raise amount
        raise = salary.multiply(percent);
        return raise;
    }

    //Prints employees knowledge
    @Override
    public void toString(Employee employee) {
        BigDecimal salaryWithTaxAndBonus = employee.getSalary().add(bonus(employee.getWorkHours()));
        salaryWithTaxAndBonus = salaryWithTaxAndBonus.subtract(tax(employee.getSalary()));

        BigDecimal sumSalary = salaryWithTaxAndBonus.add(raiseSalary(employee.getHireYear(), employee.getSalary()));
        System.out.println("Adı : "+employee.getName());
        System.out.println("Maaşı : "+employee.getSalary());
        System.out.println("Çalışma Saati : "+employee.getWorkHours());
        System.out.println("Başlangıç Yılı : "+employee.getHireYear().getYear());
        System.out.println("Vergi : "+tax(employee.getSalary()));
        System.out.println("Bonus : "+bonus(employee.getWorkHours()));
        System.out.println("Maaş Artışı : "+raiseSalary(employee.getHireYear(), employee.getSalary()));
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+ salaryWithTaxAndBonus);
        System.out.println("Toplam Maaş : "+sumSalary);
    }
}
