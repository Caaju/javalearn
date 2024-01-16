import java.util.Scanner;

import views.Admin;
import views.Inicio;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Inicio view = new Inicio(sc,"EmprestMe");
        view.draw();

        if (view.getOption() == 1) {
            Admin viewAdmin = new Admin(sc,"EmprestMe - Admin", view);
            viewAdmin.draw();

            int opcao = viewAdmin.getOption();

            if (opcao == 1)
                System.out.println("Abrir Linha de financiamento");
            else if (opcao == 2)
                System.out.println("Abrir Meus financiamentos");
            else if (opcao == 0)
                viewAdmin.drawBack();

        } else if (view.getOption() == 2)
            System.out.println("Abrir cliente");
        else if (view.getOption() == 0)
            System.out.println("Sair");
        else
            System.out.println("Opção inválida!");

        sc.close();
    }
}