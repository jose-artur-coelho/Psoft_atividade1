package models;

import java.util.Date;

public class Lote {
    private int qtd;
    private Date dataV;
    private Produto produto;

    public Lote(Produto tipoProduto, int quantidade, Date dataValidade) {
        this.qtd = quantidade;
        this.dataV = dataValidade;
        this.produto = tipoProduto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Date getDataV() {
        return dataV;
    }

    public void setDataV(Date dataV) {
        this.dataV = dataV;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
