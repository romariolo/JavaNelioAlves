package PooExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3Poo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Nome");
		aluno.nome = sc.nextLine();
		
		System.out.println("Nota 1 :");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Nota 2 :");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Nota 3 :");
		aluno.nota3 = sc.nextDouble();
		
		System.out.println("Média :");
		aluno.mediaAluno();
		System.out.println(aluno.mediaAluno());
		
		if(aluno.mediaAluno()>=60){
			
			System.out.println("Pass");
			System.out.println(aluno.mediaAluno());
		}else {
			System.out.println("Failed");
			System.out.println(aluno.mediaAluno());
			System.out.println("Faltou " + (aluno.mediaAluno()-60) + " pontos para passar");
			
		}
		
		
		
	}

}
