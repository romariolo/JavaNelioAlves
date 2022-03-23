package PooExercicios;

public class Aluno {

	String nome;
	double nota1;
	double nota2;
	double nota3;
	
	public double mediaAluno() {
		
		return (nota1+nota2+nota3) ;
		
	}
	
	public String resutado() {
		if(mediaAluno()>=60) {
			return "Parabéns! Vc foi aprovado";
		}else {
			return "Que pena, vc foi reprovado";
		}
		
	
	}
		
	public boolean aprovado() {
		if(mediaAluno()>=60) {
			return true;
		}else {
			return false;
		}
	}
}
