package br.edu.infnet.app.assesmenteFinal.tests;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.app.assesmenteFinal.domain.Brinquedo;
import br.edu.infnet.app.assesmenteFinal.domain.Encomenda;
import br.edu.infnet.app.assesmenteFinal.domain.Medicamento;
import br.edu.infnet.app.assesmenteFinal.domain.PetShop;
import br.edu.infnet.app.assesmenteFinal.domain.ProdutosVet;
import br.edu.infnet.app.assesmenteFinal.domain.Racao;
import br.edu.infnet.app.assesmenteFinal.exceptions.EncomendaSemPetShopException;
import br.edu.infnet.app.assesmenteFinal.exceptions.EncomendaSemProdutoException;
import br.edu.infnet.app.assesmenteFinal.exceptions.SolicitanteInvalidoException;

public class EncomendaTest {
	public static void main(String[] args) {
		List<ProdutosVet> lista1 = new ArrayList<ProdutosVet>();
		List<ProdutosVet> lista2 = new ArrayList<ProdutosVet>();
		List<ProdutosVet> lista3 = new ArrayList<ProdutosVet>();
		
		try {
			Racao r1;
			r1 = new Racao("Cachorro", 82,"Ração Crescimento Saudável", 1);
			r1.setRacaoPrescrita(false);
			lista1.add(r1);
			lista2.add(r1);
			lista3.add(r1);
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Racao r2;
			r2 = new Racao("Gato", 146, "Ração Prescrita Gatos Castrados", 3);
			r2.setRacaoPrescrita(true);
			lista3.add(r2);
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Racao r3;
			r3 = new Racao("Cachorro", 210, "Ração Presrita Controle de Peso", 6);
			r3.setRacaoPrescrita(true);
			lista2.add(r3);
			lista3.add(r3);
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			Medicamento m1;
			m1 = new Medicamento("Cachorro", 27.90, "Ograx-3", "Avert", "Suplemento", "30 COMP");
			lista2.add(m1);
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Medicamento m2;
			m2 = new Medicamento("Gato", 82.90, "Ograx Derme", "Avert", "Dermatológico", "30 C0MP");
			lista3.add(m2);
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Medicamento m3;
			m3 = new Medicamento("Cachorro", 54.90, "Queranon", "Nutripharme", "Suplemento", "30 CAPS");
			lista3.add(m3);
			lista2.add(m3);
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			Brinquedo b1;
			b1 = new Brinquedo("Cachorro", 15.90, "Bolinha azul", "Borracha");
			b1.setDimensoes("8x8x8");
			lista1.add(b1);
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Brinquedo b2;
			b2 = new Brinquedo("Gato", 12.50, "Ratinho Pelúcia", "Pelúcia");
			b2.setDimensoes("11x14x4");
			lista2.add(b2);
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Brinquedo b3;
			b3 = new Brinquedo("Cachorro", 22.99, "Macaco Pelúcia", "Pelúcia");
			b3.setDimensoes("12x5x8");
			lista1.add(b3);
			lista3.add(b3);
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			PetShop p1 = new PetShop("Pet Shop LTDA", "123454546453","petshop@gmail.com","RS");
			Encomenda en = new Encomenda(p1, lista1);
			en.setDescricao("PRIMEIRO PEDIDO");
			en.setRetiraNaSede(true);
			en.imprimir();
		}catch(SolicitanteInvalidoException | EncomendaSemPetShopException | EncomendaSemProdutoException e){
			System.out.println("[ERRO] " + e.getMessage());
		}
		try{
			PetShop p2 = new PetShop("Pet Shop do Bairro", "123454546453","bairro_petshop@gmail.com","SC");
			Encomenda en2 = new Encomenda(p2, lista2);
			en2.setDescricao("SEGUNDO PEDIDO");
			en2.setRetiraNaSede(false);
			en2.imprimir();
		}catch(SolicitanteInvalidoException | EncomendaSemPetShopException | EncomendaSemProdutoException e){
			System.out.println("[ERRO] " + e.getMessage());
		}
		try{
			PetShop p3 = new PetShop("Pet Shop Venâncio", "123454546453","venanciopet@gmail.com","RS");
			Encomenda en3 = new Encomenda(p3, lista3);
			en3.setDescricao("TERCEIRO PEDIDO");
			en3.setRetiraNaSede(true);
			en3.imprimir();
		}catch(SolicitanteInvalidoException | EncomendaSemPetShopException | EncomendaSemProdutoException e){
			System.out.println("[ERRO] " + e.getMessage());
		}
		try{
			PetShop p4 = new PetShop("Pet Shop Venâncio", "123454546453","venanciopet@gmail.com","RS");
			Encomenda en4 = new Encomenda(null, lista3);
			en4.setDescricao("TERCEIRO PEDIDO");
			en4.setRetiraNaSede(true);
			en4.imprimir();
		}catch(SolicitanteInvalidoException | EncomendaSemPetShopException | EncomendaSemProdutoException e){
			System.out.println("[ERRO] " + e.getMessage());
		}
		try{
			PetShop p5 = new PetShop("Pet Shop Venâncio", "123454546453","venanciopet@gmail.com","RS");
			Encomenda en5 = new Encomenda(p5, null);
			en5.setDescricao("TERCEIRO PEDIDO");
			en5.setRetiraNaSede(true);
			en5.imprimir();
		}catch(SolicitanteInvalidoException | EncomendaSemPetShopException | EncomendaSemProdutoException e){
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}
