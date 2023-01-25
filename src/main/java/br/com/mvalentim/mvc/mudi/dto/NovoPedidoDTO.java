package br.com.mvalentim.mvc.mudi.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import br.com.mvalentim.mvc.mudi.model.Pedido;
import br.com.mvalentim.mvc.mudi.model.StatusPedido;

public class NovoPedidoDTO {

	@NotBlank
	private String nomeProduto;

	private BigDecimal valorNegociado;

	private LocalDate dataDaEntrega;

	@NotBlank
	private String urlProduto;
	@NotBlank
	private String urlImagem;
	@NotBlank
	private String descricao;

	private StatusPedido status;

	public Pedido toPedido() {
		Pedido pedidos = new Pedido();
		pedidos.setNomeProduto(nomeProduto);
		pedidos.setUrlProduto(urlProduto);
		pedidos.setUrlImagem(urlImagem);
		pedidos.setDescricao(descricao);
		pedidos.setStatus(StatusPedido.AGUARDANDO);
		return pedidos;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public BigDecimal getValorNegociado() {
		return valorNegociado;
	}

	public void setValorNegociado(BigDecimal valorNegociado) {
		this.valorNegociado = valorNegociado;
	}

	public LocalDate getDataDaEntrega() {
		return dataDaEntrega;
	}

	public void setDataDaEntrega(LocalDate dataDaEntrega) {
		this.dataDaEntrega = dataDaEntrega;
	}

	public String getUrlProduto() {
		return urlProduto;
	}

	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

}
