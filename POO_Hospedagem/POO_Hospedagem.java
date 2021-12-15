import java.util.Scanner;
public class Main {
    
	public static void main(String[] args) {
	    Scanner entradaInt = new Scanner(System.in);
	    Scanner entradaStr = new Scanner(System.in);
	    Scanner entradaDoub = new Scanner(System.in);
	    
	    Hospedagem hdm = new Hospedagem();
	    Hospede hpd = new Hospede();
	    
	    System.out.print("Nome: ");
	    hpd.setNome(entradaStr.nextLine());
	    System.out.print("Digite o CPF: ");
	    hpd.setCpf(entradaStr.nextLine());
	    hdm.setHospedar(hpd);
	    System.out.print("Quantidade de diárias: ");
	    hdm.setQtdDiarias(entradaInt.nextInt());
	    System.out.print("Valor da diária: ");
	    hdm.setValorDiaria(entradaDoub.nextDouble());
		System.out.print("Valor de consumo: ");
		hdm.setConsumo(entradaDoub.nextDouble());
	}
}