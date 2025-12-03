package Escola;

public class Aluno {
	
	String nome, curso;
	Avaliacao notas;
	
	public Aluno(String nome, String curso, Avaliacao notas) {
		this.nome = nome;
		this.curso = curso;
		this.notas = notas;
	}
	
	public void info () {
		System.out.println("Seguem os dados do aluno " + nome);
		System.out.println("Curso: " + curso);
		System.out.printf("Nota 1: %.2f\n", notas.nota1);
		System.out.printf("Nota 2: %.2f\n", notas.nota2);
		System.out.printf("Nota 3: %.2f\n", notas.nota3);
		notas.calcMediaAritmetica();
		notas.calcMediaPonderada();
	}

}
