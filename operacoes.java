import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n1=0, n2=0, opcao=0, op=0;
	    float resul;
	    Scanner leia = new Scanner(System.in);
	    while(opcao < 5){
	        System.out.println("*****************************");
		    System.out.print("Digite um número: ");
		    n1 = leia.nextInt();
		    System.out.print("Digite outro número: ");
		    n2 = leia.nextInt();
		    System.out.println("1 - soma");
		    System.out.println("2 - subtração");
		    System.out.println("3 - multiplicação");
		    System.out.println("4 - divisão");
		    System.out.println("5 - sair ");
		    System.out.print("--> ");
		    opcao = leia.nextInt();
		    switch(opcao){
		        case 1:
		            resul = n1 + n2;
		            System.out.println(n1 + " + " + n2 + " = " + resul);
		            break;
		        case 2:
		            resul = n1 - n2;
		            System.out.println(n1 + " - " + n2 + " = " + resul);
		            break;
		        case 3:
		            resul = n1 * n2;
		            System.out.println(n1 + " x " + n2 + " = " + resul);
		            break;
		        case 4:
		            resul = n1 / n2;
		            System.out.println(n1 + " / " + n2 + " = " + resul);
		            break;
		        case 5:
		            break;
		        
		        default:
		            System.out.println("Escolha uma opção válida! ");
		            break;
		    }
		    System.out.print("Continuar? 0-Sim 1-Não...");
		    op = leia.nextInt();
		    if(op == 1){
		        break;
		    }
		    if(op == 0){
		        System.out.println("");
		    }
		    else{
		        System.out.println("Opção inválida!");
		        break;
		    }
		    
		    
		}
	}
}
