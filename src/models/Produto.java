package models;

public class Produto {
    private String nome;
    private String fabricante;
    private double preco;

    public Produto(String nomeProd, String fabricanteProd, double precoProd) {
        this.nome = nomeProd;
        this.fabricante = fabricanteProd;
        this.preco = precoProd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {

        return this.nome + ", " + this.fabricante + ", " + this.preco;
    }
}
