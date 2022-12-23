package br.edu.infnet.app.assesmenteFinal.domain;

import br.edu.infnet.app.assesmenteFinal.exceptions.MaterialInvalidoException;

public class Brinquedo extends ProdutosVet{
	private String material;
	private boolean barulhento;
	private String dimensoes;
	
	public Brinquedo(String animal, double valor, String nome, String material) throws Exception{
		super(animal, valor, nome);
		if("pelúcia".equalsIgnoreCase(material) && "borracha".equalsIgnoreCase(material)) {
			throw new MaterialInvalidoException("Não trabalhamos com brinquedos de " + material);
		}
		this.material = material;
	}

	public double calcularDesconto() {
		return "Pelúcia".equalsIgnoreCase(material) ? this.getValor() * 0.1 : 0;
	}
	
	@Override
	public String toString() {	
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(material);
		sb.append(";");
		sb.append(barulhento ? "Brinquedo barulhento" : "Brinquedo Sliencioso");
		sb.append(";");
		sb.append(dimensoes);
		sb.append(";");
		sb.append(this.exibirDesconto());
		
		
		return sb.toString();
	}
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public boolean isBarulhento() {
		return barulhento;
	}
	public void setBarulhento(boolean barulhento) {
		this.barulhento = barulhento;
	}
	public String getDimensoes() {
		return dimensoes;
	}
	public void setDimensoes(String dimensoes) {
		this.dimensoes = dimensoes;
	}
}
