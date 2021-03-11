import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner leitura = new Scanner(System.in);
	    float notas[] = new float[20], nota=0, media=0;
	    
	    for(int i=0; i<20; i++){
	        System.out.print("Digite a "+(i+1)+" nota: ");
	        nota = leitura.nextFloat();
	        notas[i] = nota;
	    }
	    for(int j=0; j<20; j++){
	        media = media + notas[j];
	    }
	    media = media/20;
	    System.out.printf("\nA média das notas é %.1f", media);
	    System.out.println("\n\nNotas abaixo da média...");
	    for(int l=0; l<20; l++){
	        if(notas[l] < media){
	            System.out.println(notas[l]);
	        }
	    }
	}
}
