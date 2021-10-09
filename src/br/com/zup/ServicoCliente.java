package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {
    private static List<Cliente> clientes = new ArrayList<>();

    public static Cliente cadastrarCliente(String nome, String cpf, String email) throws Exception {
        validarEmail(email);
        verificarCpf(cpf);
        verificarEmail(email);
        Cliente cliente = new Cliente(nome, cpf, email);
        clientes.add(cliente);
        return cliente;

    }

    //busca do cliente
    public static Cliente buscarCliente(String cpf) throws Exception {
        for (Cliente referencia : clientes) {
            if (referencia.getCpf().equals(cpf)) {
                return referencia;
            }
        }
        throw new Exception("CPF não encontrado");

    }

    //Verificar  e-mail digitado com @
    public static String validarEmail(String email) throws Exception {
        if (email.contains("@")) {
            return email;
        }
        throw new Exception("E-mail invalido");
    }

    //Verificar CPF já cadastrado
    public static void verificarCpf(String cpf) throws Exception {
        for (Cliente referencia : clientes) {
            if (referencia.getCpf().equals(cpf)) {
                throw new Exception("CPF já cadastrado");
            }
        }

    }

    //Verificar  e-mail já castrado
    public static void verificarEmail(String email) throws Exception {
        for (Cliente referencia : clientes) {
            if (referencia.getEmail().equals(email)) {
                throw new Exception("Esse e-mail já está cadastrado");
            }
        }
    }

    //Exibir clientes
    public static void exibirClientes() {
        for (Cliente referencia : clientes) {
            System.out.println(referencia);
        }
    }
}