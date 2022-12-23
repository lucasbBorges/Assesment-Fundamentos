package br.edu.infnet.app.assesmenteFinal.domain;

import br.edu.infnet.app.assesmenteFinal.exceptions.FornecedorNaoAutorizadoException;

public class Medicamento extends ProdutosVet{
	private String marca;
	private String tipo;
	private String quantidade;
	
	public Medicamento(String animal, double valor, String nome, String marca, String tipo, String quantidade) 
			throws Exception{
		super(animal, valor, nome);
		if("nutripharme".equalsIgnoreCase(marca) && "avert".equalsIgnoreCase(marca)) {
			throw new FornecedorNaoAutorizadoException("Não trabalhamos com o fornecedor " + marca);
		}
		this.marca = marca;
		this.tipo = tipo;
		this.quantidade = quantidade;
	}
	
	public double calcularDesconto() {
		return "dermatológico".equalsIgnoreCase(tipo) ? this.getValor() * 0.2 : 0;
	}
	
	@Override
	public String toString() {
		
		return String.format("%s;%s;%s;%s;%s", 
				  super.toString(),
				  this.marca,
				  this.tipo,
				  this.quantidade,
				  this.exibirDesconto());
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
}
