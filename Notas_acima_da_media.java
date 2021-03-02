import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
	    int qnt_notas, i=1, j=0;
	    float media=0;
		System.out.print("Digite a quantidade de notas que quer adicionar: ");
		qnt_notas = leia.nextInt();
		float[] notas = new float[qnt_notas];
		while(i <= qnt_notas){
		    System.out.print(i + " nota: ");
		    notas[j] = leia.nextFloat();
		    i += 1;
		    j += 1;
		}
		
		for( int x = 0; x <= qnt_notas - 1; x++){
		    
		    media = media + notas[x];
		}
		media = media/qnt_notas;
		System.out.println("\nA média das notas é " + media);
		
		System.out.println("\nNotas acima da média: ");
		for(int x = 0; x <= qnt_notas - 1; x++){
		    if(notas[x] > media){
		        System.out.println(notas[x]);
		    }
		}
		
		System.out.println("\nNotas abaixo da média: ");
		for(int x = 0; x <= qnt_notas - 1; x++){
		    if(notas[x] < media){
		        System.out.println(notas[x]);
		    }
		}
		
	}
}
