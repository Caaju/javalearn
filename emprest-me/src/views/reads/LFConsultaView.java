package views.reads;

import java.util.Scanner;

import entities.LinhaFinanciamento;
import repositories.Repository;
import views.ViewBase;
import views.ViewContent;
import views.writes.LFCriarView;

public class LFConsultaView extends ViewContent {
    LFCriarView lfCriarView;

    public LFConsultaView(Scanner sc, String title, ViewBase view) {
        super(sc, title, view);
        lfCriarView=new LFCriarView(sc, title, this);
    }

    @Override
    protected void amountOptions() {
        addChoice("1.Criar");
    }

    @Override
    public void draw() {
        super.draw();
        if(this.getOption()==1){
            lfCriarView.draw();
        }
        else if (this.getOption()==0) {
            this.drawBack();
        }
        else{
            System.out.println("Opção não reconhecida");
        }
    }

    @Override
    protected void drawContent() {
        if (Repository.getLinhasFinanciamentos().size() > 0) {
            for (LinhaFinanciamento linhaFinanciamento : Repository.getLinhasFinanciamentos()) {
                System.out.println(linhaFinanciamento);
            }
            System.out.println();
        }
    }
}
