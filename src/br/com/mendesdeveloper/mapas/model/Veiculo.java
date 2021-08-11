package br.com.mendesdeveloper.mapas.model;

import java.util.Objects;

public class Veiculo {

    private String modelo;
    private String marca;
    private String placa;
    private double preco;

    public Veiculo(String modelo, String marca, String placa, double preco){
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object obj) {
        Veiculo veiculo = (Veiculo) obj;
        return this.placa.equals(veiculo.placa);
    }

    @Override
    public int hashCode() {
        return this.placa.hashCode();
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", preco=" + preco +
                '}';
    }

    public String getPlaca() {
        return placa;
    }
}
