package br.com.alura.mvc.mudi.controller.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.model.statusPedido;

public class RequisicaoNovoPedido {
	
	@NotBlank(message = "O campo não pode está vazio.")
	private String nomeProduto;
	
	@NotBlank
	private String urlProduto;
	
	@NotBlank
	private String urlImagem;
	
	@Size(max = 40)
	private String descricao;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProdtuto) {
		this.nomeProduto = nomeProdtuto;
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
	
	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto(nomeProduto);
		pedido.setUrlProduto(urlProduto);
		pedido.setUrlImagem(urlImagem);
		pedido.setDescricao(descricao);
		pedido.setStatus(statusPedido.AGUARDANDO);
		
		
		return pedido;
	}
	
	
}
