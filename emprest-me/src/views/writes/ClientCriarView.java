package views.writes;

import java.util.Scanner;

import entities.Cliente;
import repositories.Repository;
import utils.Convertdate;
import views.ViewBase;
import views.ViewContent;

public class ClientCriarView extends ViewContent {

    Cliente cliente;

    public ClientCriarView(Scanner sc, String title, ViewBase view) {
        super(sc, title, view);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void amountOptions() {
        this.withOptions = false;
    }

    @Override
    protected void drawContent() {
        System.out.print("Informe o nome: ");

        sc.nextLine();
        String nome = sc.nextLine();

        System.out.print("Informe o CPF: ");
        String cpf = sc.next();

        System.out.print("informe a data de nascimento: ");
        sc.nextLine();
        String dataNascimento = sc.nextLine();

        cliente = new Cliente(nome, cpf, Convertdate.parse(dataNascimento));

        Repository.addCliente(cliente);

        this.drawBack();

    }

}
