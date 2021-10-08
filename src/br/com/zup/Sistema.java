package br.com.zup;

import java.util.Scanner;

public class Sistema {

    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //Menu ofericido ao usuário
    public static void menu(){
        System.out.println("Digite [1]  Cadastrar um cliente");
        System.out.println("Digite [2]  Cadastrar um vendedor");
        System.out.println("Digite [3]  Cadastrar Venda");
        System.out.println("Digite [4]  Exibir vendas");
        System.out.println("Digite [5]  Exibir clientes");
        System.out.println("Digite [6]  Exibir vendedores");
        System.out.println("Digite [7]  Exibir as compras de um cliente:");
        System.out.println("Digite [8]  Exibir as vendas de um vendedor:");
        System.out.println("Digite [9]  Sair do programa");
    }

    public static Cliente cadastrarCliente() {
        String nome = capturarDados("Digite o nome do cliente: ").nextLine();
        String cpf = capturarDados("Digite o cpf do cliente: ").nextLine();
        String email = capturarDados("Digite o email do cliente: ").nextLine();

        Cliente cliente = ServicoCliente.cadastrarCliente(nome, cpf, email);
        return cliente;
    }
    public static Vendedor cadastrarVendedor(){
        String nome = capturarDados("Digite o nome do vendedor: ").nextLine();
        String cpf = capturarDados("Digite o cpf do vendendor: ").nextLine();
        String email = capturarDados("Digite o email do vendendor: ").nextLine();


        Vendedor vendedor = ServicoVendedor.cadastrarVendedor(nome, cpf, email);
        return vendedor;
    }

}

