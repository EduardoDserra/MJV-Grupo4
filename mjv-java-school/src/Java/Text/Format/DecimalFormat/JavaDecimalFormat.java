package Java.Text.Format.DecimalFormat;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class JavaDecimalFormat {

	public static void main(String[] args) {

		/*
		 * A classe DecimalFormat faz parte do pacote java.text é usada quando necessita
		 * de mais precisão ou mais controle sobre a formatação, como formatar numeros
		 * em sequências especifica para uma localidade
		 */

		/*
		 * A DecimalFormat utiliza um Patterns e um padrão de simbolos
		 */

		DecimalFormat df1 = new DecimalFormat();
		df1.applyPattern("###,###.##");
		System.out.println(df1.format(1234567.891));

		DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.ENGLISH);
		dfs.setDecimalSeparator('.');
		dfs.setDecimalSeparator(',');
		String padrao = "###,###.##";
		DecimalFormat df2 = new DecimalFormat(padrao, dfs);
		System.out.println(df2.format(1234567.891));
	}

}
