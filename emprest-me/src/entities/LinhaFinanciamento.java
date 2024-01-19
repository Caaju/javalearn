package entities;

import entities.enums.ModoFinanciamento;

public class LinhaFinanciamento {
    private ModoFinanciamento modo;
    private double taxaJuros;

    public ModoFinanciamento getModo() {
        return modo;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public LinhaFinanciamento(ModoFinanciamento modo, double taxaJuros) {
        this.modo = modo;
        this.taxaJuros = taxaJuros;
    }

    @Override
    public String toString() {
        return String.format("%s | %.2f", getModo(), getTaxaJuros());
    }

}
