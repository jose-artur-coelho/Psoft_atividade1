package services;

import repositories.ProdutoRepository;

public class ProdutoService {
    private ProdutoRepository prodRep = new ProdutoRepository();
    public void novoProduto(String nome, String fabricante, double preco) {
        prodRep.adicionaProd(nome, fabricante, preco);
    }
    public String listarProdutos(){
        return prodRep.toString();
    }

}
