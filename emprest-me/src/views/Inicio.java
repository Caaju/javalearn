package views;

import java.util.Scanner;

public class Inicio extends ViewBase {
    Admin viewAdmin;
    ClientView viewClient;

    public Inicio(Scanner sc, String title) {
        super(sc, title);
        viewAdmin = new Admin(this.sc, "Admin", this);
        viewClient = new ClientView(sc, "Client", this);
    }

    @Override
    protected void amountOptions() {
        choices.add("1.Admin");
        choices.add("2.Cliente");
        choices.add("0.Sair");
    }

    @Override
    public void draw() {
        super.draw();
        if (this.getOption() == 1) {
            viewAdmin.draw();
        } else if (this.getOption() == 2)
            viewClient.draw();
        else if (this.getOption() == 0)
            System.out.println("Sair");
        else
            System.out.println("Opção inválida!");

    }
}
