package classes.SalaryCalculator;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class Employee {
    private String name;
    private BigDecimal salary;
    private double workHours;
    private Date hireYear;

    public Employee(){}

    public Employee(String name, BigDecimal salary, double workHours, Date hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
}
