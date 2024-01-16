package views;

import java.util.Scanner;

public class Admin extends ViewBase {

    public Admin(Scanner sc ,String title, ViewBase view) {
        super(sc,title);
        this.view=view;
    }

    @Override
    protected void drawDialog() {
        System.out.println("1.Linha de financiamento");
        System.out.println("2.Meus financiamentos");
        System.out.println("0.Voltar");
        
    }
    
}
