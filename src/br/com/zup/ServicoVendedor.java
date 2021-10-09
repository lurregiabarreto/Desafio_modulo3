package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedor {
    private static List<Vendedor> vendedores = new ArrayList<>();

    public static Vendedor cadastrarVendedor(String nome, String cpf, String email) {
        Vendedor vendedor = new Vendedor(nome, cpf, email);
        vendedores.add(vendedor);
        return vendedor;
    }

    //Verificar  e-mail já castrado
    public static void verificarEmail(String email) throws Exception {
        for (Vendedor referencia : vendedores) {
            if (referencia.getEmail().equals(email)) {
                throw new Exception("Esse e-mail já está cadastrado");
            }
        }
    }


    //buscar vendedores pelo email
    public static Vendedor buscarVendedor(String email) throws Exception {
        for (Vendedor referencia : vendedores) {
            if (referencia.getEmail().equals(email)) {
                return referencia;
            }
        }
        throw new Exception("Nenhum email cadastrado");

    }

    //Exibir de vendedores para usuario
    public static void mostrarListaVendedores() {
        for (Vendedor referencia : vendedores) {
            System.out.println(referencia);
        }
    }

    //Verificar se cpf ja tem cadastrado na lista de vendedores
    public static void verificarCpf(String cpf) throws Exception {
        for (Vendedor referencia : vendedores) {
            if (referencia.getCpf().equals(cpf)) {
                throw new Exception("CPF já cadastrado em sistema ");
            }
        }


    }
}
