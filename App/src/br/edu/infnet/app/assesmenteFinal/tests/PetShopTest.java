package br.edu.infnet.app.assesmenteFinal.tests;

import br.edu.infnet.app.assesmenteFinal.domain.PetShop;
import br.edu.infnet.app.assesmenteFinal.exceptions.SolicitanteInvalidoException;

public class PetShopTest {
	public static void main(String[] args) {
		try {
			PetShop pet;
			pet = new PetShop("Pet Shop LTDA", "123454546453","petshop@gmail.com","RS");
			System.out.println(pet);
		} catch (SolicitanteInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			PetShop pet;
			pet = new PetShop(null, "123454546453","petshop@gmail.com","RS");
			System.out.println(pet);
		} catch (SolicitanteInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			PetShop pet;
			pet = new PetShop("Pet Shop LTDA", null,"petshop@gmail.com","RS");
			System.out.println(pet);
		} catch (SolicitanteInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			PetShop pet;
			pet = new PetShop("Pet Shop LTDA", "123454546453",null,"RS");
			System.out.println(pet);
		} catch (SolicitanteInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		try {
			PetShop pet;
			pet = new PetShop("Pet Shop LTDA", "123454546453","petshop@gmail.com",null);
			System.out.println(pet);
		} catch (SolicitanteInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}
