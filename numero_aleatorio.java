import java.util.Scanner;
import java.util.Random;
public class Main
{
	public static void main(String[] args) {
		int chute=0;
		Scanner leia = new Scanner(System.in);
		Random rnd = new Random();
        int valor = rnd.nextInt(100);

		while(chute != valor){
		    System.out.print("Acerte o número de 0 a 100: ");
		    chute = leia.nextInt();
		    if (chute > valor){
		        System.out.println("Menor ");
		    }
		    else if (chute < valor){
		        System.out.println("Maior ");
		    }
		    else{
		        System.out.print("Acertou!");
		        break;
		    }
		}
	}
}
