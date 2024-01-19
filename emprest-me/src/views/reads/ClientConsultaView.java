package views.reads;

import java.util.Scanner;

import views.ViewBase;
import views.ViewNest;

public class ClientConsultaView extends ViewNest {

    public ClientConsultaView(Scanner sc, String title, ViewBase view) {
        super(sc, title, view);
        //TODO Auto-generated constructor stub
    }

    @Override
    protected void amountOptions() {
        addChoice("1.Já sou cliente");
        addChoice("2.Quero ser cliente");
        
    }

    @Override
    public void draw() {
        super.draw();

        if (this.getOption()==1) {
            System.out.print("Informe o CPF: ");
            String cpf=sc.next();

            System.out.println(cpf);
        }
        else if (this.getOption()==2) {
            System.out.println("Quero ser cliente");
        }
        else if (this.getOption()==0) {
            this.drawBack();
        }

    }
    
}
