package br.edu.infnet.app.assesmenteFinal.tests;

import br.edu.infnet.app.assesmenteFinal.domain.Brinquedo;

public class BriquedoTest {
	public static void main(String[] args) {
		try {
			Brinquedo b1;
			b1 = new Brinquedo("Cachorro", 15.90, "Bolinha azul", "Borracha");
			b1.setDimensoes("8x8x8");
			System.out.println(b1);
			System.out.println(b1.exibirDesconto());
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Brinquedo b2;
			b2 = new Brinquedo("Gato", 12.50, "Ratinho Pelúcia", "Pelúcia");
			b2.setDimensoes("11x14x4");
			System.out.println(b2);
			System.out.println(b2.exibirDesconto());
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Brinquedo b3;
			b3 = new Brinquedo("Papagaio", 22.99, "Macaco Pelúcia", "Pelúcia");
			b3.setDimensoes("12x5x8");
			System.out.println(b3);
			System.out.println(b3.exibirDesconto());
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Brinquedo b4;
			b4 = new Brinquedo("Gato", 0, "Rinoceronte Pelúcia", "Pelúcia");
			b4.setDimensoes("12x5x8");
			System.out.println(b4);
			System.out.println(b4.exibirDesconto());
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Brinquedo b5;
			b5 = new Brinquedo("Gato", -1, "Rinoceronte Pelúcia", "Pelúcia");
			b5.setDimensoes("12x5x8");
			System.out.println(b5);
			System.out.println(b5.exibirDesconto());
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Brinquedo b6;
			b6 = new Brinquedo("Gato", 25, "Rinoceronte Pelúcia", "Vinil");
			b6.setDimensoes("12x5x8");
			System.out.println(b6);
			System.out.println(b6.exibirDesconto());
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}
