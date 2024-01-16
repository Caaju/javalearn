package views;

import java.util.Scanner;

public class Inicio extends ViewBase {
    
    public Inicio(Scanner sc,String title) {
        super(sc,title);
    }

    @Override
    protected void drawDialog() {
        System.out.println("1.Admin");
        System.out.println("2.Cliente");
        System.out.println("0.Sair");
    }
}
