import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[10];
        int numeros=0, soma=0;
        
        for(int i = 0;i < 10;i++){
            System.out.print("Digite o numero "+(i+1)+": ");
            numeros = entrada.nextInt();
            vetor[i] = numeros;
        }
        
        for(int j = 0; j < 10; j++){
            soma = soma + vetor[j];
        }
        
        System.out.println("A soma dos valores do vetor é " + soma);
        
    }
}