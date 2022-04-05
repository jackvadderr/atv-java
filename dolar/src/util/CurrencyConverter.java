package util;

public class CurrencyConverter {
	
	public static final double IOF = (1.06);
	
	public static double toConvert(double price, double reais) {
		return ((price * reais)*IOF);
	}
}
