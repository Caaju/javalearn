package views;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class ViewBase {
    private int option;
    protected String title;
    protected ViewBase view;
    protected List<String> choices = new ArrayList<>();
    protected boolean withOptions = true;
    protected boolean withContent=false;

    protected Scanner sc;

    public ViewBase(Scanner sc, String title) {
        this.sc = sc;
        this.title = title;

        amountOptions();
    }

    public int getOption() {
        return option;
    }

    protected abstract void amountOptions();

    protected void drawDialog() {
        if (withOptions) {
            for (String choice : choices) {
                System.out.println(choice);
            }
        }
    }

    public void draw() {
        drawTitle();
        drawDialog();
        drawOption();
    }

    protected void drawOption() {
        System.out.print("\nSelecione uma das opções acima:");
        this.option = sc.nextInt();
    }

    protected void drawTitle() {
        System.out.println("\nEmpretME - " + this.title + "\n");
    }

    public void drawBack() {
        if (view != null)
            view.draw();
    }

    protected void addChoice(String description){
        choices.add(description);
    }
}
