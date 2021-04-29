public class Main
{
	public static void main(String[] args) {
	    VendaProduto vp;
	    vp = new VendaProduto();
	    
	    vp.setdescrever("Arroz");
	    vp.setquantidade(2);
	    vp.setpreco(20);
	    vp.setdesconto(20);
	    
		System.out.println("Produto: " + vp.getdescrever() + "\nQuantidade: " + vp.getquantidade() + "\nDesconto de 20%: " + 
		vp.getdesconto() + "R$\nValor: " + vp.getpreco() + "R$");
		
	}
}
