package views.writes;

import java.util.Scanner;

import entities.LinhaFinanciamento;
import entities.enums.ModoFinanciamento;
import repositories.Repository;
import views.ViewBase;
import views.ViewContent;

public class LFCriarView extends ViewContent {

    LinhaFinanciamento linhaFinanciamento = null;
    
    public LinhaFinanciamento getLinhaFinanciamento() {
        return linhaFinanciamento;
    }

    public LFCriarView(Scanner sc, String title, ViewBase view) {
        super(sc, title, view);
    }

    @Override
    protected void drawContent() {
        System.out.print("Modo financiamento: ");
        String modoFinanciamento = sc.next();
        System.out.print("Taxa de juros: ");
        double taxaJuros = sc.nextDouble();

        linhaFinanciamento = new LinhaFinanciamento(ModoFinanciamento.valueOf(modoFinanciamento), taxaJuros);
        Repository.addLinhaFinanciamento(linhaFinanciamento);

        this.drawBack();
    }

    @Override
    protected void amountOptions() {
        this.withOptions = false;

    }

}
