package br.edu.infnet.app.assesmenteFinal.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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

public class ArquivoTest {
	public static void main(String[] args) {
		
		String arq = "encomendas.txt";
		String dir = "src\\br\\edu\\infnet\\app\\assesmenteFinal\\tests\\";
		
		try {
			FileReader fileR = new FileReader(dir + arq);
			BufferedReader leitura = new BufferedReader(fileR);
			
			FileWriter fileW = new FileWriter(dir + "out_" + arq);
			BufferedWriter escrita = new BufferedWriter(fileW);
			
			FileWriter fileLog = new FileWriter(dir + "log_" + arq);
			BufferedWriter escritaLog = new BufferedWriter(fileLog);
			
			String linha = leitura.readLine();
			String[] campos;
			
			List<ProdutosVet> lista = new ArrayList<ProdutosVet>();
			Encomenda encomenda = null;
			String descricao = null;
			String retiraSede = null;
			String razaoSocial = null;
			String cnpj = null;
			String email = null;
			String uf = null;
			
			List<String> logErro = new ArrayList<String>();
			int counter = 1;

			while(linha != null) {
				campos = linha.split(";");
				
				switch (campos[0].toUpperCase()){
				case "E":
					try {
						descricao = campos[1];
						retiraSede = campos[2];
						razaoSocial = campos[3];
						cnpj = campos[4];
						email = campos[5];
						uf = campos[6];
					}catch(ArrayIndexOutOfBoundsException e){
						System.out.println("[ERRO] " + e.getMessage());
					}
					break;
				case "B":
					try {
						Brinquedo brinquedo;
						brinquedo = new Brinquedo(campos[1], Float.valueOf(campos[2]), campos[3], campos[4]);
						brinquedo.setDimensoes(campos[5]);
						lista.add(brinquedo);
					} catch (Exception e) {
						logErro.add("ERRO no cadastro da linha " + counter);
					}
					break;
				case "R":
					try {
						Racao racao;
						racao = new Racao(campos[1],Float.valueOf(campos[2]),campos[3], Integer.valueOf(campos[4]));
						racao.setRacaoPrescrita(Boolean.valueOf(campos[5]));
						lista.add(racao);
					} catch (Exception e) {
						logErro.add("ERRO no cadastro da linha " + counter);
					}
					break;
				case "M":
					try {
						Medicamento medicamento;
						medicamento = new Medicamento(campos[1], Float.valueOf(campos[2]), campos[3], campos[4], campos[5], campos[6]);
						lista.add(medicamento);
					} catch (Exception e) {
						logErro.add("ERRO no cadastro da linha " + counter);
					}
					break;
				default:
					break;
				}
				linha = leitura.readLine();
				counter++;
			}
			
			try {
				PetShop petshop = new PetShop(razaoSocial,cnpj,email,uf);
				encomenda = new Encomenda(petshop, lista);
				encomenda.setDescricao(descricao);
				encomenda.setRetiraNaSede(Boolean.valueOf(retiraSede));
				escrita.write(encomenda.toString() + "\r\n");
				
				for(ProdutosVet prod : lista) {
					escrita.write("- " + prod.getNome() + "\r\n");
				}
				for(String log : logErro) {
					escritaLog.write(log + "\r\n");
				}
			}catch(SolicitanteInvalidoException | EncomendaSemPetShopException | EncomendaSemProdutoException e){
				System.out.println("[ERRO] " + e.getMessage());
			}			
			
			escrita.close();
			escritaLog.close();
			leitura.close();
			fileR.close();
		} catch (IOException e) {
			System.out.println("[ERRO] "+ e.getMessage());
		}
	}
}
