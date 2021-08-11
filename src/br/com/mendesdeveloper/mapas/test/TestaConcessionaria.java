package br.com.mendesdeveloper.mapas.test;

import br.com.mendesdeveloper.mapas.model.Concessionaria;
import br.com.mendesdeveloper.mapas.model.Veiculo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestaConcessionaria {

    public static void main(String[] args) {

        Concessionaria concessionaria = new Concessionaria("Concessionaria xMotion");

        Veiculo veiculo = new Veiculo("Gol", "Volkswagen", "AAA5050", 30000);
        Veiculo veiculo2 = new Veiculo("Camaro", "Chevrolet", "AAA6050", 120000);
        Veiculo veiculo3 = new Veiculo("Golf", "Volkswagen", "AAA5030", 50000);

        concessionaria.colocarAVenda(veiculo);
        concessionaria.colocarAVenda(veiculo2);
        concessionaria.colocarAVenda(veiculo3);

        List<Veiculo> veiculosOrdenadosPeloPreco = new ArrayList<>(concessionaria.getVeiculos());

        veiculosOrdenadosPeloPreco.sort(Comparator.comparing(Veiculo::getPreco));

        veiculosOrdenadosPeloPreco.forEach(carro -> {
            System.out.println(carro);
        });

       System.out.println("A placa pertence ao veículo: " +concessionaria.buscarPelaPlaca("AAA6050"));

    }
}
