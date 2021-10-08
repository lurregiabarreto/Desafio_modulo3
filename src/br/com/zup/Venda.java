package br.com.zup;

public class Venda {
    private Vendedor vendedor;
    private Cliente cliente;
    private String nomeDoProduto;
    private double valorSerPago;
    private String dataDeRegistro;


    public Venda() {
    }

    public Venda(Vendedor vendedor, Cliente cliente, String nomeDoProduto, double valorSerPago, String dataDeRegistro) {

        this.vendedor = vendedor;
        this.cliente = cliente;
        this.nomeDoProduto = nomeDoProduto;
        this.valorSerPago = valorSerPago;
        this.dataDeRegistro = dataDeRegistro;


    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public double getValorSerPago() {
        return valorSerPago;
    }

    public void setValorSerPago(double valorSerPago) {
        this.valorSerPago = valorSerPago;
    }

    public String getDataDeRegistro() {
        return dataDeRegistro;
    }

    public void setDataDeRegistro(String dataDeRegistro) {
        this.dataDeRegistro = dataDeRegistro;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome do Produto : "  + nomeDoProduto);
        retorno.append("Valor do Produto :  " + valorSerPago);
        retorno.append("Data de Registro :  " + dataDeRegistro);
        retorno.append("Nome do vendedor :  " + vendedor);
        retorno.append("Nome do cliente : " + cliente);
        return retorno.toString();
    }
}
