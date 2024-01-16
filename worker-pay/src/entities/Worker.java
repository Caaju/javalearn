package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.Worklevel;

public class Worker {
    private String name;
    private double baseSalary;
    private Department department;
    private Worklevel level;

    public Worklevel getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public Worker(String name, Worklevel level, double baseSalary, Department department) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.department = department;
        this.level=level;
    }

    private List<HourContract> contracts = new ArrayList<>();

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = this.baseSalary;
        Calendar cal = Calendar.getInstance();

        for (HourContract c : contracts) {
            cal.setTime(c.getContractDate());
            if (year == cal.get(Calendar.YEAR)
                    && month == (1 + cal.get(Calendar.MONTH))) {
                sum += c.totalValue();
            }
        }

        return sum;
    }
}
