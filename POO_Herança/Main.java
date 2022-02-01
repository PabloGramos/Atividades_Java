import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Escola");
		Scanner entrada = new Scanner(System.in);
		Scanner entradaD = new Scanner(System.in);
		Alunos all = new Alunos();
		Professor pro = new Professor();
		
		System.out.print("Nome do Professor: ");
		pro.setNome(entrada.nextLine());
		System.out.print("Identidade do Professor: ");
		pro.setIdentidade(entrada.nextLine());
		System.out.print("Salario do Professor: ");
		pro.setSalario(entradaD.nextDouble());
		System.out.print("Materia do Professor: ");
		pro.setMateria(entrada.nextLine());
		
		
		System.out.print("\nNome do Aluno: ");
		all.setNome(entrada.nextLine());
		System.out.print("Identidade do Aluno: ");
		all.setIdentidade(entrada.nextLine());
		System.out.print("Nota do Aluno: ");
		all.setNota(entradaD.nextDouble());
		System.out.print("Status do Aluno: ");
		all.setAprovacao(entrada.nextLine());
		
		
		
		
		
		System.out.println("\n" + pro.getNome() + " com a identidade: " + pro.getIdentidade() + ", trabalha com a materia de " + 
		pro.getMateria() + " e ganha " + pro.getSalario());
		System.out.println("\n" + all.getNome() + " com a identidade: " + all.getIdentidade() + ", teve nota " + 
		all.getNota() + " e sua situação é " + all.getAprovacao());
		
	}
}
