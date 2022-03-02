package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import model.Servico;

public class TextoUtil {

	public static String preencher(String textoOriginal, int tamanhoMaximo) {
		String formato = "%-" + tamanhoMaximo + "s";
		String novaString = String.format(formato, textoOriginal);
		return novaString;
	}

	public static String cortar(String textoOriginal, int tamanhoMaximo) {
		String novaString = textoOriginal.substring(0, Math.min(tamanhoMaximo, textoOriginal.length()));
		return novaString;
	}

	public static String ajustar(String textoOriginal, int tamanhoMaximo) {
		String novaString = preencher(textoOriginal, tamanhoMaximo);
		novaString = textoOriginal.replaceAll("[().-]", "");
		novaString = cortar(novaString, tamanhoMaximo);

		return novaString;
	}

	public static String numero(String textoOriginal, int tamanhoMaximo) {
		String forma = ajustar(textoOriginal, tamanhoMaximo);
		forma = ("0000" + textoOriginal).substring(textoOriginal.length());
		return forma;

	}

	public static String converte(Long numero, int tamanhoMaximo) {
		String str = String.valueOf(numero);
		str = ajustar(str, tamanhoMaximo);
		str = ("0000000000" + str).substring(str.length());
		return str;
	}

	public static String daraEHora(Date data) {
		String str = new SimpleDateFormat("yyyy/MM/dd HH:mm").format(Calendar.getInstance().getTime());
		str = str.replaceAll("[/:]", "");
		return str;
	}

	public static String agua(int tamanhoMaximo) {

		Servico serv = Servico.AGUA;
		Double valor = serv.getValor();
		String servico = serv.getNome();
		String valorConvertido = String.valueOf(valor);
		valorConvertido = valorConvertido.replaceAll("[.]", "");
		String servicoCompleto;
		servico = ajustar(servico, tamanhoMaximo);
		valorConvertido = ("00000000" + valorConvertido).substring(valorConvertido.length());
		servicoCompleto = valorConvertido.concat(" \n ").concat(servico);
		return servicoCompleto;

	}

	public static String luz(int tamanhoMaximo) {

		Servico serv = Servico.LUZ;
		Double valor = serv.getValor();
		String servico = serv.getNome();
		String valorConvertido = String.valueOf(valor);
		valorConvertido = valorConvertido.replaceAll("[.]", "");
		String servicoCompleto;
		servico = ajustar(servico, tamanhoMaximo);
		valorConvertido = ("00000000" + valorConvertido).substring(valorConvertido.length());
		servicoCompleto = valorConvertido.concat(" \n ").concat(servico);
		return servicoCompleto;

	}

}
