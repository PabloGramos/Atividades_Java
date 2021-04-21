import java.util.Scanner;
public class Aprovação_de_alunos
{
	public static void main(String[] args) {
	    Scanner leituraF = new Scanner(System.in);
	    Scanner leituraS = new Scanner(System.in);
    	int numAlunos=0;
    	
    	System.out.print("Informe a quantidade de alunos: ");
    	numAlunos = leituraF.nextInt();
    	
    	String nome, alunos_resultado[][] = new String[numAlunos][2];
    	float Array_notas[][]= new float[numAlunos][3], nota1=0, nota2=0,media=0; 
	    
	    for(int i=0; i<numAlunos; i++){
	        System.out.print("\nNome do aluno "+(i+1)+": ");
	        nome = leituraS.nextLine();
	        alunos_resultado[i][0] = nome;
	        
	        System.out.print("Primeira nota do aluno "+(i+1)+": ");
	        nota1 = leituraF.nextFloat();
	        Array_notas[i][0] = nota1;
	        
	        System.out.print("Segunda nota do aluno "+(i+1)+": ");
	        nota2 = leituraF.nextFloat();
	        Array_notas[i][1] = nota2;
	        
	        media = (nota1+nota2)/2;
	        Array_notas[i][2] = media;
	        if(media >= 7){
	            alunos_resultado[i][1] = "Aprovado";
	        }
	        else{
	            alunos_resultado[i][1] = "Reprovado";
	        }
	    }
	    for(int j=0; j<numAlunos; j++){
	        System.out.println("\nAluno: "+alunos_resultado[j][0]+", Nota 1: "+Array_notas[j][0]+", Nota 2: "+Array_notas[j][1]+", MÃ©dia: "+Array_notas[j][2]+", SituaÃ§Ã£o: "+alunos_resultado[j][1]);
            
	    }
	    
	}
}
