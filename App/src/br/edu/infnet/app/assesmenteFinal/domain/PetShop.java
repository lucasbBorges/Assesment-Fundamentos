package br.edu.infnet.app.assesmenteFinal.domain;

import br.edu.infnet.app.assesmenteFinal.exceptions.SolicitanteInvalidoException;

public class PetShop {
	private String razaoSocial;
	private String cnpj;
	private String email;
	private String uf;
	
	public PetShop(String razaoSocial, String cnpj, String email, String uf) throws SolicitanteInvalidoException{
		if(razaoSocial == null) {
			throw new SolicitanteInvalidoException("Razão Social deve ser preenchida");
			
		}
		if(cnpj == null) {
			throw new SolicitanteInvalidoException("CNPJ deve ser preenchido");
			
		}
		if(email == null) {
			throw new SolicitanteInvalidoException("E-mail deve ser preenchido");
			
		}
		if(uf == null) {
			throw new SolicitanteInvalidoException("UF deve ser preenchida");
			
		}
		
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.email = email;
		this.uf = uf;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(razaoSocial);
		sb.append(";");
		sb.append(cnpj);
		sb.append(";");
		sb.append(email);
		sb.append(";");
		sb.append(uf);
		
		return sb.toString();
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public String getEmail() {
		return email;
	}
	public String getUf() {
		return uf;
	}
}
