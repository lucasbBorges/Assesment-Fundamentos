package br.edu.infnet.app.assesmenteFinal.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import br.edu.infnet.app.assesmenteFinal.exceptions.EncomendaSemPetShopException;
import br.edu.infnet.app.assesmenteFinal.exceptions.EncomendaSemProdutoException;

public class Encomenda {
	private String descricao;
	private boolean retiraNaSede;
	private LocalDateTime dataEncom;
	private PetShop petShop;
	private List<ProdutosVet> produtosVet;
	
	public Encomenda(PetShop petShop, List<ProdutosVet> produtosVet) throws EncomendaSemPetShopException, EncomendaSemProdutoException{
		if(petShop == null) {
			throw new EncomendaSemPetShopException("Encomenda não tem Pet Shop vinculada");
		}
		if(produtosVet == null) {
			throw new EncomendaSemProdutoException("Encomenda não tem nenhum produto vinculado");
		}
		this.petShop = petShop;
		this.produtosVet = produtosVet;
		dataEncom = LocalDateTime.now();
	}
	
	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		return String.format("%s,%s,%s",
					  descricao,
					  retiraNaSede? "Retira na sede" : "Mandar por frete",
					  dataEncom.format(formato));
	}
	
	public void imprimir() {
		System.out.println(this);
		System.out.println("Qtde Produtos: " + produtosVet.size());
		System.out.println("Pet Shop: " + petShop);
		System.out.println("Produtos:");
		for(ProdutosVet prod : produtosVet) {
			System.out.println("- " + prod.getNome());
		}
		System.out.println("---------------------------------------------");
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isRetiraNaSede() {
		return retiraNaSede;
	}
	public void setRetiraNaSede(boolean retiraNaSede) {
		this.retiraNaSede = retiraNaSede;
	}
	public PetShop getPetShop() {
		return petShop;
	}
	public LocalDateTime getDataEncom() {
		return dataEncom;
	}
}
