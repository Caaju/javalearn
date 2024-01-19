import java.util.Scanner;

import views.Inicio;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Inicio view = new Inicio(sc,"EmprestMe");
        view.draw();

        sc.close();
    }
}