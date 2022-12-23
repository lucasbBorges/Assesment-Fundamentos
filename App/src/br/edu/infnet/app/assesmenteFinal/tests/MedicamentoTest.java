package br.edu.infnet.app.assesmenteFinal.tests;

import br.edu.infnet.app.assesmenteFinal.domain.Medicamento;

public class MedicamentoTest {
	public static void main(String[] args) {
		try {
			Medicamento m1;
			m1 = new Medicamento("Cachorro", 27.90, "Ograx-3", "Avert", "Suplemento", "30 COMP");
			System.out.println(m1);
			System.out.println(m1.exibirDesconto());
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Medicamento m2;
			m2 = new Medicamento("Gato", 82.90, "Ograx Derme", "Avert", "Dermatológico", "10 COMP");
			System.out.println(m2);
			System.out.println(m2.exibirDesconto());
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Medicamento m3;
			m3 = new Medicamento("Cachorro", 0, "Queranon", "Nutripharme", "Suplemento", "30 CAPS");
			System.out.println(m3);
			System.out.println(m3.exibirDesconto());
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Medicamento m4;
			m4 = new Medicamento("Cachorro", -3, "Queranon", "Nutripharme", "Suplemento", "10 CAPS");
			System.out.println(m4);
			System.out.println(m4.exibirDesconto());
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Medicamento m5;
			m5 = new Medicamento("Hamster", 54.90, "Queranon", "Nutripharme", "Suplemento", "30 COMP");
			System.out.println(m5);
			System.out.println(m5.exibirDesconto());
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			Medicamento m6;
			m6 = new Medicamento("Gato", 54.90, "Queranon", "Vetoquinol", "Suplemento", "30 COMP");
			System.out.println(m6);
			System.out.println(m6.exibirDesconto());
		} catch (Exception e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}
