package com.comercialinacio.model.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class VendaItem {
    private Venda venda;
    private Produto produto;
    private BigDecimal total;
    private BigDecimal desconto;
    private Integer quantidade;

    public VendaItem() {
    }

    public VendaItem(Venda venda, Produto produto, BigDecimal total, BigDecimal desconto, Integer quantidade) {
        this.venda = venda;
        this.produto = produto;
        this.total = total;
        this.desconto = desconto;
        this.quantidade = quantidade;
    }

    public Venda getVenda(){
        return venda;
    }
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VendaItem vendaItem = (VendaItem) o;
        return Objects.equals(venda, vendaItem.venda);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(venda);
    }
}
