package Escola;

import java.io.PrintStream;

public class Avaliacao {
	
	double nota1, nota2, nota3; 
		
	public Avaliacao(double nota1, double nota2, double nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public PrintStream calcMediaAritmetica (){
		double media = (nota1 + nota2 + nota3)/3;
		return System.out.printf("A média aritmética das três notas é %.2f",  media);
	}

	public PrintStream calcMediaPonderada () {
		double peso1 = 2;
		double peso2 = 3;
		double peso3 = 4;
		double media = (nota1*peso1 + nota2*peso2 + nota3*peso3) / (peso1 + peso2 + peso3);
		return System.out.printf("\nA média ponderada das três notas é %.2f", media);
	}
}
