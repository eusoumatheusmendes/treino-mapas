package br.com.mendesdeveloper.mapas.model;

public class Endereco {

    private String rua;
    private String logradouro;
    private int numero;

    public Endereco(String rua, String logradouro, int numero){
        this.rua = rua;
        this.logradouro = logradouro;
        this.numero = numero;
    }
}
