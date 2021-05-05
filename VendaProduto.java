public class VendaProduto{
    private String descricao;
	private float qtd;
	private float valor;
	private float porcentagemDesconto;
	private float valorUnidade;
	
	public VendaProduto(){
        
	}
	
	public VendaProduto(String descricao, float qtd, float valor, float porcentagemDesconto){
	    this.setdescrever(descricao);
	    this.setquantidade(qtd);
	    this.setpreco(valor);
	    this.setdesconto(porcentagemDesconto);
	}
	
	public void setdescrever(String descricao){
	    this.descricao = descricao;
	}
	public String getdescrever(){
	    return this.descricao;
	}
	
	public void setquantidade(float qtd){
	    this.qtd = qtd;
	}
	
	public void setpreco(float valor){
	    this.valor = valor * qtd;
	    this.valorUnidade = valor;
	}
	
	
	public void setdesconto(float porcentagemDesconto){
	    this.porcentagemDesconto = this.valor * (porcentagemDesconto / 100);
	    this.valor = this.valor - this.porcentagemDesconto;
	}
	
	
	public float getpreco(){
	    return this.valor;
	}
	
	public float getquantidade(){
	    return this.qtd;
	}
	
	public float getdesconto(){
	    return this.porcentagemDesconto;
	}
	public float getunidade(){
	    return this.valorUnidade;
	}
	public float getporcentagem(){
	    return this.porcentagemDesconto;
	}
}