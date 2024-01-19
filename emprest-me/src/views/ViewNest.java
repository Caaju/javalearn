package views;

import java.util.Scanner;

public abstract class ViewNest extends ViewBase {

    public ViewNest(Scanner sc, String title, ViewBase view) {
        super(sc, title);
        this.view=view;

        addChoice("0.Voltar");
    }

    @Override
    protected void drawDialog() {
        for (String choice : choices) {
            System.out.println(choice);
        }
    }

}
