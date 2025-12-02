package Escola;

public class Avaliacao {
	
	double nota1, nota2, nota3; 
		
	public Avaliacao(double nota1, double nota2, double nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public double calcMediaAritmetica (){
		return (nota1 + nota2 + nota3)/3;
	}

	public double calcMediaPonderada () {
		double peso1 = 2;
		double peso2 = 3;
		double peso3 = 4;
		return (nota1*peso1 + nota2*peso2 + nota3*peso3) / (peso1 + peso2 + peso3);
	}
}
