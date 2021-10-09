package br.com.zup;

public class Main {

    public static void main(String[] args) {
        boolean Menu = true;
        while (Menu){
            try {
                Menu = Sistema.executar();
            }catch (Exception erro){
                System.out.println(erro.getMessage());
            }
        }
    }
}
