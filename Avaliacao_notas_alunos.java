import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Notas validar = new Notas();
	    Scanner leituraF = new Scanner(System.in);
	    Scanner leituraS = new Scanner(System.in);
    	int numAlunos=0;
    	
    	System.out.print("Informe a quantidade de alunos: ");
    	numAlunos = leituraF.nextInt();
    	
    	
	    
	    for(int i=0; i<numAlunos; i++){
	        System.out.print("\nNome do aluno "+(i+1)+": ");
	        validar.setnome(leituraS.nextLine() , i);
	        
	        
	        System.out.print("Primeira nota do aluno "+(i+1)+": ");
	        validar.setnota1(leituraF.nextFloat() , i);
	        
	        
	        System.out.print("Segunda nota do aluno "+(i+1)+": ");
	        validar.setnota2(leituraF.nextFloat() , i);
	        
	        validar.setmedia(i);
	        
	    }
	    
	    validar.status();
	    
	    
	    
	}
}
