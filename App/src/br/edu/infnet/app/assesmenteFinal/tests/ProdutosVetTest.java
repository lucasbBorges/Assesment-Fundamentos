package br.edu.infnet.app.assesmenteFinal.tests;

import br.edu.infnet.app.assesmenteFinal.domain.Brinquedo;
import br.edu.infnet.app.assesmenteFinal.domain.Medicamento;
import br.edu.infnet.app.assesmenteFinal.domain.Racao;

public class ProdutosVetTest {
	public static void main(String[] args) {
		try {
			Brinquedo b1;
			b1 = new Brinquedo("Cachorro", 15.90, "Bolinha azul", "Borracha");
			b1.setDimensoes("8x8x8");
			System.out.println(b1);
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Brinquedo b2;
			b2 = new Brinquedo("Gato", 12.50, "Ratinho Pelúcia", "Pelúcia");
			b2.setDimensoes("11x14x4");
			System.out.println(b2);
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Brinquedo b3;
			b3 = new Brinquedo("Cachorro", 22.99, "Macaco Pelúcia", "Pelúcia");
			b3.setDimensoes("12x5x8");
			System.out.println(b3);
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			Racao r1;
			r1 = new Racao("Cachorro", 82,"Ração Crescimento Saudável", 1);
			r1.setRacaoPrescrita(false);
			System.out.println(r1);
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Racao r2;
			r2 = new Racao("Gato", 146, "Ração Prescrita Gatos Castrados", 3);
			System.out.println(r2);
			r2.setRacaoPrescrita(true);
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Racao r3;
			r3 = new Racao("Cachorro", 210, "Ração Presrita Controle de Peso", 6);
			r3.setRacaoPrescrita(true);
			System.out.println(r3);
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			Medicamento m1;
			m1 = new Medicamento("Cachorro", 27.90, "Ograx-3", "Avert", "Suplemento", "30 COMP");
			System.out.println(m1);
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Medicamento m2;
			m2 = new Medicamento("Gato", 82.90, "Ograx Derme", "Avert", "Dermatológico", "30 C0MP");
			System.out.println(m2);
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Medicamento m3;
			m3 = new Medicamento("Cachorro", 54.90, "Queranon", "Nutripharme", "Suplemento", "30 CAPS");
			System.out.println(m3);
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}
