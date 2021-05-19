import java.util.Scanner;
public class Main {
    public static void main(String[] args){ 
	    Scanner entrada = new Scanner(System.in);
	    
        Pedido p2;
        MilkShake m2;
        
        m2 = new MilkShake();
        p2 = new Pedido();
        
        System.out.println("==========Menu do Milk Shake===========");
        System.out.println("Escolha o sabor: ");
        System.out.println("1 - Chocolate");
        System.out.println("2 - Morango");
        System.out.println("3 - Flocos");
        System.out.println("4 - Ovomaltine");
        System.out.print("====>");
        m2.setSabor(entrada.nextInt());
        
        System.out.println("Escolha o tamanho: ");
        System.out.println("1 - Grande 12,00R$: ");
        System.out.println("2 - Médio 9,00R$: ");
        System.out.println("3 - Pequeno 7,00R$: ");
        System.out.print("====>");
        m2.setTamanho(entrada.nextInt());
        p2.setEscolha(m2);
        
        System.out.print("Valor pago: ");
        p2.setPago(entrada.nextInt());
        
        System.out.println("\nO Sabor escolhido foi: " + p2.getEscolha().getSabor());
        System.out.println("O tamanho escolhido foi: " + p2.getEscolha().getTamanho());
        System.out.println("O preço é: " + p2.getEscolha().getPreco());
        System.out.println("Pago: " + p2.getPago());
        System.out.println("Troco: " + p2.getTroco());
    }
}