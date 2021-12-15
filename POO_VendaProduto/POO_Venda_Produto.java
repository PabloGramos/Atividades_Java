import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner entradaS = new Scanner(System.in);
	    Scanner entrada = new Scanner(System.in);
	    VendaProduto vp;
	    vp = new VendaProduto();
	    float opcao = 0, qtd = 0;
	    
	    System.out.println("=============Bem Vindo=============");
	    System.out.print("Quantidade de Produtos: ");
	    qtd = entrada.nextFloat();
	    
	    for(int i=0;i<qtd;i++){
	        System.out.print("\nProduto: ");
	        vp.setdescrever(entradaS.nextLine());
	    
	        System.out.print("Quantidade: ");
	        vp.setquantidade(entrada.nextFloat());
	    
	        System.out.print("Preço por unidade: ");
	        vp.setpreco(entrada.nextFloat());
	    
	        
	        
	        vp.contador();
	    }
	    System.out.print("\nDesconto em %: ");
	    vp.setdesconto(entrada.nextFloat());
	    
	    vp.status();
		
	}
}
