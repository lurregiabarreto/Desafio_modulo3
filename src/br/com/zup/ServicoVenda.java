package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {
    private static List<Venda> vendas = new ArrayList<>();

    //Cadastro vendas
    public static Venda cadastrarVenda(String nomeDoProduto, double valor, String dataDeRegistro, String email, String cpf) {
        Venda venda = new Venda();
        vendas.add(venda);
        return venda;
    }
    //Exibir vendas

    public static void ExibirVendas() {
        for (Venda refencia : vendas) {
            System.out.println(refencia);
        }

    }

}