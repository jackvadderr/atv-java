package application;

import java.util.Locale;
import java.util.Scanner;

import entities.triangle;

class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in); 
		triangle x, y;
		x = new triangle();
		y = new triangle();
		
		//Entrada Triângulo X
		System.out.println("Enter the measures of triangle X: ");
		x.a = leitor.nextDouble();
		x.b = leitor.nextDouble();
		x.c = leitor.nextDouble();
		//Entrada Triângulo Y
		System.out.println("Enter the measures of triangle Y: ");
		y.a = leitor.nextDouble();
		y.b = leitor.nextDouble();
		y.c = leitor.nextDouble();
		
		//Cálculo da área do triângulo X
		double areaX =  x.area();
		//Cálculo da área do triângulo Y
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f\n", areaX);
		System.out.printf("Triangle Y area: %.4f\n", areaY);
		
		char maior = 0;
		if(areaX > areaY) {
			maior = 'X';
		}else if(areaY > areaX) {
			maior = 'Y';
		}
		System.out.printf("Larger area: %c\n", maior);
		leitor.close();
	}
}
