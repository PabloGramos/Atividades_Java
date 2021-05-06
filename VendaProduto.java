public class VendaProduto{
    private String descricao[] = new String[100];
    private float valorUnidade[] = new float[100];
	private float vetorqtd[] = new float[100];
	private float vetorsoma[] = new float[100];
	private float qtd;
	private float valor;
	private float desconto;
	private float valorFinal;
	private float porcentagemDesconto;
	
	private int contador=0;
	
	public VendaProduto(){
        
	}
	
	
	public VendaProduto(String descricao, float qtd, float valor, float porcentagemDesconto){
	    this.setdescrever(descricao);
	    this.setquantidade(qtd);
	    this.setpreco(valor);
	    this.setdesconto(porcentagemDesconto);
	}
	
	public void setdescrever(String descricao){
	    this.descricao[this.contador] = descricao;
	    
	}
	
	public void setquantidade(float qtd){
	    this.qtd = qtd;
	    this.vetorqtd[this.contador] = qtd;
	}
	
	public void setpreco(float valor){
	    this.valor = this.valor + (valor * qtd);
	    this.vetorsoma[this.contador] = valor * qtd;
	    this.valorUnidade[this.contador] = valor;
	    
	}
	
	
	public void setdesconto(float porcentagemDesconto){
	    this.porcentagemDesconto = porcentagemDesconto;
	    this.desconto = this.valor * (porcentagemDesconto / 100);
	    this.valorFinal = this.valor - this.desconto;
	}
	
	public void contador(){
	    this.contador += 1;
	}
	
	public void status(){
	    System.out.println("\n|=================RECIBO=================");
	    for(int i=0; i<this.contador; i++){
	        System.out.println("|\n| Produto: " + this.descricao[i] + 
		    "\n| Preço por unidade: " + this.valorUnidade[i] + 
		    "\n| Quantidade: " + this.vetorqtd[i] + "\n| Soma: " + this.vetorsoma[i]);
	    }
	    System.out.println("|\n| Desconto de " + this.porcentagemDesconto + "%: " + this.desconto + "  de " + this.valor +
		"R$\n| Total a pagar: " + this.valorFinal + "R$\n|=======================================");
	    
	}
}





