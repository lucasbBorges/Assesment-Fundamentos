package br.edu.infnet.app.assesmenteFinal.tests;

import br.edu.infnet.app.assesmenteFinal.domain.Racao;

public class RacaoTest{
	public static void main(String[] args) {
		try {
			Racao r1;
			r1 = new Racao("Cachorro", 82,"Ração Crescimento Saudável", 10);
			r1.setRacaoPrescrita(false);
			System.out.println(r1);
			System.out.println("Desconto: R$" + r1.exibirDesconto());
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Racao r2;
			r2 = new Racao("Gato", 146, "Ração Prescrita Gatos Castrados", 1);
			r2.setRacaoPrescrita(true);
			System.out.println(r2);
			System.out.println("Desconto: R$" + r2.exibirDesconto());
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Racao r3;
			r3 = new Racao("Cachorro", 0, "Ração Presrita Controle de Peso", 6);
			r3.setRacaoPrescrita(true);
			System.out.println(r3);
			System.out.println("Desconto: R$" + r3.exibirDesconto());
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Racao r4;
			r4 = new Racao("Gato", -5, "Ração Presrita Controle de Peso", 6);
			r4.setRacaoPrescrita(true);
			System.out.println(r4);
			System.out.println("Desconto: R$" + r4.exibirDesconto());
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Racao r5;
			r5 = new Racao("Peixe", 150, "Ração Presrita Controle de Peso", 6);
			r5.setRacaoPrescrita(true);
			System.out.println(r5);
			System.out.println("Desconto: R$" + r5.exibirDesconto());
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Racao r6;
			r6 = new Racao("Cachorro", 150, "Ração Presrita Controle de Peso", 15);
			r6.setRacaoPrescrita(true);
			System.out.println(r6);
			System.out.println("Desconto: R$" + r6.exibirDesconto());
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}
