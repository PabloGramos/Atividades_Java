import java.util.Scanner;
public class Main
{
    public static void main (String [] args) {
        Celular c1;
        c1 = new Celular();
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite a carga atual do celular: ");
        c1.setcarga_atual(ler.nextInt());
        
        System.out.print("Digite a quantidade de armazenamento usada em Mb: ");
        c1.setarmazenamento_atual(ler.nextInt());
        
        System.out.println("Atualmente está com " + c1.getcarga_atual() +"% de carga e " + c1.getarmazenamento_atual() + "Mb de memoria utilizada.");
        
        
        System.out.println("\nCelular está desligado...");
        System.out.print("Ligar celular?(0=s/1=n) ");
        c1.setestado_power(ler.nextInt());
        
        System.out.print("Digite o tamanho do app que irá baixar em Mb: ");
        c1.setbaixar_app(ler.nextInt());
        
        System.out.print("Carregar celular?(0=s/1=n) ");
        c1.setmudar_carga(ler.nextInt());
        
        System.out.print("Digite a quantidade de tempo que usou o celular em horas: ");
        c1.setusar_app(ler.nextInt());
        
        
        if(c1.getcarga_atual() < 0){
            System.out.println("Atualmente está descarregado, com " + c1.getarmazenamento_atual() + "Mb de memoria utilizada ");
        }
        else{
            System.out.println("Atualmente está " +
            c1.getestado_power() + ", carga de " +
            c1.getcarga_atual() + "%, " + "memoria utilizada " + c1.getarmazenamento_atual() + "Mb");
        }
    
    }
}