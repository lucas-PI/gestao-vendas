package com.comercialinacio.model.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Venda {
    private Long id;
    private BigDecimal valorTotal;
    private BigDecimal valorPago;
    private BigDecimal troco;
    private BigDecimal desconto;
    private Cliente cliente;
    private Usuario usuario;
    private LocalDateTime dataHoraCriacao;
    private LocalDateTime ultimaAtualizacao;

    public Venda() {
    }

    public Venda(Long id, BigDecimal valorTotal, BigDecimal valorPago, BigDecimal troco, BigDecimal desconto, Cliente cliente, Usuario usuario, LocalDateTime dataHoraCriacao, LocalDateTime ultimaAtualizacao) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.valorPago = valorPago;
        this.troco = troco;
        this.desconto = desconto;
        this.cliente = cliente;
        this.usuario = usuario;
        this.dataHoraCriacao = dataHoraCriacao;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    public BigDecimal getTroco() {
        return troco;
    }

    public void setTroco(BigDecimal troco) {
        this.troco = troco;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public LocalDateTime getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venda venda = (Venda) o;
        return Objects.equals(id, venda.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
