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
    public static void exibirVendas() {
        for (Venda refencia : vendas) {
            System.out.println(refencia);
        }

    }
    //Lista para buscar compras efetuadas pelo cliente
    public static List<Venda> buscarCompraCliente(String cpf) {
        List<Venda> vendasCliente = new ArrayList<>();
        for (Venda referencia : vendas) {
            if (referencia.getCliente().getCpf().equals(cpf)) {
                System.out.println(referencia);
                vendasCliente.add(referencia);
            }
        }
        return vendasCliente;
    }

    //buscar vendas efetuadas pelos vendedores
    public static List<Venda> buscarVendaVendedor(String email){
        List<Venda> vendasVendedor = new ArrayList<>();
        for (Venda referencia : vendas){
            if (referencia.getVendedor().getEmail().equals(email)){
                vendasVendedor.add(referencia);
            }
        }
        return vendasVendedor;
    }
}


