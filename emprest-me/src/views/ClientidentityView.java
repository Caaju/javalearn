package views;

import java.util.Scanner;

public class ClientidentityView extends ViewNest {

    public ClientidentityView(Scanner sc, String title, ViewBase view) {
        super(sc, title, view);
        //TODO Auto-generated constructor stub
    }

    @Override
    protected void amountOptions() {
        addChoice("1.Fazer proposta");
        addChoice("2.Consultar proposta");
        addChoice("3.Meus contratos");
        
    }

    @Override
    public void draw() {
        
        super.draw();
        if (this.getOption()==1) {
            System.out.println("Fazer proposta");
        }
        else if (this.getOption()==2) {
            System.out.println("Consultar proposta");
        }
        else if (this.getOption()==3) {
            System.out.println("Meus contratos");
        }
        else if (this.getOption()==0) {
            this.drawBack();
        }
        else
            System.out.println("Opção inválida!");
    }
    
}
