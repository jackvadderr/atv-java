package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		//Product p = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = leitor.nextLine();
		
		System.out.print("Price: ");
		double price = leitor.nextDouble();
		
		
		Product product = new Product(name, price);
		product.setName("Computer"); //mudando o nome do produto
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Updated price: " + product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = leitor.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = leitor.nextInt();
		product.removeProductsint(quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		leitor.close();
	}
}
