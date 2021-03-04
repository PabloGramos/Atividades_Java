import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[10];
        int numeros=0, j=0, valor=0,cont=0, i=1;
        
        while(cont == 0){
            System.out.print("Digite o numero "+(i)+": ");
            numeros = entrada.nextInt();
            vetor[i] = numeros;
            System.out.print("Continuar? 0=Sim ou 1=Não... ");
            cont = entrada.nextInt();
            if(cont == 1)
                break;
            
            i += 1;
        }
        while(true){
            if(j == 10)
                break;
            if(valor < vetor[j])
                valor = vetor[j];
            j += 1;
        }
        System.out.println("O maior número digitado é " + valor);
        
    }
}