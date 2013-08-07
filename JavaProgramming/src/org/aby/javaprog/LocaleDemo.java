package org.aby.javaprog;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import static java.lang.System.out;
public class LocaleDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale objectLocale;
		objectLocale = Locale.US;
		out.println(objectLocale);
		
		out.println(Locale.JAPAN);
		
		//Notice the ',' in France locale
		NumberFormat currencyFormatterFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		out.println(currencyFormatterFrance.format(50.12));
		
		NumberFormat currencyFormatterUs = NumberFormat.getCurrencyInstance(Locale.US);
		out.println(currencyFormatterUs.format(50.12));
		
		Date today = new Date();
		
		DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.LONG, Locale.JAPAN);
		out.println(dateFormatter.format(today));
		
		DateFormat dateFormatterUs = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
		out.println(dateFormatterUs.format(today));
		
		DateFormat dateFormatterFrance = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
		out.println(dateFormatterFrance.format(today));




	}

}
