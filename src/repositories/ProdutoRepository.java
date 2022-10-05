package repositories;

import models.Produto;

import java.util.ArrayList;
import java.util.Arrays;

public class ProdutoRepository {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionaProd(String nome, String fabricante, double preco) {
        produtos.add(new Produto(nome, fabricante, preco));
    }

    @Override
    public String toString() {
        return this.produtos.toString();
    }
}
