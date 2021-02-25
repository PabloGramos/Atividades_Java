import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] numeros;
        numeros = new int[ 10 ];
        for(int i = 0 ; i < numeros.length ; i++){
            numeros[i]= aleatorio.nextInt(100);
        }
        System.out.printf("%s %10s \n", "Index", "Valores");
        for(int i = 0; i < numeros.length; i++)
        System.out.printf("%3d %10d \n", i, numeros[ i ]);
        
        
        Arrays.sort(numeros);
        System.out.println("\n Valores em ordem crescente...\n");
        System.out.printf("%s %10s \n", "Index", "Valores");
        for(int i = 0; i < numeros.length; i++)
        System.out.printf("%3d %10d \n", i, numeros[i]);
    }
}