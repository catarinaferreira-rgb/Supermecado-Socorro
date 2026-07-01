package model;

public class ItemVenda {

    private Produto produto;
    private int quantidade;

    public ItemVenda(Produto Produto, int quantidade) {
        this.produto = Produto;
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return produto.getPreco() * quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}