import java.util.Scanner;
public class Main{
    public static void main (String [] args) {
        Controle TV = new Controle();
        int canal=0;
        Scanner entrada = new Scanner(System.in);
        int i=0;
        System.out.println("A TV está ligando... ");
        TV.programacao();
        System.out.println("canal padrão: 1, volume padrão 25.");
        while(i != 5){
            System.out.println("1 = + volume");
            System.out.println("2 = - volume");
            System.out.println("3 = + canal");
            System.out.println("4 = - canal");
            System.out.println("5 = Desligar");
            System.out.print("===>");
            i = entrada.nextInt();
            if(i == 1)
                TV.mais_volume(1);
            else if(i == 2)
                TV.menos_volume(1);
            else if(i == 3)
                TV.Pcanal(1);
            else if(i == 4)
                TV.Vcanal(1);
            else if(i == 5){
                TV.desligar();
                break;
            }
            else{
                System.out.println("Opção inválida!");
                break;
            }
            TV.programacao();
            TV.imprimeStatus();
        }
    
    }
}