package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {
    private static List<Venda> vendas = new ArrayList<>();

    //Cadastro vendas
    public static Venda cadastrarVenda(String nomeDoProduto, double valor, String dataDeRegistro, String email, String cpf) throws Exception{
        Cliente cliente = ServicoCliente.buscarCliente(cpf);
        ServicoCliente.validarEmail(email);
        Vendedor vendedor = ServicoVendedor.buscarVendedor(email);

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
        List<Venda> comprasCliente = new ArrayList<>();
        for (Venda referencia : vendas) {

            if (referencia.getCliente().getCpf().equals(cpf)) {
                System.out.println(referencia);
                comprasCliente.add(referencia);
            }
        }
        return comprasCliente;
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


