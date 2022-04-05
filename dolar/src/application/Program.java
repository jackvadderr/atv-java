package application;

import java.util.Scanner;
import java.util.Locale;
import util.CurrencyConverter;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = leitor.nextDouble(); 
		System.out.print("How many dollars will be bought? ");
		double amount = leitor.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.toConvert(price, amount));
		leitor.close();
	}

}
