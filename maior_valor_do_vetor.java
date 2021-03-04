import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random numAl = new Random();
        int[] vetor = new int[10];
        int numeros=0, j=0, valor=0;
        
        for(int i = 0;i < 10;i++){
            numeros = numAl.nextInt(100);
            vetor[i] = numeros;
            System.out.println(numeros);
        }
        while(true){
            if(j == 10)
                break;
            if(valor < vetor[j])
                valor = vetor[j];
            j += 1;
        }
        System.out.println("O maior número do vetor é " + valor);
        
    }
}