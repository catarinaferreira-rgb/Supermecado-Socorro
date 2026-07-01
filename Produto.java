package model;
public class Produto {


    private int codigo;
    private String nome;
    private double preco;
    private int estoque;
    private int produto;


    public Produto(int codigo, String nome, double preco, int estoque) {
        this.produto = produto;
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }


    public int getProduto() {
        return produto;
    }
    public int getCodigo() {
        return codigo;
    }


    public String getNome() {
        return nome;
    }


    public double getPreco() {
        return preco;
    }


    public int getEstoque() {
        return estoque;
    }


    public void diminuirEstoque(int quantidade) {
        estoque -= quantidade;
    }
}
