import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Elevador painel = new Elevador();
        Scanner entrada = new Scanner(System.in);
        int pessoas = 0, capMx=0, andar=0, i=0, muda=0;
        
        System.out.print("Informe a capacidade maxima de pessoas do elevador: ");
        painel.setcapacidade(entrada.nextInt());
        
        System.out.print("Informe quantas pessoas entraram no elevador: ");
        painel.setqtdP(entrada.nextInt());
        
        System.out.print("Informe quantos andares o predio possui desconsiderando o terreo: ");
        painel.setandares(entrada.nextInt());
        
        System.out.println("\n============Elevador============");
        System.out.println("Andar| " + painel.getterreo() + " |  Nº de Pessoas | " + painel.getpessoas() + " |");
        System.out.println("================================");
        
        while(i == 0){
            System.out.println("Subir = 0");
            System.out.print("Descer = 1: ");
            if (entrada.nextInt() == 0)
                painel.setsobe(1);
            else if(entrada.nextInt() == 1)
                painel.setdesce(1);
            else{
                System.out.println("Opção inválida!");
                break;
            }
            System.out.print("Quantas pessoas entraram? ");
            painel.setentra(entrada.nextInt());
            System.out.print("Quantas pessoas sairam? ");
            painel.setsai(entrada.nextInt());
            
            System.out.println("\n============Elevador============");
            System.out.println("Andar| " + painel.getterreo() + " |  Nº de Pessoas | " + painel.getpessoas() + " |");
            System.out.println("================================");
            
            System.out.print("Sair=0/continuar=1: ");
            if (entrada.nextInt() == 0)
                break;
        }
        
    }
}