//2015112232백근주
//쉽게 사용할 수 있도록 부분적으로 사용하는 함수를 구현한다.
//다형성을 이용하여 long 매개변수뿐만아니라 double 매개변수도 사용할 수 있도록 구현한다.

package Simple;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.DecimalFormat;
import java.text.MessageFormat;

/** Specifies basic formatting for dates, integers, money, and people */
public class BasicFormat {
	public static String formatDate(Date date) {
		// BODY
		SimpleDateFormat dateFormat = new SimpleDateFormat("d MMM yyyy");
		
		return dateFormat.format(new GregorianCalendar(date.getYear(), date.getMonth(), date.getDay()).getTime());
	}

	/**
	 * Formats a date
	 * 
	 * @param year  Full integral value of the year, e.g. 1945, 2008
	 * @param month Zero-based month index, e.g. 0 is January, 6 is July
	 * @param day   One-based day of the month
	 */
	public static String formatDate(int year, int month, int day) {
		// BODY
		SimpleDateFormat dateFormat = new SimpleDateFormat("d MMM yyyy");
		return dateFormat.format(new GregorianCalendar(year, month, day).getTime());
	}

	public static String formatLong(long number) {
		// BODY
		DecimalFormat intFormat = new DecimalFormat("#,###");
		
		return intFormat.format(number);
	}
	
	public static String formatLong(double number) {
		// BODY
		DecimalFormat intFormat = new DecimalFormat("#,###");
		
		return intFormat.format(number);
	}

	public static String formatMoney(double amount) {
		// BODY
		DecimalFormat dollarFormat = new DecimalFormat("$ #,##0.##");
		
		return dollarFormat.format(amount);
	}

	public static String formatPerson(String firstName, String lastName, String userName) {
		// BODY
		MessageFormat personFormat = new MessageFormat("{0}, {1} [{2}]");
		
		return  personFormat.format(new Object[] { firstName, lastName, userName });
	}
}
