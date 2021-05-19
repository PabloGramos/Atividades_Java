
public class Produto {
    private int quantidade;
    private int quantidadeMinima;
    private float preco;
    private int estoque = 200;
    private Descrever descricao;
    
    public Produto(){
    }
    
    public Produto(Descrever descricao, int quantidade){
        this.setAssocia(descricao);
        this.setreporEstoque(quantidade);
        this.setdarBaixa(quantidade);
    }
    
    public void setAssocia(Descrever descricao){
        this.descricao = descricao;
    }
    public void setreporEstoque(int quantidade){
        this.quantidade = quantidade;
    }
    public void alterarPreco(float taxa){
        
    }
    public void setdarBaixa(int quantidade){
        
    }
    public boolean getprecisaRepor(){
        if(this.estoque <= quantidade)
            return true;
        else{
            return false;
        }
    }
    
    
}
