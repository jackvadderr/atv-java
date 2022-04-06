package entities; //Pacote da classe
public class triangle { //Nome da classe
	//Atributos da classe
	public double a; 
	public double b;
	public double c;
	
	//Método da classe
	public double area() {
		//Escopo do método
		double p = (a + b + c) / 2.0;
		return (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
	}
}