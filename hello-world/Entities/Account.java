package Entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    private final double taxa=5.0;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

     public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    @Override
    public String toString() {
        return String.format("Account %d, Holder: %s, Balance: $ %.2f%n", number,holder,balance);
    }

    public void deposit(double value){
        balance+=value;
    }

    public void draw(double value){
        balance-=value;
        applyTaxa();
    }

    private void applyTaxa(){
        balance-=taxa;
    }
}
