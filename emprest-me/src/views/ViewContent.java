package views;

import java.util.Scanner;

public abstract class ViewContent extends ViewNest {

    public ViewContent(Scanner sc, String title, ViewBase view) {
        super(sc, title, view);
    }

    protected abstract void drawContent();

    @Override
    public void draw() {
        drawTitle();
        drawContent();
        drawDialog();
        drawOption();
    }
    
}
