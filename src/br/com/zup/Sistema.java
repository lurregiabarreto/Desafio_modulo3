package br.com.zup;

import java.util.List;
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

    //Cadastro cliente
    public static Cliente cadastrarCliente() {
        String nome = capturarDados("Digite o nome do cliente: ").nextLine();
        String cpf = capturarDados("Digite o cpf do cliente: ").nextLine();
        String email = capturarDados("Digite o email do cliente: ").nextLine();

        Cliente cliente = ServicoCliente.cadastrarCliente(nome, cpf, email);
        return cliente;
    }

    //Cadastro Vendedor
    public static Vendedor cadastrarVendedor(){
        String nome = capturarDados("Digite o nome do vendedor: ").nextLine();
        String cpf = capturarDados("Digite o cpf do vendendor: ").nextLine();
        String email = capturarDados("Digite o email do vendendor: ").nextLine();


        Vendedor vendedor = ServicoVendedor.cadastrarVendedor(nome, cpf, email);
        return vendedor;
    }

    //Cadastro vendas
    public static Venda cadastrarVenda()throws Exception{
        String nomeDoProduto = capturarDados("Digite o nome do produto:").nextLine();
        double valor = capturarDados("Qual o valor do produto?").nextDouble();
        String dataDeRegistro = capturarDados("Qual a data de registo?").nextLine();
        String cpfCliente = capturarDados("Qual o cpf do cliente para essa venda?").nextLine();
        String emailDoVendedor = capturarDados("Qual o e-mail do vendedor para essa venda?").nextLine();

        Venda venda = ServicoVenda.cadastrarVenda(nomeDoProduto, valor, dataDeRegistro, emailDoVendedor, cpfCliente);
        return venda;
    }
    //Metodo para verificar se existe o email cadastrado na lista de emails
    public static List<Venda> buscarVendaVendedor() throws Exception{
        String email = capturarDados("Digite o email que deseja buscar:").nextLine();

        List<Venda> vendas = ServicoVenda.buscarVendaVendedor(email);
        return vendas;
    }

    //Método para verificar se existe cpf cadastrado na lista
    public static List<Venda> buscarVendaCliente() throws Exception{
        String cpf = capturarDados("Digite o cpf que deseja buscar:").nextLine();

        List<Venda> vendas = ServicoVenda.buscarCompraCliente(cpf);
        return vendas;
    }
    //Metodo para executar todos os metodos do sistema para executar na main
    public static boolean executar()throws Exception{
        boolean opcaoUsuario = true;

        while (opcaoUsuario){
            menu();
            int escolhaMenu = capturarDados("Digite sua escolha:").nextInt();

            if(escolhaMenu == 1){
                cadastrarCliente();
            }
            else if (escolhaMenu == 2){
                cadastrarVendedor();
            }
            else if (escolhaMenu == 3){
                cadastrarVenda();
            }
            else if (escolhaMenu == 4){
                ServicoVenda.exibirVendas();
            }
            else if (escolhaMenu == 5){
                ServicoCliente.buscarCliente();
            }
            else if (escolhaMenu == 6){
                ServicoVendedor.mostrarListaVendedores();
            }
            else if (escolhaMenu == 7){
                System.out.println(buscarVendaCliente());
            }
            else if (escolhaMenu == 8){
                System.out.println(buscarVendaVendedor());
            }
            else if (escolhaMenu == 9){
                System.out.println("Programa finalizado");
                opcaoUsuario = false;
            }
            else {
                System.out.println("Opção inválida ");
            }
        }
        return opcaoUsuario;
    }





}

