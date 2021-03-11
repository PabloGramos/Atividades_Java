import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int vetor1[] = new int[5],vetor2[] = new int[5],num=0, j=4;
	    Scanner add = new Scanner(System.in);
	    
	    for(int i=0;i<5;i++){
	        System.out.print("Digite o " +(i+1)+ " número do vetor: ");
	        num = add.nextInt();
	        vetor1[i] = num;
	        
	        vetor2[j] = num;
	        j -= 1;
	    }
	    for(int x=0;x<5;x++)
		    System.out.print(vetor1[x]);
        System.out.println("");
		for(int y=0;y<5;y++)
		    System.out.print(vetor2[y]);
	}
}
