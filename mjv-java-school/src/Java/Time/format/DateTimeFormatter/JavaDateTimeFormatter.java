package Java.Time.format.DateTimeFormatter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class JavaDateTimeFormatter {

	public static void main(String[] args) {
		
		// A classe java.time.format.DateTimeFormatter é utilizada pra formatção dos padrões de data.

		LocalDate now = LocalDate.now();
		LocalTime hoje = LocalTime.now();

		DateTimeFormatter dateTime1 = DateTimeFormatter.ofPattern("dd/MM/yy");
		System.out.println(dateTime1.format(now));

		DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dateTime.format(now));

		DateTimeFormatter dateTime2 = DateTimeFormatter.ofPattern("dd/MMMM/yy");
		System.out.println(dateTime2.format(now));

		DateTimeFormatter dateTimeE = DateTimeFormatter.ofPattern("dd/MMMM/yy", Locale.ENGLISH);
		System.out.println(dateTimeE.format(now));

		DateTimeFormatter dateTime3 = DateTimeFormatter.ofPattern("ww/MM/yy");
		System.out.println(dateTime3.format(now));
		
		//localizedDate
		DateTimeFormatter dateTime4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(dateTime4.format(now));

		DateTimeFormatter dateTime5 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(dateTime5.format(now));

		DateTimeFormatter dateTime6 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(dateTime6.format(now));

		DateTimeFormatter dateTime7 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(dateTime7.format(now));

		//localTime
		DateTimeFormatter dateTime10 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		System.out.println(dateTime10.format(hoje));

		DateTimeFormatter dateTime11 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(dateTime11.format(hoje));

	}

}
