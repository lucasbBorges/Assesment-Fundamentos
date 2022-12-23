package br.edu.infnet.app.assesmenteFinal.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import br.edu.infnet.app.assesmenteFinal.exceptions.TamanhoInvalidoException;

public class Racao extends ProdutosVet{
	private LocalDateTime dataVencimento;
	private int kg;
	private boolean racaoPrescrita;
	
	public Racao(String animal, float valor, String nome, int kg) throws Exception{
		super(animal, valor, nome);
		if(kg < 1 || kg > 12) {
			throw new TamanhoInvalidoException("Tamanho inválido. Sacos entre 1kg e 12kg. Valor informado: " + kg);
		}
		this.kg = kg;
		this.dataVencimento = LocalDateTime.now().plusYears(1);
	}
	
	public double calcularDesconto() {
		if(kg >= 6 && !racaoPrescrita) {
			return this.getValor() * 0.15;
		}
		return 0;
	}
	
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		return String.format("%s;%s;%d;%s;%s", 
					  super.toString(),
					  this.dataVencimento.format(formato),
					  this.kg,
					  this.racaoPrescrita ? "Ração Prescrita" : "Ração Crescimento Saudável",
					  this.exibirDesconto());
	}
	
	public int getKg() {
		return kg;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
	public boolean isRacaoPrescrita() {
		return racaoPrescrita;
	}
	public void setRacaoPrescrita(boolean racaoPrescrita) {
		this.racaoPrescrita = racaoPrescrita;
	}
	public LocalDateTime getDataVencimento() {
		return dataVencimento;
	}
}
