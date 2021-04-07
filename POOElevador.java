import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Elevador painel = new Elevador();
        Scanner entrada = new Scanner(System.in);
        int pessoas = 0, capMx=0, andar=0, i=0, muda=0;
        
        System.out.print("Informe a capacidade maxima de pessoas do elevador: ");
        painel.capacidade(entrada.nextInt());
        
        System.out.print("Informe quantas pessoas entraram no elevador: ");
        painel.qtdP(entrada.nextInt());
        
        System.out.print("Informe quantos andares o predio possui desconsiderando o terreo: ");
        painel.andares(entrada.nextInt());
        
        painel.imprime_status();
        
        while(i == 0){
            System.out.println("Subir = 0");
            System.out.print("Descer = 1: ");
            if (entrada.nextInt() == 0)
                painel.sobe(1);
            else if(entrada.nextInt() == 1)
                painel.desce(1);
            else{
                System.out.println("Opção inválida!");
                break;
            }
            System.out.print("Quantas pessoas entraram? ");
            painel.entra(entrada.nextInt());
            System.out.print("Quantas pessoas sairam? ");
            painel.sai(entrada.nextInt());
            
            painel.imprime_status();
            
            System.out.print("Sair=0/continuar=1: ");
            if (entrada.nextInt() == 0)
                break;
        }
        
    }
}