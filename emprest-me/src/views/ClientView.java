package views;

import java.util.Scanner;

import entities.Cliente;
import repositories.Repository;
import views.writes.ClientCriarView;

public class ClientView extends ViewNest {
    ClientidentityView clientidentityView;
    ClientCriarView clientCriarView;

    public ClientView(Scanner sc, String title, ViewBase view) {
        super(sc, title, view);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void amountOptions() {
        addChoice("1.Já sou cliente");
        addChoice("2.Quero ser cliente");

    }

    @Override
    public void draw() {
        super.draw();

        if (this.getOption() == 1) {
            System.out.print("Informe o CPF (Somente numeros): ");
            String cpf = sc.next();

            Cliente cliente = Repository.getClientes().stream().filter(c -> c.isAtivo() && c.getCpf().equals(cpf))
                    .findFirst().orElse(null);

            if (cliente == null) {
                System.out.println("Cliente não existe");
            } else {
                System.out.println("Ola, " + cliente.getNome());
            }
        } else if (this.getOption() == 2) {
            clientCriarView = new ClientCriarView(sc, "Criar Cliente", this);
            clientCriarView.draw();
        } else if (this.getOption() == 0) {
            this.drawBack();
        }

    }

}
