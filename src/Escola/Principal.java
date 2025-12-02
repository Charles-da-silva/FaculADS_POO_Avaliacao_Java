package Escola;

public class Principal {

	public static void main(String[] args) {
				
		Avaliacao avalMario = new Avaliacao (7,4,10);
				
		System.out.printf("A média aritmética das três notas inseridas é %.2f", avalMario.calcMediaAritmetica() );
		System.out.printf("\nA média ponderada das três notas inseridas é %.2f", avalMario.calcMediaPonderada());
	}

}
