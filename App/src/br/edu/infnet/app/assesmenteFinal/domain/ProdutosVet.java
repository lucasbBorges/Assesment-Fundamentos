package br.edu.infnet.app.assesmenteFinal.domain;

import java.text.DecimalFormat;

import br.edu.infnet.app.assesmenteFinal.exceptions.AnimalInvalidoException;
import br.edu.infnet.app.assesmenteFinal.exceptions.ValorZeradoException;

public abstract class ProdutosVet {
	private String animal;
	private double valor;
	private String nome;
	public static final DecimalFormat FORMATO_PRECO = new DecimalFormat("0.00");
	
	public ProdutosVet(String animal, double valor, String nome) throws Exception{
		if(valor == 0) {
			throw new ValorZeradoException("O valor do produto está zerado");
		}
		
		if(valor < 0) {
			throw new ValorZeradoException("O valor do produto está negativo");
		}
		
		if("Cachorro".equalsIgnoreCase(animal) && "Gato".equalsIgnoreCase(animal)) {
			throw new AnimalInvalidoException("Não trabalhamos com produtos de " + animal);
		}
		
		this.animal = animal;
		this.valor = valor;
		this.nome = nome;
	}
	
	public abstract double calcularDesconto();
	
	public String exibirDesconto() {
		return FORMATO_PRECO.format(this.calcularDesconto());
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(valor);
		sb.append(";");
		sb.append(animal);
		
		return sb.toString();
	}

	public String getAnimal() {
		return animal;
	}
	public double getValor() {
		return valor;
	}
	public String getNome() {
		return nome;
	}
}
