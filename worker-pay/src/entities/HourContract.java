package entities;

import java.util.Date;

public class HourContract {
    private Date contractDate;
    private double valuePerHour;
    private int hours;
    
    public Date getContractDate() {
        return contractDate;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public int getHours() {
        return hours;
    }

    public HourContract(Date contractDate, double valuePerHour, int hours) {
        this.contractDate = contractDate;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public double totalValue(){
        return valuePerHour*hours;
    }
}
