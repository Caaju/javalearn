package views;

import java.util.Scanner;

import views.reads.LFConsultaView;

public class Admin extends ViewNest {

    LFConsultaView lfConsultaView;
    public Admin(Scanner sc, String title, ViewBase view) {
        super(sc, title, view);
        lfConsultaView=new LFConsultaView(sc, "Cadastro linha de financiamento", this); 
    }

    @Override
    protected void amountOptions() {
        choices.add("1.Linha de financiamento");
        choices.add("2.Meus financiamentos");
    }

    @Override
    public void draw() {
        super.draw();
        if (this.getOption() == 1) {
            lfConsultaView.draw();
        } else if (this.getOption() == 2)
            System.out.println("Abrir Meus financiamentos");
        else if (this.getOption() == 0)
            this.drawBack();

    }
}
