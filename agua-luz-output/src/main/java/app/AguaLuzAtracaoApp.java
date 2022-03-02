package app;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.List;

import model.Contrato;
import model.Endereco;
import model.Pais;
import model.Pessoa;
import model.Servico;
import output.GeradorDeArquivo;
import repository.ContratoRepository;

public class AguaLuzAtracaoApp  {
	private static ContratoRepository contratoRepositorio = new ContratoRepository();
	public static void main(String[] args) throws AWTException {
		faseAtracao();
		faseGeracaoArquivo();
	}
	
	private static void faseGeracaoArquivo() throws AWTException  {
		List<Contrato> contratos = contratoRepositorio.listarTodos();
		for(Contrato ct : contratos) {
			GeradorDeArquivo gerador = new GeradorDeArquivo();
			gerador.geradorDeCsv(contratos);
			gerador.geradorDeTxt(contratos);
		}
	}
	
	private static void faseAtracao() {

		Contrato contrato1 = new Contrato();
		contrato1.setNumeroProtocolo(2022025687);
		contrato1.setServico(Servico.LUZ);

		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("234.765.987-27");
		pessoa.setNome("Gleyson Sampaio de Oliveira");
		pessoa.setRg("89789");
		pessoa.setPais(Pais.BRASIL);

		pessoa.setCelular("(11)98965498760");

		Endereco endereco = new Endereco();
		endereco.setBairro("Santo Antonio");
		endereco.setCep("27.310-657");
		endereco.setCidade("São Paulo");
		endereco.setEstado("SP");
		endereco.setLogradouro("Rua das Marias, 243");
		endereco.setComplemento("Ap 207, Bloco C");
		endereco.setNumero("243");
		pessoa.setEndereco(endereco);
		contrato1.setCadastro(pessoa);
		contrato1.setDataHora(new Date());
		
		contratoRepositorio.gravar(contrato1);
		
		Contrato contrato2 = new Contrato();
		contrato2.setNumeroProtocolo(1984365);
		contrato2.setServico(Servico.LUZ);

		Pessoa pessoa2 = new Pessoa();
		pessoa2.setCpf("007.324.223.21");
		pessoa2.setNome("Raimundo Nonato Loureiro Castelo Branco");
		pessoa2.setRg("43212");
		pessoa2.setCelular("(11)99768-1515");
		pessoa2.setPais(Pais.BRASIL);

		Endereco endereco2 = new Endereco();
		endereco2.setBairro("São Sebastião");
		endereco2.setCep("07.210.715");
		endereco2.setCidade("São Raimundo Nonato");
		endereco2.setEstado("Sp");
		endereco2.setLogradouro("Rua Sebastião Firmino");
		endereco2.setNumero("123");
		endereco2.setComplemento("AP 210 BL CENTAURO");
		pessoa2.setEndereco(endereco2);
		contrato2.setCadastro(pessoa2);
		contrato2.setDataHora(new Date());
		
		contratoRepositorio.gravar(contrato2);
	}
	
	
}
