import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner entradaS = new Scanner(System.in);
	    Scanner entrada = new Scanner(System.in);
	    VendaProduto vp;
	    vp = new VendaProduto();
	    
	    System.out.print("Produto: ");
	    vp.setdescrever(entradaS.nextLine());
	    
	    System.out.print("Quantidade: ");
	    vp.setquantidade(entrada.nextFloat());
	    
	    System.out.print("Preço por unidade: ");
	    vp.setpreco(entrada.nextFloat());
	    
	    System.out.print("Desconto em %: ");
	    vp.setdesconto(entrada.nextFloat());
	    
	    
		System.out.println("\n\nProduto: " + vp.getdescrever() + 
		"\nPreço por unidade: " + vp.getunidade() + 
		"\nQuantidade: " + vp.getquantidade() + 
		"\nDesconto de " + vp.getporcentagem() + "%: " + vp.getdesconto() + "  de " + (vp.getunidade()*vp.getquantidade()) +
		"R$\nValor: " + vp.getpreco() + "R$");
		
	}
}
