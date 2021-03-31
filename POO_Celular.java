import java.util.Scanner;
public class Main{
    public static void main (String [] args) {
        Celular celular = new Celular();
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite a carga atual do celular: ");
        celular.carga_atual(ler.nextInt());
        
        System.out.print("Digite a quantidade de armazenamento usada em Mb: ");
        celular.armazenamento_atual(ler.nextInt());
        
        celular.imprimeStatus1();
        
        
        System.out.println("\nCelular está desligado...");
        System.out.print("Ligar celular?(0=s/1=n) ");
        celular.estado_power(ler.nextInt());
        
        System.out.print("Digite o tamanho do app que irá baixar em Mb: ");
        celular.baixar_app(ler.nextInt());
        
        System.out.print("Carregar celular?(0=s/1=n) ");
        celular.mudar_carga(ler.nextInt());
        
        System.out.print("Digite a quantidade de tempo que usou o celular em horas: ");
        celular.usar_app(ler.nextInt());
        celular.imprimeStatus2();
        
        
    }
}