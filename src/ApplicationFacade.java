import models.Produto;
import services.LoteService;
import services.ProdutoService;

import java.util.Date;

public class ApplicationFacade {
    private LoteService servicoLote = new LoteService();
    private ProdutoService servicoProd = new ProdutoService();

    public void criarProduto(String nome, String fabricante, double preco) {
        servicoProd.novoProduto(nome, fabricante, preco);
    }
    public String listarProdutos() {
        return servicoProd.listarProdutos();
    }
    public void criarLote(Produto produto, int quantidade, Date dataValidade) {
        servicoLote.novoLote(produto, quantidade, dataValidade);
    }
    public String listarLotes() {
        return servicoLote.listarLotes;
    }
}
