package views;

import java.util.Scanner;

public abstract class ViewBase {
    private int option;
    protected String title;
    protected ViewBase view;

    private Scanner sc;
    public ViewBase(Scanner sc, String title) {
        this.sc=sc;
        this.title = title;
    }

    public int getOption() {
        return option;
    }

    protected abstract void drawDialog();

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
        System.out.println("\n" + this.title + "\n");
    }

    public void drawBack() {
        if (view != null)
            view.draw();
    }
}
