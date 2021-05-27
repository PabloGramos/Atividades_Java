import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner entradaInt = new Scanner(System.in);
	    Scanner entradaStr = new Scanner(System.in);
	    Scanner entradaD = new Scanner(System.in);
	    
	    Hospedagem hpm = new Hospedagem();
	    Hospede hpd = new Hospede();
	    
	    System.out.print("Nome: ");
	    hpd.setNOME(entradaStr.nextLine());
	    System.out.print("CPF: ");
	    hpd.setCPF(entradaStr.nextLine());
	    System.out.print("Quantidade de diárias: ");
	    hpm.setQtdDiarias(entradaInt.nextInt());
	    System.out.print("Valor da diária: ");
	    hpm.setValorDiaria(entradaD.nextDouble());
		System.out.print("Valor de consumo: ");
		hpm.setConsumo(entradaD.nextDouble());
		
		//System.out.println("\nCliente: " + hpm.getHospedar().getNOME()); 
		//System.out.println("CPF: " + hpm.getHospedar().getCPF());
		hpd.status();
		System.out.println("Diárias: " + hpm.getQtdDiarias() );
		System.out.println("Valor da diária: " + hpm.getValorDiaria() + "R$" ); 
		System.out.println("Valor total: " + hpm.getServicos() + "R$");
		
	}
}
