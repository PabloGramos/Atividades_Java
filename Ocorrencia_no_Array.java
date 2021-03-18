import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int matriz[][] = new int[3][4], repet=0;
	    Scanner entrada = new Scanner(System.in);
	    
	    for(int linha=0; linha<3; linha++){
	        for(int coluna=0; coluna<4; coluna++){
	            System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
	            matriz[linha][coluna]=entrada.nextInt();
	        }
	    }
	    for(int l=0; l<3; l++){
	        for(int c=0; c<4; c++){
	            if(matriz[l][c] == 2){
	                repet += 1;
	            }
	        }
	    }
	    if(repet == 0)
	        System.out.println("\nO número 2 não está presente no vetor");
	   else{
	       System.out.println("\nO número 2 está presente " + repet + " vezes no vetor");
	   }
	}
}