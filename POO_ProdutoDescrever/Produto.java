
public class Produto {
    private float quantidade;
    private float quantidadeMinima;
    private float preco = 10, valortotal;
    private float quantidadeDisponivel = 200;
    private Descrever descricao;
    
    public Produto(){
    }
    
    public Produto(Descrever descricao, float quantidade, float taxa){
        this.setAssocia(descricao);
        this.setalterarPreco(taxa);
        this.setQuantidadePedida(quantidade);
        this.setdarBaixa(quantidade);
    }
    
    public void setAssocia(Descrever descricao){
        this.descricao = descricao;
    }
    public Descrever getAssocia(){
        return this.descricao;
    }
    
    
    public void setQuantidadePedida(float quantidade){
        this.quantidade = quantidade;
    }
    public float getQuantidadePedida(){
        return this.quantidade;
    }
    
    
    public void reporEstoque(){
        this.quantidadeDisponivel = 200;
        System.out.println("\nEstoque lotado.");
    }
    
    
    public void setalterarPreco(float taxa){
        this.preco = taxa;
    }
    public float getalterarPreco(){
        return this.preco;
    }
    
    public float getvalorTotal(){
        this.valortotal = this.preco * this.quantidade;
        return this.valortotal;
    }
    public float getquantidadeDisponivel(){
        return this.quantidadeDisponivel;
    }
    
    
    public void setdarBaixa(float quantidade){
        this.quantidadeDisponivel = this.quantidadeDisponivel - quantidade;
    }
    
    
    public boolean getprecisaRepor(){
        if(this.quantidadeDisponivel <= quantidade)
            return true;
        else{
            return false;
        }
    }
    
    
    public void registroVenda(){
        System.out.println("===================================");
        System.out.println("Venda realizada: " + this.quantidade);
        System.out.println("Estoque: " + (this.quantidadeDisponivel - quantidade));
        System.out.println("===================================");

    }
}
