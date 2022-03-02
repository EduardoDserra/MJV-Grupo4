package output;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import model.Contrato;
import model.Servico;
import util.TextoUtil;

public class GeradorDeArquivo {

	public void geradorDeCsv(List<Contrato> contratos) {
		StringBuilder conteudo = new StringBuilder();
		for (Contrato ct : contratos) {
			conteudo.append(ct.getCadastro().getNome().concat(";").concat(ct.getCadastro().getCpf()));
			conteudo.append("\n");
		}


		Path path = Paths.get("C:\\Users\\edu-2\\git\\mjv-java-school\\agua-luz-output\\agua-luz-contrato.csv");

		try {
			Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void geradorDeTxt(List<Contrato> contratos) {
		StringBuilder conteudo = new StringBuilder();
		for (Contrato ct : contratos) {
			conteudo.append(" \n ");
			conteudo.append(TextoUtil.ajustar(ct.getCadastro().getCpf(), 11));
			conteudo.append(" \n ");
			conteudo.append(TextoUtil.ajustar(ct.getCadastro().getNome(), 30));
			conteudo.append(" \n ");
			conteudo.append(TextoUtil.ajustar(ct.getCadastro().getCelular(), 11));
			conteudo.append(" \n ");
			conteudo.append(TextoUtil.ajustar(ct.getCadastro().getEndereco().getLogradouro(), 20).toUpperCase());
			conteudo.append(" \n ");
			conteudo.append(TextoUtil.numero(ct.getCadastro().getEndereco().getNumero(),6));
			conteudo.append(" \n ");
			conteudo.append(TextoUtil.ajustar(ct.getCadastro().getEndereco().getComplemento(), 10).toUpperCase());
			conteudo.append(" \n ");
			conteudo.append(TextoUtil.ajustar(ct.getCadastro().getEndereco().getBairro(), 15).toUpperCase());
			conteudo.append(" \n ");
			conteudo.append(TextoUtil.ajustar(ct.getCadastro().getEndereco().getCidade(), 30).toUpperCase());
			conteudo.append(" \n ");
			conteudo.append(TextoUtil.ajustar(ct.getCadastro().getEndereco().getEstado(), 2).toUpperCase());
			conteudo.append(" \n ");
			conteudo.append(TextoUtil.ajustar(ct.getCadastro().getEndereco().getCep(), 8));
			conteudo.append(" \n ");
			conteudo.append(TextoUtil.converte(ct.getNumeroProtocolo(),10));
			conteudo.append(" \n ");
			conteudo.append(TextoUtil.daraEHora(ct.getDataHora()));
			conteudo.append(" \n ");
			conteudo.append(TextoUtil.agua(1));
			conteudo.append(" \n ");
			conteudo.append(TextoUtil.luz(1));
			conteudo.append(" \n ");
			
		


		}
		
		

		System.out.println(conteudo.toString());

		Path path = Paths.get("C:\\Users\\edu-2\\git\\mjv-java-school\\agua-luz-output\\agua-luz-contrato.txt");

		try {
			Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
