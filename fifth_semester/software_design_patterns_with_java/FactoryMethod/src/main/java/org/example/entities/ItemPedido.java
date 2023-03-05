package org.example.entities;

public class ItemPedido {

    private Produto produto;
    private int quantidade;
    private int precoUnitarioEmCentavos;

    public ItemPedido(Produto produto, int quantidade, int precoUnitarioEmCentavos) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitarioEmCentavos = precoUnitarioEmCentavos;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPrecoUnitarioEmCentavos() {
        return precoUnitarioEmCentavos;
    }

    public void setPrecoUnitarioEmCentavos(int precoUnitarioEmCentavos) {
        this.precoUnitarioEmCentavos = precoUnitarioEmCentavos;
    }


    @Override
    public String toString() {
        return "ItemPedido{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                ", precoUnitarioEmCentavos=" + precoUnitarioEmCentavos +
                '}';
    }
}
