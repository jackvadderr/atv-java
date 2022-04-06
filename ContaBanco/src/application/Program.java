package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = leitor.nextInt();
		System.out.print("Enter account holder: ");
		leitor.nextLine();
		String holder = leitor.nextLine();
		System.out.print("Is tehere an initial deposit (y/n)?");
		char response = leitor.next().charAt(0);
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = leitor.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}else {
			account = new Account(number, holder);
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account.toString());
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = leitor.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);

		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = leitor.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);

		leitor.close();
	}
}
