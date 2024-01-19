package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Cliente;
import entities.LinhaFinanciamento;

public final class Repository {
    static List<LinhaFinanciamento> linhasFinanciamentos = new ArrayList<>();
    static List<Cliente> clientes = new ArrayList<>();
    
    public static void addLinhaFinanciamento(LinhaFinanciamento linhaFinanciamento) {
        linhasFinanciamentos.add(linhaFinanciamento);
    }

    public static List<LinhaFinanciamento> getLinhasFinanciamentos() {
        return linhasFinanciamentos;
    }

    public static void addCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public static List<Cliente> getClientes(){
        return clientes;
    }

}
