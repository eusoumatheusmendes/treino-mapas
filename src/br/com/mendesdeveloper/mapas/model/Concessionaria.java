package br.com.mendesdeveloper.mapas.model;

import java.util.*;

public class Concessionaria {

    private String nomeFantasia;
    private Endereco endereco;
    private Collection<Veiculo> veiculos;
    private Map<String, Veiculo> placaParaVeiculo;
    private int totalVeiculosAVenda;

    public Concessionaria(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
        this.veiculos = new ArrayList<>();
        this.placaParaVeiculo = new HashMap<>();
    }

    public Collection<Veiculo> getVeiculos() {
        return Collections.unmodifiableCollection(veiculos);
    }

    public void colocarAVenda(Veiculo veiculo){
        this.veiculos.add(veiculo);
        this.placaParaVeiculo.put(veiculo.getPlaca(), veiculo);
        this.totalVeiculosAVenda++;
    }

    public Veiculo buscarPelaPlaca(String placa){
        return placaParaVeiculo.get(placa);
    }

    public int getTotalVeiculosAVenda() {
        return totalVeiculosAVenda;
    }
}
